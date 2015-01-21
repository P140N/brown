import java.util.Random;

/**
 * Created by anton on 21.01.15.
 */
public class Partcle {
    private double x;
    private double y;
    private static Random rand = new Random();
    Partcle(){
        this.x = rand.nextDouble();
        this.y = rand.nextDouble();
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
}
