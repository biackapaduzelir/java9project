package turkbayragi;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class turkbayragi extends JPanel {
@Override
public void paintComponent(Graphics g){
Graphics2D g2d= (Graphics2D) g;

int[] xkoseleri={355,367,409,373,383,355,327,337,301,343};
int[] ykoseleri={-20,16,16,34,76,52,76,34,16,16};

GeneralPath yildiz= new GeneralPath();

yildiz.moveTo(xkoseleri[0],ykoseleri[0]);

for(int count=1;count<xkoseleri.length;count++){
yildiz.lineTo(xkoseleri[count],ykoseleri[count]);
}

g2d.setColor(Color.WHITE);

g.fillOval(100,50,180,180);
g2d.setColor(Color.RED);
g.fillOval(160,80,130,120);

g2d.setColor(Color.WHITE);
g2d.rotate(Math.PI/10.0);
g2d.fill(yildiz);
yildiz.closePath();
}

public static void main(String args[]){
JFrame cerceve= new JFrame("TURKIYE");
cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
turkbayragi flag = new turkbayragi();
cerceve.add(flag);
cerceve.setBackground(Color.RED);
cerceve.setSize(570,350);
cerceve.setVisible(true);
}
}