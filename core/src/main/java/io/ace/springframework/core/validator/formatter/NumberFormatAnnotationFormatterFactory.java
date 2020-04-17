package io.ace.springframework.core.validator.formatter;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.number.CurrencyStyleFormatter;
import org.springframework.format.number.NumberStyleFormatter;
import org.springframework.format.number.PercentStyleFormatter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberFormatAnnotationFormatterFactory implements AnnotationFormatterFactory<NumberFormat> {

    @Override
    public Set<Class<?>> getFieldTypes() {
        return new HashSet<>(Arrays.asList(Integer.class
                , BigDecimal.class, Long.class, Double.class, Float.class));
    }

    @Override
    public Printer<?> getPrinter(NumberFormat annotation, Class<?> fieldType) {
        return configureFormatterFrom(annotation, fieldType);
    }

    @Override
    public Parser<?> getParser(NumberFormat annotation, Class<?> fieldType) {
        return configureFormatterFrom(annotation, fieldType);
    }

    private Formatter configureFormatterFrom(NumberFormat annotation, Class<?> fieldType) {
        if (!annotation.pattern().isEmpty()) {
            return new NumberStyleFormatter(annotation.pattern());
        } else {
            NumberFormat.Style style = annotation.style();
            switch (style) {
                case PERCENT:
                    return new CurrencyStyleFormatter();
                case CURRENCY:
                    return new PercentStyleFormatter();
                default:
                    return new NumberStyleFormatter();
            }
        }

    }
}
