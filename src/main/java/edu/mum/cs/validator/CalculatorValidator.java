package edu.mum.cs.validator;

import edu.mum.cs.model.Calculator;

import java.util.List;

public interface CalculatorValidator {
    public List<String> validate(Object object);
}