package com.sample;
import java.io.IOException;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
    public static void main(String[] args) throws DroolsParserException, IOException {
    	try {
	        KieServices ks = KieServices.Factory.get();
	        KieContainer kContainer = ks.getKieClasspathContainer();
	        KieSession session = kContainer.newKieSession("ksession-rules");
	        session.fireAllRules();
    	} catch(Throwable t) {
            t.printStackTrace();
        }
    }
}

