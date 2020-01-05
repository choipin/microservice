package com.microservice.it.dao;

import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.ProductIcon;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/1
 * @author: Wenxin
 * @version: 1.0
 */
@Component
@Mapper
public interface ProductIconDao {

    List<ProductIcon> queryProductPage(PageParam pageParam);

    Long countTotalProduct();

    void insertProductIcon(ProductIcon productIcon);

    void updateProductIcon(ProductIcon productIcon);

    ProductIcon getProductIconById(Long productId);

    void deleteProductIconById(Long productId);
}
