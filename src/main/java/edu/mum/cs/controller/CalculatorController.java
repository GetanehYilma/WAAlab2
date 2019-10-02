package edu.mum.cs.controller;

import edu.mum.cs.model.Calculator;
import edu.mum.cs.validator.CalculatorValidator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.util.List;

@Controller
public class CalculatorController {

    @AutoWired
    CalculatorValidator calculatorValidator;

    @RequestMapping(value = { "/", "/calculator" })
    public String formInput(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/jsp/CalculatorForm.jsp";
    }
    @RequestMapping(value = "/calcculate")
    public String calculateResult(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {
        List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {
            request.setAttribute("result", calculator);
            return "/WEB-INF/jsp/CalculatorShow.jsp";
        } else {

            request.setAttribute("errors", errors);
            request.setAttribute("form", calculator);
            return "/WEB-INF/jsp/CalculatorForm.jsp";
        }
    }

    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
