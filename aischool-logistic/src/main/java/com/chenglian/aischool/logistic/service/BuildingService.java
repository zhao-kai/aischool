package com.chenglian.aischool.logistic.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.chenglian.aischool.logistic.entity.Building;

public interface BuildingService {

	public List<Building> findAllBuildings();

	public Page<Building> findBuildingNoCriteria(Pageable pageable);

	public Page<Building> findBuildingCriteria(Pageable pageable, Building BuildingQuery);
}
