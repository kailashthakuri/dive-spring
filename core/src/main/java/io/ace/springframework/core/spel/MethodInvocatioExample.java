package io.ace.springframework.core.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MethodInvocatioExample {


    public static void main(String[] args) {
        /*
        Example 1
         */
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("'Hello World'.concat('!')");
        String value = (String) expression.getValue();
        System.out.println(value);
       /*
       Example 2
        */

        ExpressionParser expressionParser1 = new SpelExpressionParser();
        Expression expression1 = expressionParser1.parseExpression("'Hello World'.bytes");
        byte[] value1 = (byte[]) expression1.getValue();
        System.out.println(value1);
        /*
        Example 3
         */
        ExpressionParser expressionParser2=new SpelExpressionParser();
        Expression expression2 = expressionParser2.parseExpression("'Hello World'.bytes.length");
        int value2 = (int) expression2.getValue();
        System.out.println(value2);
    }
}
