package com.codegym.service.Impl;

import com.codegym.service.IMayTinhService;
import org.springframework.stereotype.Service;

@Service
public class MayTinhService implements IMayTinhService {
    @Override
    public String Calculate(int num1, int num2, String operator) {
        String result = "";
        switch (operator) {
            case "Add":
                result =  num1 + num2 +"";
                break;
            case "Sub":
                result =  num1 - num2 + "";
                break;
            case "Div":
                if(num2==0){
                    return "num2 must not be 0";
                }
                result =  num1 / num2 + "";
                break;
            case "Mul":
                result =  num1 * num2 + "";
                break;
        }
        return result;
    }

}
