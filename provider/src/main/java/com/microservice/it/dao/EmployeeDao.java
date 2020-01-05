package com.microservice.it.dao;

import com.microservice.it.entity.Employee;
import com.microservice.it.entity.PageParam;
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
public interface EmployeeDao {

    List<Employee> queryEmployeePage(PageParam pageParam);

    Long countTotalEmployee();

    void  insertEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee getEmployeeById(Long empNo);

    void deleteEmployeeById(Long empNo);
}
