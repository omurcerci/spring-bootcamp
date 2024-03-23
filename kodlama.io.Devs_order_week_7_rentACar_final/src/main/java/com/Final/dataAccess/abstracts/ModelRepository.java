package com.Final.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer>{

}
