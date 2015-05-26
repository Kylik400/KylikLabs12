import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Source_it_6 on 26.05.2015.
 */
public class Point {

    private double x;
    private double y;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Point (double a, double b){

        this.x = a;
        this.y = b;

    }
    Point (){

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Точка с кооринатами: " + "x =" +  getX() + " " + "y = " + getY();
    }
}