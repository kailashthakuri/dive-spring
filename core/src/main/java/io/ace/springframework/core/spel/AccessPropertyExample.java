package io.ace.springframework.core.spel;

import io.ace.springframework.core.spel.model.Inventor;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class AccessPropertyExample {
    public static void main(String[] args) {
        Inventor inventor = new Inventor("Kailash", "Nepali");
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("name");
        String value = (String) expression.getValue(inventor);
        System.out.println(value);

        Expression expression1 = expressionParser.parseExpression("name == 'Kailash'");
        Boolean value1 = expression1.getValue(inventor, Boolean.class);
        System.out.println(value1);
    }
}
