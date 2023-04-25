package com.ghadl.mapper;

import org.springframework.stereotype.Service;

import com.ghadl.dto.product.CreateProductDTO;
import com.ghadl.entity.ProductEntity;

@Service
public class ProductMapper {

	public CreateProductDTO toDTO(ProductEntity product) {
		return new CreateProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice());
	}
	
	public ProductEntity toEntity(CreateProductDTO dto) {
		return new ProductEntity(dto.id(), dto.name(), dto.description(), dto.price(), null);
	}
}
