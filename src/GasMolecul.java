import java.util.Random;

/**
 * Created by anton on 21.01.15.
 */
public class GasMolecul {
    private int x;
    private int y;
    private static int r = 5;
    private static Random rand = new Random();
    GasMolecul(){
        this.x = rand.nextInt(600);
        this.y = rand.nextInt(430);
    }
    public int getX(){
        return this.x;
    }
    public int getY() { return this.y; }
    public int getR() { return this.r; }
}
