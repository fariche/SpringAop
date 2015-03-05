/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fja2
 */
public class Circle {

    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
        System.out.println("Circle Setter has been called");
        throw (new RuntimeException());
    }

    public String setNameAndReturn(String name) {
        this.name = name;
        System.out.println("Circle Setter has been called");
        return name;
    }

}
