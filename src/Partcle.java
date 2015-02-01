import java.util.Random;

/**
 * Created by anton on 21.01.15.
 */
public class Partcle {
    private int x;
    private int y;
    private static int r = 10;
    private static Random rand = new Random();
    Partcle(){
        this.x = rand.nextInt(600);
        this.y = rand.nextInt(430);
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getR() { return this.r; }
}
