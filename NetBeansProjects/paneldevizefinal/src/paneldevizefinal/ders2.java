package paneldevizefinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class ders2 implements ActionListener{
	JTextField jtf1,jtf2;
	JLabel jlab3;

	public ders2() {
		
		JFrame jfrm=new JFrame("2.ders");
		jfrm.setSize(300, 160);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jfarame atılan her nesneyi tam ekran yapar yerleşim belirlemezsek
		//jfrm.setLayout(new FlowLayout());//yanyana düzenler 20.03
		//jfrm.setLayout(new GridLayout(2,2)); //ekranı 4 e böldük
		JPanel jpn_main=new JPanel();
		jpn_main.setPreferredSize(new Dimension(290,110));

		
		JPanel jpn_ust=new JPanel();
		jpn_ust.setLayout(new GridLayout(2,2));
		
		JPanel jpn_alt1=new JPanel();
		JPanel jpn_alt2=new JPanel();


		jpn_main.add(jpn_ust);
		jpn_main.add(jpn_alt1);
		jpn_main.add(jpn_alt2);

		Border b=BorderFactory.createLineBorder(Color.BLUE);
		Border r=BorderFactory.createLineBorder(Color.RED);

		//jpn_ust.setBorder(r);
		//jpn_main.setBorder(b);
		//jpn_alt1.setBorder(r);
		//jpn_alt2.setBorder(r);

		JButton jbtn=new JButton("Hesapla");
		jpn_alt1.add(jbtn);
		jbtn.addActionListener(this);
		jlab3=new JLabel("Sonuç");
		jpn_alt2.add(jlab3);

		Dimension d=new Dimension(290,35); //panel boyutu
		jpn_alt1.setPreferredSize(d);
		jpn_alt2.setPreferredSize(d);	
		
		
		JLabel jlab1=new JLabel("Vize");
		jpn_ust.add(jlab1); //pencereye eklendi
		jtf1= new JTextField(10); //10 karakter yazabileceğimiz alan
		jpn_ust.add(jtf1);	

		JLabel jlab2=new JLabel("Final");
		jpn_ust.add(jlab2); //pencereye eklendi
		jtf2= new JTextField(10);
		jpn_ust.add(jtf2);	
		
		jfrm.add(jpn_main);		
		
		jfrm.setVisible(true);
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
            ders2 ders2 = new ders2(); /*ders2*/
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String vize=jtf1.getText();
		String fnl=jtf2.getText();

		
		double sonuc=Integer.parseInt(vize)*0.4+Integer.parseInt(fnl)*0.6;
		jlab3.setText("Sonuç="+sonuc);
		
		
		
	}
	


}