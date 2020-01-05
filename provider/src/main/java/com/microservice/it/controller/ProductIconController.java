package com.microservice.it.controller;

import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.entity.ProductIcon;
import com.microservice.it.service.ProductIconService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductIconController {

    @Autowired
    private ProductIconService productIconService;

    @ApiOperation("按id查询")
    @GetMapping("/provider/productIcon/{id}")
    public ProductIcon getProductIconById(@PathVariable("id") long id) {
        return productIconService.getProductIconById(id);
    }

    @ApiOperation("按id删除")
    @DeleteMapping("/provider/productIcon/{id}")
    public void deleteProductIconById(@PathVariable("id") long id) {
        productIconService.deleteProductIconById(id);
    }

    @ApiOperation("分页查询")
    @PatchMapping("/provider/productIcon")
    public PageVO<ProductIcon> getProductIconByPage(@RequestBody PageParam pageParam) {
        return productIconService.queryProductPage(pageParam);
    }

    @ApiOperation("插入")
    @PutMapping("/provider/productIcon")
    public void insertProductIcon(@RequestBody ProductIcon productIcon) {
        productIconService.insertProductIcon(productIcon);
    }

    @ApiOperation("更新")
    @PostMapping("/provider/productIcon")
    public void updateProductIcon(@RequestBody ProductIcon productIcon) {
        productIconService.updateProductIcon(productIcon);
    }
}
