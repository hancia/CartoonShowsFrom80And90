package com.drools.cartoons;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Cartoons {

    static Goji goji;

    public static void main(String[] args){
        Cartoons cartoons = new Cartoons();
        cartoons.executeRules();
    }
    public void executeRules() {

        BasicConfigurator.configure();
        Logger.getLogger(Cartoons.class).setLevel(Level.OFF);

        goji = new Goji();

        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");
        session.fireAllRules();
    }
}