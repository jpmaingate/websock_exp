/*
 * Copyright (c) 2016 Wireless Maingate Nordic AB. All rights reserved.
 * 
 * Wireless Maingate Nordic AB shall have no liability for any error
 * or damages of any kind resulting from use of this document.
 */
package websockets.hello;

/**
 * TODO Enter description.
 * 
 * @author <a href="mailto:JPetersson@sierrawireless.com">JPetersson</a>
 * @since 14 juli 2016
 *
 */
public class Greeting
{
    
    private String content;
    
    public Greeting(String content) 
    {
        this.content = content;
    }
    
    public String getContent()
    {
        return content;
    }
}
