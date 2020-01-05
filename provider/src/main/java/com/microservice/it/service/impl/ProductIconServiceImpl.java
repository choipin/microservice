package com.microservice.it.service.impl;

import com.microservice.it.dao.ProductIconDao;
import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.entity.ProductIcon;
import com.microservice.it.service.ProductIconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductIconServiceImpl implements ProductIconService {

    @Autowired
    private ProductIconDao productIconDao;
    @Override
    public PageVO<ProductIcon> queryProductPage(PageParam pageParam) {
        List<ProductIcon> rows = productIconDao.queryProductPage(pageParam);
        Long total = productIconDao.countTotalProduct();
        return new PageVO<>(total,rows);
    }

    @Override
    public void insertProductIcon(ProductIcon productIcon) {
        productIconDao.insertProductIcon(productIcon);
    }

    @Override
    public void updateProductIcon(ProductIcon productIcon) {
        productIconDao.updateProductIcon(productIcon);
    }

    @Override
    public ProductIcon getProductIconById(Long productId) {
        return productIconDao.getProductIconById(productId);
    }

    @Override
    public void deleteProductIconById(Long productId) {
        productIconDao.deleteProductIconById(productId);
    }
}
