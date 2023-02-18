package com.zrs.custom.patterns.creational.factory;

import static com.zrs.custom.patterns.creational.factory.DeveloperFactory.createDeveloper;

/**
 * @author zrs
 */
public class Starter {

    public void go(String str) throws IllegalAccessException {
        Developer developer = createDeveloper(str);
        developer.write();
    }
}
