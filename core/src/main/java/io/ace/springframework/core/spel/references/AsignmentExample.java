package io.ace.springframework.core.spel.references;

import io.ace.springframework.core.spel.model.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class AsignmentExample {
    public static void main(String[] args) {
        Inventor inventor = new Inventor();

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("name='Kailash'");
        String value = expression.getValue(inventor, String.class);
        System.out.println(value);

        /*
        alternative
         */
        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();
        parser.parseExpression("name").setValue(context, inventor, "Ashok");
        System.out.println(inventor.getName());

    }
}
