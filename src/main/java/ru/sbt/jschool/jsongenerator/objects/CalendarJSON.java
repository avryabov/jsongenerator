package ru.sbt.jschool.jsongenerator.objects;

import java.util.Calendar;

/**
 */
public class CalendarJSON extends DateJSON {
    @Override
    public StringBuilder json(Object obj, int tabs) {
        return super.json(((Calendar) obj).getTime(), tabs);
    }
}
