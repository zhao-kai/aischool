package com.chenglian.aischool.logistic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenglian.aischool.logistic.entity.Building;
import com.chenglian.aischool.logistic.json.Json;
import com.chenglian.aischool.logistic.service.BuildingService;

/**
 * 建筑物控制层
 * 
 * @author Daniel.Zhao
 *
 */
@RestController
@RequestMapping("building")
public class BuildingController {

	@Autowired
	private BuildingService buildingService;

	@GetMapping("buildingList")
	public Json<Building> findAllBuildings() {
		List<Building> buildings = this.buildingService.findAllBuildings();
		return new Json(true, "0", "查询操作成功", buildings);
	}

	@GetMapping("buildingPage")
	public Json<Building> findBuildingNoCriteria(
			@PageableDefault(value = 10, sort = { "id" }, direction = Sort.Direction.DESC) Pageable pageable) {

		Page<Building> buildings = this.buildingService.findBuildingNoCriteria(pageable);
		return new Json(true, "0", "无条件分页查询成功", buildings);
	}

	@GetMapping("buildingPageCriteria")
	public Json<Building> findBuildingCriteria(Pageable pageable, Building BuildingQuery) {
		Page<Building> buildings = this.buildingService.findBuildingCriteria(pageable, BuildingQuery);
		return new Json(true, "0", "条件分页查询操作成功", buildings);
	}
}
