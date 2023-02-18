package com.zrs.custom.patterns.creational.abstractfactory.bank;

import com.zrs.custom.patterns.creational.abstractfactory.Architect;
import com.zrs.custom.patterns.creational.abstractfactory.Developer;
import com.zrs.custom.patterns.creational.abstractfactory.QA;
import com.zrs.custom.patterns.creational.abstractfactory.TeamAbstractFactory;

/**
 * @author zrs
 */
public class BankTeamAbstractFactory implements TeamAbstractFactory {

    @Override
    public Developer createDeveloper(String lang) {
        if ("java".equals(lang)) {
            return new BankJavaDeveloper();
        }
        if ("python".equals(lang)) {
            return new BankPythonDeveloper();
        }
        throw new IllegalArgumentException("No developer for language: " + lang);
    }

    @Override
    public QA createQA() {
        return new BankQA();
    }

    @Override
    public Architect createArchitect() {
        return new BankArchitect();
    }
}
