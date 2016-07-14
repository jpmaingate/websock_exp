/*
 * Copyright (c) 2016 Wireless Maingate Nordic AB. All rights reserved.
 * 
 * Wireless Maingate Nordic AB shall have no liability for any error
 * or damages of any kind resulting from use of this document.
 */
package websockets.hello;

//import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TODO Enter description.
 * 
 * @author <a href="mailto:JPetersson@sierrawireless.com">JPetersson</a>
 * @since 14 juli 2016
 *
 */
@Component
public class RunnerConfig
{

    @Autowired
    private ValueService valueService;
    
    @PostConstruct
    public void runTheRunner()
    {
        
        System.out.println("RunnerConfig created!!!");
        System.out.println(valueService.toString());
        Thread threadA = new Thread(new Runner(valueService), "Runner 1");
        
        threadA.start();
    }
}
