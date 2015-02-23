import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by anton on 01.02.15.
 */
public class PaintBrown extends JPanel {
    private ArrayList<GasMolecul> moleculs;
    private Partcle partcle;
    Brown brown;
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        moleculs = brown.getMoleculs();
        GasMolecul mol;
        for (int i = 0;i<brown.getNumber();i++){
            mol = moleculs.get(i);
            g.fillOval((int)(mol.getX()-mol.getR()),(int)(mol.getY()-mol.getR()),mol.getR()*2,mol.getR()*2);
        }
        partcle = brown.getPartcle();
        g.setColor(Color.green);
        g.fillOval((int)(partcle.getX()-partcle.getR()),(int)(partcle.getY()-partcle.getR()),partcle.getR()*2,partcle.getR()*2);

    }
    public PaintBrown(Brown brown){
        this.brown = brown;
    }
}
