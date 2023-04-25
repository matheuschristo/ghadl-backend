package com.ghadl.dto.sale;

import java.util.List;

public record CreateSaleDTO(Long id, List<Long> products, Long user, Double amount) {

}
