package com.ghadl.service;

import com.ghadl.dto.sale.CreateSaleDTO;

public interface SaleService {
	
	CreateSaleDTO save(CreateSaleDTO dto);
	
	void delete(Long id);

}
