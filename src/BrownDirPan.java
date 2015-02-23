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
    ButPan bp;
    Brown brown;
    public BrownDirPan(){
        super("brown vizualization");
        brown = new Brown();
        Container c =getContentPane();
        c.setLayout(new BorderLayout());
        pb = new PaintBrown(brown);
        pb.setSize(600,430);//размеры поля с молекулами
        pb.setBackground(Color.WHITE);
        pb.setBorder(BorderFactory.createLineBorder(Color.black));
        c.add(pb, BorderLayout.CENTER);
        bp = new ButPan(pb,brown);
        c.add(bp,BorderLayout.WEST);
        setBackground(Color.GRAY);
        setSize(700,500);//размеры окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new BrownDirPan();
    }
}