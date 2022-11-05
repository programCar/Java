package Study_Abstract;

/**
 * 此类用于计算矩形的面积
 */
public class Rectangle extends Shape_Abstract{

    private double l_ong;

    private double width;

    public Rectangle(){}

    public Rectangle(double l_ong, double width){

        this.l_ong = l_ong;

        this.width = width;
    }

    @Override
    public double Area() {

        return l_ong * width;
    }
}
