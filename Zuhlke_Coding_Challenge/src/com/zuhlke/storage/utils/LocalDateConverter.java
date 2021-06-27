package com.zuhlke.storage.utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class LocalDateConverter {

    public static Date convert(String s) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        LocalDate parse = LocalDate.parse(s, formatter);
        Date date = Date.from(parse.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date;
    }
}
