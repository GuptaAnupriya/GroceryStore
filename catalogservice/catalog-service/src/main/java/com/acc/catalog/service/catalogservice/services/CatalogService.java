package com.acc.catalog.service.catalogservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.catalog.service.catalogservice.model.Inventory;
import com.acc.catalog.service.catalogservice.repo.CatalogRepo;

@Service
public class CatalogService {


	@Autowired
CatalogRepo catalogRepo;

	public List<Inventory> getAllItems() {

		return catalogRepo.findAll();
	}

	public Inventory getInventoryByType(String type) {
		return catalogRepo.findByItemType(type);
	}

}
