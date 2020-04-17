package io.ace.springframework.core.validator.formatter;

import org.springframework.format.Formatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {

    private String pattern;

    public DateFormatter(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        if (text.length() == 0) {
            return null;
        }
        return getDateFormat(locale).parse(text);
    }

    @Override
    public String print(Date date, Locale locale) {
        if (null == date) {
            return "";
        }
        return getDateFormat(locale).format(date);
    }

    private DateFormat getDateFormat(Locale locale) {
        DateFormat dateFormat = new SimpleDateFormat(pattern, locale);
        return dateFormat;
    }


}
