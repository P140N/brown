import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anton on 03.02.15.
 */
public class ButPan extends JPanel implements ActionListener {
    JButton buttonStart;
    PaintBrown pb;
    Brown brown;
    public ButPan(PaintBrown p,Brown brown){
        setLayout(new GridLayout());
        pb = p;
        this.brown = brown;
        buttonStart = new JButton("START");
        buttonStart.addActionListener(this);
        add(buttonStart);

    }
    public void actionPerformed(ActionEvent e) {
        Thread thr = new Thread(){
            public void run(){
                while(true){
                    brown.makeStep(pb);
                }
            }
        };
        thr.start();
        //pb.repaint();
    }
}
