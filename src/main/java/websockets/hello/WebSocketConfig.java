/*
 * Copyright (c) 2016 Wireless Maingate Nordic AB. All rights reserved.
 * 
 * Wireless Maingate Nordic AB shall have no liability for any error
 * or damages of any kind resulting from use of this document.
 */
package websockets.hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * TODO Enter description.
 * 
 * @author <a href="mailto:JPetersson@sierrawireless.com">JPetersson</a>
 * @since 14 juli 2016
 *
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer
{
    
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config)
    {
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }
    
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry)
    {
        registry.addEndpoint("/hello").withSockJS();
    }

}
