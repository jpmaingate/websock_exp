/*
 * Copyright (c) 2016 Wireless Maingate Nordic AB. All rights reserved.
 * 
 * Wireless Maingate Nordic AB shall have no liability for any error
 * or damages of any kind resulting from use of this document.
 */
package websockets.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO Enter description.
 * 
 * @author <a href="mailto:JPetersson@sierrawireless.com">JPetersson</a>
 * @since 14 juli 2016
 *
 */
@SpringBootApplication
public class Application {
    
//    @Autowired
//    private ValueService valueService;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        runTheRunner();
    }
    
//    public static void runTheRunner()
//    {
//        System.out.println(valueService.toString());
//        Thread threadA = new Thread(new Runner(valueService), "Runner 1");
//        
//        threadA.start();
//    }
}
