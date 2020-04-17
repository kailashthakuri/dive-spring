package io.ace.springframework.core.spel;

import io.ace.springframework.core.spel.model.Simple;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class EvaluationContextExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Simple simple = new Simple();
        simple.booleanList.add(false);

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        Expression expression = parser.parseExpression("booleanList[0]");
        expression.setValue(context, simple, "true");
        System.out.println(simple.booleanList.get(0));
    }
}
