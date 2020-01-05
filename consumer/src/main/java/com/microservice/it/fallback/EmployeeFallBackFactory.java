package com.microservice.it.fallback;

import com.microservice.it.entity.Employee;
import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.service.EmployeeService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class EmployeeFallBackFactory implements FallbackFactory<EmployeeService> {
    @Override
    public EmployeeService create(Throwable cause) {
        return new EmployeeService() {
            @Override
            public PageVO<Employee> listEmployeeByPage(PageParam pageParam) {
                return null;
            }

            @Override
            public Employee getEmployeeById(Long id) {
                return new Employee(100l,"温","馨","男",new Date(),new Date());
            }

            @Override
            public void updateEmployee(Employee employee) {

            }

            @Override
            public void insertEmployee(Employee employee) {

            }

            @Override
            public void deleteEmployee(Long id) {

            }
        };
    }
}
