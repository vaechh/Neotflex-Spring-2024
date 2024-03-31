package com.springboot.microservice.salarycalc.springbootmicroservicesalarycalc;

public class SalaryCalculationBean {
    private Long answer;

    public SalaryCalculationBean(){

    }

    public SalaryCalculationBean(Long salary, Long dayOffs){
        super();
        this.answer = salary / 30 * dayOffs;
    }

    public Long getAnswer() {
        return answer;
    }

}