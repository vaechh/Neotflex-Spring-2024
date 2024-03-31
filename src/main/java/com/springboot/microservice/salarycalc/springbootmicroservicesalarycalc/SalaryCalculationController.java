package com.springboot.microservice.salarycalc.springbootmicroservicesalarycalc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SalaryCalculationController {
    @Autowired
    private Environment environment;

    @GetMapping("/calculate/salary/{salary}/dayoffs/{dayoffs}")
    public SalaryCalculationBean calcSalary(@PathVariable Long salary, @PathVariable Long dayoffs) {
        return new SalaryCalculationBean(salary, dayoffs);
    }
}
