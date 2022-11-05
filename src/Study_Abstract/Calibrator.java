package Study_Abstract;

/**
 * 这是一个校检兼并服务类，为Test_Study_Abstract类服务，用于校检输入数字是否能构成三角形，圆 或者矩形的面积计算。
 * 捕获用于本类校检边长是否合法的边长长度
 */
public class Calibrator {

    //用于捕获圆的半径
    private double radius;

    //用于捕获矩形长的长度
    private double l_ong;

    //用于捕获矩形宽的长度
    private double width;

    //用于捕获三角形的第一条边长度
    private double first_Side;

    //用于捕获三角形的第二条边长度
    private double second_Side;

    //用于捕获三角形的第三条边长度
    private double third_Side;

    /**
     * 返回捕获后的圆的半径
     * @return double
     */
    public double getRadius(){

        return radius;
    }

    /**
     * 返回捕获后的矩形长的长度
     * @return double
     */
    public double getL_ong(){

        return l_ong;
    }

    /**
     * 返回捕获后的矩形宽的长度
     * @return double
     */
    public double getWidth(){

        return width;
    }

    /**
     * 返回捕获后的三角形第一边的长度
     * @return double
     */
    public double getFirst_Side(){

        return first_Side;
    }

    /**
     * 返回捕获后的三角形第二边的长度
     * @return double
     */
    public double getSecond_Side(){

        return second_Side;
    }

    /**
     * 返回捕获后的三角形第三边的长度
     * @return double
     */
    public double getThird_Side(){

        return third_Side;
    }

    /**
     * 校检圆的半径长度是否合法，合法则生成计算圆的面积对象并存储在 area数组的第一(0)个位置
     * @param radius
     * @param area
     * @return boolean
     */
    public boolean Circle_Calibrator(double radius, Shape_Abstract[] area){

        this.radius = radius;

        if (radius <= 0){

            return false;
        }else {

            area[0] = new Circle(radius);

            return true;
        }
    }

    /**
     * 校检矩形的长和宽的长度是否合法，合法则生成计算矩形的面积对象并储存在area数组的第二(1)个位置
     * @param l_ong
     * @param width
     * @param area
     * @return boolean
     */
    public boolean Rectangle_Calibrator(double l_ong, double width, Shape_Abstract[] area){

        this.l_ong = l_ong;

        this.width = width;

        if (l_ong <= 0 && width <= 0){

            return false;
        }else {

            area[1] = new Rectangle(l_ong,width);

            return true;
        }
    }

    /**
     * 校检三角形三条边的长度是否合法，合法则继续校检三角形三边长度是否足以构成三角形形状
     * 是，则创建用于计算三角形面积的对象并储存在area数组的第三(2)个位置
     * @param first_Side
     * @param second_Side
     * @param third_Side
     * @param area
     * @return int
     */
    public int Triangle_Calibrator(double first_Side, double second_Side, double third_Side,Shape_Abstract[] area){

        this.first_Side = first_Side;

        this.second_Side = second_Side;

        this.third_Side = third_Side;

        if (first_Side <= 0 || second_Side <= 0 || third_Side <= 0){

            return -1;
        }else if (!Is_Triangle(first_Side,second_Side,third_Side)){

            return -2;
        }else {

            area[2] = new Triangle(first_Side,second_Side,third_Side);

            return 1;
        }
    }

    /**
     * 用于校检三角形的三条边是否能构成三角形
     * @param first_Side
     * @param second_Side
     * @param third_Side
     * @return boolean
     */
    private boolean Is_Triangle(double first_Side, double second_Side, double third_Side){

        boolean is = first_Side + second_Side > third_Side ?
                (first_Side + third_Side > second_Side ? (second_Side + third_Side > first_Side ? true : false)
                        : false) : false;

        return is;
    }
}
