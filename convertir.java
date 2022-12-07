package projet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class convertir extends JFrame implements ActionListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			JFrame f= new JFrame();
			f.setBounds(800,800,700,500); 

			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setResizable(true);
			Container a=f.getContentPane();
			
			JLabel l=new JLabel();
			//l.setBounds(0,0,700,500); 
			a.add(l);
			
			JLabel l1=new JLabel();
			//l1.setBounds(100,50,400,50); 
			a.add(l1);
			
			JTextField t1=new JTextField();
			//t1.setBounds(100,50,400,100);
			a.add(t1);
			
			JLabel l2=new JLabel("message coder");
			//l2.setBounds(100,300,400,50); 
			a.add(l2);
			
			JTextField t2=new JTextField();
			//t2.setBounds(100,350,400,100);
			a.add(t2);

			JLabel l3=new JLabel("nombre A");
			//l3.setBounds(100,150,200,50); 
			a.add(l3);
			
			JTextField t3=new JTextField();
			//t3.setBounds(100,200,100,100);
			a.add(t3);
			 
			JLabel l4=new JLabel("nombre B");
			//l4.setBounds(300,150,400,50); 
			a.add(l4);
			
			JTextField t4=new JTextField();
			//t4.setBounds(300,200,400,100);
			a.add(t4);

			
		    JButton b1=new JButton("chifrer");
		   // b1.setBounds(550,100,100,50);
			b1.addActionListener(new ActionListener() {
				@SuppressWarnings("unused")
				public void actionPerformerd(ActionEvent arg0) {
					 String k=t1.getText();
					 int a=Integer.parseInt(t3.getText());
					 int b=Integer.parseInt(t4.getText());
					 char table[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','é','è','à','ù','ç','â','ê','î','ô','û','ë','ï'};
				 for(int i=0;i<k.length();i++)
					 for(int j=0;j<62;j++)
						 if(k.charAt(i)==table[j]) {
							 int h=(((j*a)+b)%62);
							 t2.setText(t2.getText()+table[h]+"");
						 }
				 }

				
			});
			a.add(b1);
			
			JButton b2=new JButton("dechifrer");
			//b2.setBounds(550,350,100,50);
			b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformerd(ActionEvent arg0) {
					 String k=t1.getText();
					 int a=Integer.parseInt(t3.getText());
					 int b=Integer.parseInt(t4.getText());
					 int h=0;
					 char table[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','é','è','à','ù','ç','â','ê','î','ô','û','ë','ï'};
					 for(int j=0;j<62;j++)
						 if((((j*a)+b)%62)==1) 
							 h=j;
					 for(int i=0;i<k.length();i++)
						 for(int t=0;t<25;t++) 
							 if( k.charAt(i)==table[t]) {	
								 int r=(h*(t-b)%62);
								 if(r<0) {
									 r=((r+62)%62);
									 t2.setText(t2.getText()+table[r]+"");
								 }
					
							 }
				}
			});
			a.add(b2);
			
			JButton b3=new JButton("effacer");
			//b3.setBounds(550,200,100,50);
			b3.addActionListener(new ActionListener() {
				public void actionPerformerd(ActionEvent arg0) {
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
				}
			});
			a.add(b3);
			f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
