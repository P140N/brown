/**
 * Created by Вадим on 19.02.2015.
 */
public class Vector {

    private double x;
    private double y;
    private double length;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        countLength();
    }
    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getLength() {
        return length;
    }
    public void normalizeThis(){
        x = x/length;
        y = y/length;
    }
    public void countLength() {
        this.length = Math.sqrt(x*x+y*y);
    }

}
