package com.microservice.it.service.impl;

import com.microservice.it.dao.EmployeeDao;
import com.microservice.it.entity.Employee;
import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/1
 * @author: Wenxin
 * @version: 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public PageVO<Employee> queryEmployeePage(PageParam pageParam) {
        Long total = employeeDao.countTotalEmployee();
        List<Employee> rows = employeeDao.queryEmployeePage(pageParam);
        return new PageVO<Employee>(total,rows);
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(Long empNo) {
        return employeeDao.getEmployeeById(empNo);
    }

    @Override
    public void deleteEmployeeById(Long empNo) {
        employeeDao.deleteEmployeeById(empNo);
    }
}
