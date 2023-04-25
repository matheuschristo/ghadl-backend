package com.ghadl.service;

import com.ghadl.dto.bag.CreateBagDTO;

public interface BagService {
	
	CreateBagDTO save(CreateBagDTO dto);
	
	void delete(Long id);

}
