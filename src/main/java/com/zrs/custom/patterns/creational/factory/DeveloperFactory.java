package com.zrs.custom.patterns.creational.factory;

/**
 * @author zrs
 */
public class DeveloperFactory {

    public static Developer createDeveloper(String lang) throws IllegalAccessException {
        if ("java".equals(lang)) {
            return new JavaDeveloper();
        } else if ("python".equals(lang)) {
            return new PythonDeveloper();
        } else {
            throw new IllegalAccessException("No developers for language: " + lang);
        }
    }
}
