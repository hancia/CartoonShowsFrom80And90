package com.drools.cartoons;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Cartoons {
    public static void main(String[] args) throws DroolsParserException,
            IOException {
        Cartoons cartoons = new Cartoons();
        cartoons.executeRules();
    }
    public void executeRules() throws IOException,
            DroolsParserException {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(Cartoons.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");
        session.fireAllRules();
    }
}