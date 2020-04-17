package io.ace.springframework.core.validator.formatter;

import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;

public class MyModel {

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private BigDecimal decimal;

}
