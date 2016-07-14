/*
 * Copyright (c) 2016 Wireless Maingate Nordic AB. All rights reserved.
 * 
 * Wireless Maingate Nordic AB shall have no liability for any error
 * or damages of any kind resulting from use of this document.
 */
package websockets.hello;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * TODO Enter description.
 * 
 * @author <a href="mailto:JPetersson@sierrawireless.com">JPetersson</a>
 * @since 14 juli 2016
 *
 */
public class Runner implements Runnable
{
    
    private ValueService valueService;
    
    public Runner(ValueService valueService)
    {
        this.valueService = valueService;
    }
  
    @Override
    public void run()
    {
        Random rand = new Random();
        
        System.out.println("Runner Started!");
        
        while(true)
        {
            double value = rand.nextDouble();
            
            //System.out.println("New Random value: " + value);
            
            try
            {
                valueService.sendValue(value);
            }
            catch (Exception e1)
            {
                e1.printStackTrace();
            }
            
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
