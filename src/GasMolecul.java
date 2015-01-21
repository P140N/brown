import java.util.Random;

/**
 * Created by anton on 21.01.15.
 */
public class GasMolecul {
    private double x;
    private double y;
    private static Random rand = new Random();
    GasMolecul(){
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
