package com.ghadl.service;

import com.ghadl.dto.product.CreateProductDTO;
import com.ghadl.dto.product.ProductDTO;

public interface ProductService {

	CreateProductDTO save(CreateProductDTO dto);
	
	void update(ProductDTO dto, Long id);
	
	void delete(long id);
}
