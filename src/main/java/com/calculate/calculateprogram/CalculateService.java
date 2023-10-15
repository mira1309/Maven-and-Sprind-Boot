package com.calculate.calculateprogram;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public String greeting(){
        return "Добро пожаловать в калькулятор!";
    }
    public String plus (int num1,  int num2){
        return formatResult (num1, num2, "+", Integer.toString(num1+num2));
    }
    public String minus (int num1,int num2) {
        return formatResult(num1,num2, "-", Integer.toString(num1-num2 ));
    }

    public String multiply (int num1,int num2) {
        return formatResult(num1, num2, "*", Integer.toString(num1 * num2));
    }

    public String divide(int num1,int num2) {
        if (num2 == 0) {
            return "На 0 делить  нельзя";
            }
        return formatResult(num1,num2,"/", Double.toString((double) num1/num2));
    }

    private String formatResult ( int num1, int num2, String operation, String result) {
        return String.format("%s %s %s = %s", num1, operation, num2, result);
    }
}
