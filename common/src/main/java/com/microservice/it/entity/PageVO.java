package com.microservice.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/1
 * @author: Wenxin
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVO<T> {

    private Long total;
    private List<T> rows;
}
