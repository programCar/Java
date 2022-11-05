package Study_Abstract;

/**
 * 此类用于计算圆的面积
 */
public class Circle extends Shape_Abstract{

    private double radius;

    public Circle(){}

    public Circle(double radius){

        this.radius = radius;
    }


    @Override
    public double Area(){

        return Math.PI * Math.pow(radius,2);
    }
}
