package com.zrs.custom.patterns.creational.abstractfactory;

import com.zrs.custom.patterns.creational.abstractfactory.bank.BankTeamAbstractFactory;
import com.zrs.custom.patterns.creational.abstractfactory.market.MarketTeamAbstractFactory;

import java.util.List;

/**
 * @author zrs
 */
public class Starter {

    public void go() {

        List<Developer> bankDevelopers = TeamFactory.getDevelopers(new BankTeamAbstractFactory());
        List<Developer> marketDevelopers = TeamFactory.getDevelopers(new MarketTeamAbstractFactory());

        QA bankQa = TeamFactory.getQa(new BankTeamAbstractFactory());
        QA marketQa = TeamFactory.getQa(new MarketTeamAbstractFactory());

        Architect bankArchitect = TeamFactory.getArchitect(new BankTeamAbstractFactory());
        Architect marketArchitect = TeamFactory.getArchitect(new MarketTeamAbstractFactory());

        bankDevelopers.forEach(Developer::writeCode);
        marketDevelopers.forEach(Developer::writeCode);

        bankQa.writeTest();
        marketQa.writeTest();

        bankArchitect.design();
        marketArchitect.design();
    }
}
