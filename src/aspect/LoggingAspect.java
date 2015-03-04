/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author fja2
 */
@Aspect
public class LoggingAspect {
    
    @Before("execution( public String getName())")
    public void LoggingAdvice(){
        System.out.println("Advice run. Get Method Called");
    }
}
