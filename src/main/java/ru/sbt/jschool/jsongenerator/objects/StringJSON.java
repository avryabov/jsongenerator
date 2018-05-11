package ru.sbt.jschool.jsongenerator.objects;

/**
 */
public class StringJSON implements ObjectJSON {
    @Override
    public StringBuilder json(Object obj, int tabs) {
        return new StringBuilder("\"" + obj + "\"");
    }
}
