package com.mulesoft.training;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

	@Rule
	public DynamicPort oDynamicPort = new DynamicPort("http.port");
	
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("\n*********\n Dynamic port is : "+oDynamicPort.getValue()+"\n***********\n");
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }
    
  /*  @Override
    protected String getConfigFile() {
        return "mavensetup.xml";
    }*/
    @Override
    protected String[] getConfigFiles() {
        String[] files = {"mavensetup.xml", "global.xml"};
        
        return files;
        //return "mavensetup.xml";
    }

}
