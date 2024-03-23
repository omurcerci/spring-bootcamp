package com.rentACarMapping.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentACarMapping.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
