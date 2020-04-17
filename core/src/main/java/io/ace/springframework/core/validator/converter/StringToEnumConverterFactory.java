package io.ace.springframework.core.validator.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.lang.Nullable;

final class StringToEnumConverterFactory implements ConverterFactory<String, Enum> {
    @Override
    public <T extends Enum> Converter<String, T> getConverter(Class<T> aClass) {
        return new StringToEnumConverter<>(aClass);
    }

    private final class StringToEnumConverter<T extends Enum> implements Converter<String, T> {
        private Class<T> enumType;

        public StringToEnumConverter(Class<T> enumType) {
            this.enumType = enumType;
        }

        @Nullable
        @Override
        public T convert(String s) {
            return (T) Enum.valueOf(enumType, s.trim());
        }
    }
}
