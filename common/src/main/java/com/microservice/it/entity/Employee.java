package com.microservice.it.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

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
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    @ApiModelProperty("雇员id")
    private Long empNo;

    @ApiModelProperty("雇员姓")
    private String firstName;

    @ApiModelProperty("雇员名")
    private String lastName;

    @ApiModelProperty("雇员性别")
    private String gender;

    @ApiModelProperty("雇员出生日期")
    private Date birthDate;

    @ApiModelProperty("雇员入职日期")
    private Date hireDate;
}
