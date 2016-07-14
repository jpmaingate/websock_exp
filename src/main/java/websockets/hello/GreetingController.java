/*
 * Copyright (c) 2016 Wireless Maingate Nordic AB. All rights reserved.
 * 
 * Wireless Maingate Nordic AB shall have no liability for any error
 * or damages of any kind resulting from use of this document.
 */
package websockets.hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * TODO Enter description.
 * 
 * @author <a href="mailto:JPetersson@sierrawireless.com">JPetersson</a>
 * @since 14 juli 2016
 *
 */
@Controller
public class GreetingController
{
    
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception
    {
        Thread.sleep(3000); // sim delay
        return new Greeting("Hello, " + message.getName() + "!");
    }
    
//    @MessageMapping("/hello")
//    @SendTo("/topic/values")
//    public ValueObject sendValue(double value) throws Exception
//    {       
//        return new ValueObject(String.valueOf(value));
//    }
}
