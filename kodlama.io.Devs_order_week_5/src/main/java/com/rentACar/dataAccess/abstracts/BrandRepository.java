package com.rentACar.dataAccess.abstracts;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentACar.entities.concretes.Brand;


public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
