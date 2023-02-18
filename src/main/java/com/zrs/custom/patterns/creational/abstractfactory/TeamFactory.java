package com.zrs.custom.patterns.creational.abstractfactory;

import java.util.Arrays;
import java.util.List;

/**
 * @author zrs
 */
public class TeamFactory {

    public static List<Developer> getDevelopers(TeamAbstractFactory factory) {
        return Arrays.asList(factory.createDeveloper("java"), factory.createDeveloper("python"));
    }

    public static QA getQa(TeamAbstractFactory factory) {
        return factory.createQA();
    }

    public static Architect getArchitect(TeamAbstractFactory factory) {
        return factory.createArchitect();
    }
}
