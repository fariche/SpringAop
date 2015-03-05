/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ShapeService;

/**
 *
 * @author fja2
 */
public class AopMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
       ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
       shapeService.getCircle();
    
    
    }
    
}
