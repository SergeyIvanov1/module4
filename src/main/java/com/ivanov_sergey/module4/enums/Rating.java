package com.ivanov_sergey.module4.enums;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Rating {
    G("G"), // the string arguments should exactly match what's in the database.
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17");
    private final String value;

    Rating(final String rating) {
        this.value = rating;
    }

//    private static final Map<String, Rating> LOOKUP = Arrays.stream(values())
//            .collect(Collectors.toMap(Rating::getValue, Function.identity()));
    public String getValue() {
        return value;
    }
//
//    public static Rating fromString(final String rating) {
//        // You may want to include handling for the case where the given string
//        // doesn't map to anything - implementation is up to you.
//        return LOOKUP.get(rating);
//    }
//
//    @javax.persistence.Converter(autoApply = true)
//    public static class RatingConverter implements AttributeConverter<Rating, String> {
//        @Override
//        public String convertToDatabaseColumn(final Rating attribute) {
//            return attribute.getValue();
//        }
//
//        @Override
//        public Rating convertToEntityAttribute(final String dbData) {
//            return Rating.fromString(dbData);
//        }
//    }
}
