package com.microservice.it.service;

import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.entity.ProductIcon;

import java.util.List;

public interface ProductIconService {

    PageVO<ProductIcon> queryProductPage(PageParam pageParam);

    void insertProductIcon(ProductIcon productIcon);

    void updateProductIcon(ProductIcon productIcon);

    ProductIcon getProductIconById(Long productId);

    void deleteProductIconById(Long productId);
}
