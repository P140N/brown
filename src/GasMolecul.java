import java.util.Random;

/**
 * Created by anton on 21.01.15.
 */
public class GasMolecul implements Corpuscle {

    private Vector coordinates;
    private Vector speed;
    private static int r = 5;
    private static int discritization = 100;
    private static Random rand = new Random();
    private static int mass = 1;
    GasMolecul(){
        double x = rand.nextInt(600 - 5*r)+3*r;
        double y = rand.nextInt(430 - 5*r)+3*r;
        coordinates = new Vector(x,y);
        double vx = rand.nextInt(20)-10;
        double vy = rand.nextInt(20)-10;
        speed = new Vector(vx,vy);
    }

    public double getX(){
        return this.coordinates.getX();
    }
    public double getY() { return this.coordinates.getY(); }
    public double getVX(){
        return this.speed.getX();
    }
    public double getVY() { return this.speed.getY();}
    public int getR() { return this.r; }
    public void setVX(int vx){this.speed.setX(vx);}
    public void setVY(int vy){this.speed.setY(vy);}
    public Vector getSpeed() {
        return speed;
    }
    public Vector getCoordinates() {
        return coordinates;
    }
    public void setSpeed(Vector speed) {
        this.speed = speed;
    }
    public int getMass() {
        return mass;
    }


    public void makeStep() {
        double x = coordinates.getX();
        double y = coordinates.getY();
        double vx = speed.getX()/discritization;
        double vy = speed.getY()/discritization;
        if ((((int)(x+vx+r)) >= 600)||(((int)(x+vx-r))<= 0)) speed.setX(-speed.getX());
        if ((((int)(y+vy+r)) >= 430)||(((int)(y+vy-r))<= 0)) speed.setY(-speed.getY());
        coordinates.setX(x + speed.getX()/discritization);
        coordinates.setY(y + speed.getY()/discritization);
    }

}
