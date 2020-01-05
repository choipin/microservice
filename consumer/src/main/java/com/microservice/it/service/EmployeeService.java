package com.microservice.it.service;

import com.microservice.it.entity.Employee;
import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.fallback.EmployeeFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "PROVINDER",fallbackFactory = EmployeeFallBackFactory.class)
public interface EmployeeService {

    @RequestMapping(value = "/provider/employee/page",method = RequestMethod.POST)
    public PageVO<Employee> listEmployeeByPage(@RequestBody PageParam pageParam);

    @RequestMapping(value = "/provider/employee/{id}",method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id")Long id);

    @RequestMapping(value = "/provider/employee",method = RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee);

    @RequestMapping(value = "/provider/employee",method = RequestMethod.POST)
    public void insertEmployee(@RequestBody Employee employee);

    @RequestMapping(value = "/provider/employee/{id}",method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("id")Long id);
}
