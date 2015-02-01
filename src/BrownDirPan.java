import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 * Created by anton on 21.01.15.
 */
public class BrownDirPan extends JFrame {
    PaintBrown pb;

    public BrownDirPan(){
        super("brown vizualization");
        Container c =getContentPane();
        c.setLayout(new BorderLayout());
        pb = new PaintBrown();
        pb.setSize(600,430);//размеры поля с молекулами
        c.add(pb,BorderLayout.CENTER);

        setSize(700,500);//размеры окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new BrownDirPan();
    }
}