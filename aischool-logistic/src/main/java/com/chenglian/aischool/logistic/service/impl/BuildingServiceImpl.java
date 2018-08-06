package com.chenglian.aischool.logistic.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.chenglian.aischool.logistic.dao.BuildingRepository;
import com.chenglian.aischool.logistic.entity.Building;
import com.chenglian.aischool.logistic.service.BuildingService;

@Service("buildingService")
public class BuildingServiceImpl implements BuildingService {

	@Autowired
	private BuildingRepository buildingRepository;

	@Override
	public List<Building> findAllBuildings() {
		return this.buildingRepository.findAll(Sort.by(Direction.DESC, "id"));
	}

	@Override
	public Page<Building> findBuildingNoCriteria(Pageable pageable) {
		// Pageable pageable = new PageRequest(page, size,
		// Sort.Direction.DESC,"id");

		return buildingRepository.findAll(pageable);

	}

	@Override
	public Page<Building> findBuildingCriteria(Pageable pageable, final Building BuildingQuery) {
		@SuppressWarnings("serial")
		Page<Building> BuildingPage = buildingRepository.findAll(new Specification<Building>() {
			@Override
			public Predicate toPredicate(Root<Building> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> list = new ArrayList<Predicate>();

				if (null != BuildingQuery.getDelFlag() && !"".equals(BuildingQuery.getDelFlag())) {// 逻辑删除标记
					list.add(criteriaBuilder.equal(root.get("delFlag").as(String.class), BuildingQuery.getDelFlag()));
				} else {
					BuildingQuery.setDelFlag("0");// 只读取正常状态的记录，0-正常，1-删除
					list.add(criteriaBuilder.equal(root.get("delFlag").as(String.class), BuildingQuery.getDelFlag()));
				}

				if (null != BuildingQuery.getJzwmc() && !"".equals(BuildingQuery.getJzwmc())) {// 建筑物名称

					if (BuildingQuery.getJzwmc().indexOf("%") != -1) {
						list.add(criteriaBuilder.like(root.get("jzwmc").as(String.class), BuildingQuery.getJzwmc()));// 模糊查询
					} else {
						list.add(criteriaBuilder.equal(root.get("jzwmc").as(String.class), BuildingQuery.getJzwmc()));// 精准查询
					}

				}
				Predicate[] p = new Predicate[list.size()];
				return criteriaBuilder.and(list.toArray(p));
			}
		}, pageable);
		return BuildingPage;
	}
}
