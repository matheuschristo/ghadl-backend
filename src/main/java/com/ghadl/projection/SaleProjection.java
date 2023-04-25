package com.ghadl.projection;

import java.util.List;

public interface SaleProjection {

	Long getId();
	
	Double getAmount();
	
	UserProjection getUser();
	
	List<ProductProjection> getProducts();
}
