package com.microservice.it.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/1
 * @author: Wenxin
 * @version: 1.0
 */
@Data
@Accessors(chain = true)
public class PageParam {

    @Min(1)
    private Long page;

    @Min(1)
    private Long size;

    private Long index = (page-1)*size;
}
