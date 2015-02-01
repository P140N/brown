import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by anton on 01.02.15.
 */
public class PaintBrown extends JPanel {
    private ArrayList<GasMolecul> moleculs;
    private Partcle partcle;
    public void paint(Graphics g){
        super.paint(g);
        moleculs = new ArrayList<GasMolecul>();
        GasMolecul mol;
        for (int i = 0;i<10;i++){
            mol = new GasMolecul();
            g.drawOval(mol.getX(),mol.getY(),mol.getR(),mol.getR());
            moleculs.add(mol);
        }
        partcle = new Partcle();
        g.drawOval(partcle.getX(),partcle.getY(),partcle.getR(),partcle.getR());

    }
}
