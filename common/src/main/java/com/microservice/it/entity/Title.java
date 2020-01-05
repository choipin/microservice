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
public class Title implements Serializable {

    @ApiModelProperty("文献id")
    private Long empNo;

    @ApiModelProperty("文献内容")
    private String title;

    @ApiModelProperty("文献开始日期")
    private Date fromDate;

    @ApiModelProperty("文献结束日期")
    private Date toDate;
}
