package io.ace.springframework.core.spel.parseconfig;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ParserConfigurationExample {
    public static void main(String[] args) {

        SpelParserConfiguration config = new SpelParserConfiguration(true, true);
        ExpressionParser expressionParser = new SpelExpressionParser(config);

        Demo demo = new Demo();

        Expression expression = expressionParser.parseExpression("list[3]");
        String value = (String) expression.getValue(demo);
        System.out.println(value);
    }

}
