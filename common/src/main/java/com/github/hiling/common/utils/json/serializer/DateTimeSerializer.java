package com.github.hiling.common.utils.json.serializer;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Author by hiling, Email admin@mn-soft.com, Date on 11/26/2018.
 * 适用于jdk1.7以下
 */
public class DateTimeSerializer extends JsonSerializer<Date> {

    private static final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    @Override
    public void serialize(Date date, JsonGenerator jgen, SerializerProvider provider) {
        try {
            DateFormat dateFormat = new SimpleDateFormat(PATTERN);
            jgen.writeString(dateFormat.format(date));
        } catch (IOException e) {
            throw new RuntimeException("Date转换json异常，格式：" + PATTERN);
        }
    }
}