/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import aspect.Loggable;
import model.Circle;
import model.Triangle;

/**
 *
 * @author fja2
 */
public class ShapeService {

    private Circle circle;
    private Triangle triangle;

    /**
     * @return the circle
     */
    @Loggable
    public Circle getCircle() {
        return circle;
    }

    /**
     * @param circle the circle to set
     */
    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    /**
     * @return the triangle
     */
    public Triangle getTriangle() {
        return triangle;
    }

    /**
     * @param triangle the triangle to set
     */
    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
