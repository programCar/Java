package Study_Abstract;

/**
 * 此类用于计算三角形的面积
 */
public class Triangle extends Shape_Abstract{

    private double first_Side;

    private double second_Side;

    private double third_Side;

    public Triangle(){}

    public Triangle(double first_Side, double second_Side, double third_Side){

        this.first_Side = first_Side;

        this.second_Side = second_Side;

        this.third_Side = third_Side;
    }

    @Override
    public double Area() {

        double p = (first_Side + second_Side + third_Side) / 2;

        return Math.sqrt(p * (p - first_Side) * (p - second_Side) * (p - third_Side));


    }

}
