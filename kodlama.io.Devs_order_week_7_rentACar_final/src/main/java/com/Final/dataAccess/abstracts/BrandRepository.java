package com.Final.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Final.entity.concretes.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
	boolean existsByName(String name); // spring Jpa keywords
	
}
