package com.zrs.custom.patterns.creational.abstractfactory;

/**
 * @author zrs
 */
public interface TeamAbstractFactory {

    Developer createDeveloper(String lang);

    QA createQA();

    Architect createArchitect();
}
