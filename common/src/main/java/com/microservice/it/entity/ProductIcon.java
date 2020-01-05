package com.microservice.it.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/1
 * @author: Wenxin
 * @version: 1.0
 */
@Data
@ApiModel
public class ProductIcon implements Serializable {

    @ApiModelProperty("主健")
    private Long productId;

    @ApiModelProperty("商品名称")
    private String productName;

    @ApiModelProperty("单价")
    private Long productPrice;

    @ApiModelProperty("库存")
    private Integer productStock;

    @ApiModelProperty("描述")
    private String productDescription;

    @ApiModelProperty("小图")
    private String productIcon;

    @ApiModelProperty("商品状态,0正常1下架")
    private Integer productStatus;

    @ApiModelProperty("类目编号")
    private Integer categoryType;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("修改时间")
    private Date updateTime;
}
