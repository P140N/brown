import java.util.ArrayList;

import static java.lang.Thread.sleep;

/**
 * Created by anton on 17.02.15.
 */
public class Brown {
    private ArrayList<GasMolecul> moleculs;
    private ArrayList<GasMolecul> moleculsNext;
    private Partcle partcle;
    private Partcle partcleNext;
    GasMolecul mol;
    private static int number = 25;

    public Brown(){
        moleculs = new ArrayList<GasMolecul>();
        for (int i = 0;i<number;i++){
            mol = new GasMolecul();
            moleculs.add(mol);
        }
        partcle = new Partcle();
    }

    private void countNextPositions(){
        //new coordinates
        moleculsNext = new ArrayList<GasMolecul>();
        for(int i = 0;i<number;i++){
            mol = moleculs.get(i);
            moleculsNext.add(mol);
            moleculsNext.get(i).makeStep();
        }
        partcleNext = partcle;
        partcleNext.makeStep();
    }
    private void recountCollisions(){
        GasMolecul mol2;
        for (int i= 0;i<number;i++){
            mol = moleculsNext.get(i);
            for (int j = 0;j<number;j++){
                if (i != j) {
                    mol2 = moleculsNext.get(j);
                    double dist1 = (mol.getX() - mol2.getX()) * (mol.getX() - mol2.getX()) + (mol.getY() - mol2.getY()) * (mol.getY() - mol2.getY());
                    if (dist1 <= ((mol.getR()+mol2.getR())*(mol.getR()+mol2.getR()))) {
                        recountCoordinates(i,j);
                        moleculsNext.get(i).makeStep();
                        moleculsNext.get(j).makeStep();
                    }
                }
            }

        }
    }

    private void recountCoordinates(int i,int j){
        GasMolecul m1 = moleculsNext.get(i);
        GasMolecul m2 = moleculsNext.get(j);
        int M1 = m1.getMass();
        int M2 = m2.getMass();
        Vector u1 = m1.getSpeed();
        Vector u2 = m2.getSpeed();

        Vector Axis = dist(m2.getCoordinates(),m1.getCoordinates());
        Axis.normalizeThis();
        Vector u1x = mult(Axis,(mult(u1,Axis)));
        Vector u1y = dist(u1,u1x);

        Axis = dist(m1.getCoordinates(),m2.getCoordinates());
        Axis.normalizeThis();
        Vector u2x = mult(Axis,(mult(u2,Axis)));
        Vector u2y = dist(u2,u2x);

        Vector v1x = div(dist(summ(mult(u1x, M1), mult(u2x, M2)), mult(dist(u1x, u2x), M2)), (M1 + M2));
        Vector v2x = div(dist(summ(mult(u1x, M1), mult(u2x, M2)), mult(dist(u2x, u1x), M2)), (M1 + M2));
        Vector v1y = u1y;
        Vector v2y = u2y;

        Vector v1 = summ(v1x,v1y);
        Vector v2 = summ(v2x,v2y);
//        System.out.println("v1"+v1.getX()+" "+v1.getY()+" v2"+v2.getX()+" "+v2.getY());
        m1.setSpeed(v1);
        m2.setSpeed(v2);
    }
    public void makeStep(PaintBrown pb) {
        pb.repaint(); //1st step paint now
        countNextPositions();//count next positions for search collisions
        //is clashed
        recountCollisions();
        //counted positions became positions for next iteration
        moleculs = moleculsNext;
        partcle = partcleNext;
        try{
            Thread.currentThread().sleep(1);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    //getters
    public ArrayList<GasMolecul> getMoleculs(){
        return moleculs;
    }
    public Partcle getPartcle(){
        return partcle;
    }
    public int getNumber(){
        return number;
    }
    //operations with Vectors
    private double mult(Vector v1,Vector v2){
        return v1.getX()*v2.getX()+v1.getY()*v2.getY();
    }
    private Vector mult(Vector v,double c){
        return new Vector(v.getX()*c,v.getY()*c);
    }
    private Vector div(Vector v,int m){return  new Vector(v.getX()/m,v.getY()/m);}
    private Vector dist(Vector v1,Vector v2){
        return new Vector(v1.getX()-v2.getX(),v1.getY()-v2.getY());
    }
    private Vector summ(Vector v1,Vector v2){return new Vector(v1.getX()+v2.getX(),v1.getY()+v2.getY());}
    private Vector mult(Vector v,int c){return new Vector(v.getX()*c,v.getY()*c);}
}
