package com.microservice.it.controller;

import com.microservice.it.entity.Employee;
import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/1
 * @author: Wenxin
 * @version: 1.0
 */
@RestController
@Api
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation("")
    @PostMapping("/provider/employee/page")
    public PageVO<Employee> listEmployeeByPage(@RequestBody PageParam pageParam){
        return employeeService.queryEmployeePage(pageParam);
    }

    @ApiOperation("")
    @GetMapping("/provider/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id")Long id){
        return employeeService.getEmployeeById(id);
    }

    @ApiOperation("")
    @PutMapping("/provider/employee")
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @ApiOperation("")
    @PostMapping("/provider/employee")
    public void insertEmployee(@RequestBody Employee employee){
        employeeService.insertEmployee(employee);
    }

    @ApiOperation("")
    @DeleteMapping("/provider/employee/{id}")
    public void deleteEmployee(@PathVariable("id")Long id){
        employeeService.deleteEmployeeById(id);
    }
}
