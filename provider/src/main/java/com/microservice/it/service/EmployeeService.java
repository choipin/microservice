package com.microservice.it.service;

import com.microservice.it.entity.Employee;
import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.entity.ProductIcon;

import java.util.List;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/1
 * @author: Wenxin
 * @version: 1.0
 */
public interface EmployeeService {

    PageVO<Employee> queryEmployeePage(PageParam pageParam);

    void  insertEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee getEmployeeById(Long empNo);

    void deleteEmployeeById(Long empNo);
}
