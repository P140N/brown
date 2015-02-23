/**
 * Created by anton on 23.02.15.
 */
public interface Corpuscle {
    int discritization = 100;
    double getX();
    double getY();
    double getVX();
    double getVY();
    int getR();
    void setVX(int vx);
    void setVY(int vy);
    Vector getSpeed();
    Vector getCoordinates();
    void setSpeed(Vector speed);
    int getMass();
    void makeStep();
}
