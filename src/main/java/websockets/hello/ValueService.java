/*
 * Copyright (c) 2016 Wireless Maingate Nordic AB. All rights reserved.
 * 
 * Wireless Maingate Nordic AB shall have no liability for any error
 * or damages of any kind resulting from use of this document.
 */
package websockets.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * TODO Enter description.
 * 
 * @author <a href="mailto:JPetersson@sierrawireless.com">JPetersson</a>
 * @since 14 juli 2016
 *
 */
@Service
public class ValueService
{
    @Autowired
    private SimpMessagingTemplate messagingTemplate;
    
    //@Scheduled(fixedDelay=1000)
    public void sendValue(double value)
    {
        String destination = "/topic/values";
        this.messagingTemplate.convertAndSend(destination, new ValueObject(String.valueOf(value)));
    }
}
