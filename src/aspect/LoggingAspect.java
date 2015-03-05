/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author fja2
 */
@Aspect
public class LoggingAspect {

    @Before("allGetters() && allCircleMethods()")
    public void LoggingAdvice(JoinPoint joinPoint) {

    }
    
    @AfterReturning(pointcut="args(name)", returning="returnString")
    public void stringArgumentMethods(String name, Object returnString){
        System.out.println("A method that takes String Arguments as called. The value is: "+ name
        + "The Output Value is: "+returnString);
    }
    @AfterThrowing(pointcut="args(name)", throwing="ex")
    public void exceptionAdvice(String name, Exception ex){
        System.out.println("An exception has been thrown"+ ex);
    }
    
    @Pointcut("execution( * get*())")
    public void allGetters() {
    }

    @Pointcut("within(model.Circle)")
    public void allCircleMethods() {
    }

}
