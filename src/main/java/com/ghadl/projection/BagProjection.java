package com.ghadl.projection;

import java.util.List;

public interface BagProjection {

	Long getId();
	
	UserProjection getUser();
	
	List<ProductProjection> getProducts();
}
