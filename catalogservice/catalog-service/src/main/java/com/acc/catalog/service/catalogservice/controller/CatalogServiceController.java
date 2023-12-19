package com.acc.catalog.service.catalogservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.acc.catalog.service.catalogservice.model.Inventory;
import com.acc.catalog.service.catalogservice.services.CatalogService;

@RestController
public class CatalogServiceController {

	@Autowired
	CatalogService catalogService;

	// creating a get mapping that retrieves all the catalog detail from the database
	@GetMapping("/catalog")
	private List<Inventory> getAllItems() {
		return catalogService.getAllItems();
	}

	// creating a get mapping that retrieves the detail of a specific catalog
	@GetMapping("/catalog/{type}")
	private Inventory getInventory(@PathVariable("type") String type) {
		return catalogService.getInventoryByType(type);
	}


}
