package com.ghadl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghadl.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

}
