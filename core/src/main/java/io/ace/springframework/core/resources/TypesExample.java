package io.ace.springframework.core.resources;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TypesExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Class value = parser.parseExpression("T(String)").getValue(Class.class);
        System.out.println(value);
    }
}
