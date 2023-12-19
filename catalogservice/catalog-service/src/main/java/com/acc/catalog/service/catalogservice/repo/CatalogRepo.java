package com.acc.catalog.service.catalogservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acc.catalog.service.catalogservice.model.Inventory;

@Repository
public interface CatalogRepo extends JpaRepository<Inventory, Integer> {


	Inventory findByItemType(String type);
}
