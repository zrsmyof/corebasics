package com.zrs.custom.patterns.creational.abstractfactory.market;

import com.zrs.custom.patterns.creational.abstractfactory.Architect;
import com.zrs.custom.patterns.creational.abstractfactory.Developer;
import com.zrs.custom.patterns.creational.abstractfactory.QA;
import com.zrs.custom.patterns.creational.abstractfactory.TeamAbstractFactory;

/**
 * @author zrs
 */
public class MarketTeamAbstractFactory implements TeamAbstractFactory {

    @Override
    public Developer createDeveloper(String lang) {
        if ("java".equals(lang)) {
            return new MarketJavaDeveloper();
        }
        if ("python".equals(lang)) {
            return new MarketPythonDeveloper();
        }
        throw new IllegalArgumentException("No developer for language: " + lang);
    }

    @Override
    public QA createQA() {
        return new MarketQA();
    }

    @Override
    public Architect createArchitect() {
        return new MarketArchitect();
    }
}
