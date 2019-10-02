package edu.mum.cs.validator;

import edu.mum.cs.model.Calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorValidatorImpl implements CalculatorValidator {

    public List<String> validate(Object  object ) {

        List<String> errors = new ArrayList<String>();

        Calculator calculator = (Calculator) object;
        Integer num1 = calculator.getNum1();
        if(num1 == null){
            errors.add("Enter an Integer1!");
        }
        Integer num2 = calculator.getNum2();
        if(num2 == null){
            errors.add("Enter an Integer2!");
        }
        Integer num3 = calculator.getNum3();
        if(num3 == null){
            errors.add("Enter an Integer3!");
        }
        Integer num4 = calculator.getNum4();
        if(num4 == null){
            errors.add("Enter an Integer4!");
        }
        return errors;
    }


}
