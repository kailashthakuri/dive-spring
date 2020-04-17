package io.ace.springframework.core.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ConstructorCallExample {

    public static void main(String[] args) {
        /*
        Example 1
        */
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("new String('Hello World').toUpperCase()");
        String value = (String) expression.getValue();
        System.out.println(value);
    }
}
