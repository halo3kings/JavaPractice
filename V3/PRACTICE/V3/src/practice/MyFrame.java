package practice;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	
	//instancing
	JButton button;
	JLabel label;
	//Constructor
	MyFrame(){
		
		//Image
		ImageIcon icon = new ImageIcon("Clone.png");
		ImageIcon icon2 = new ImageIcon("Clone.png");
		//System.out.println("Height: " + icon.getIconHeight()+" Width: " + icon.getIconWidth()+" Description: "+ icon2.getDescription() );
		

		//label
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(0,0,100,100);
		//System.out.println("Height: " +label.getHeight()+" Width: "+label.getWidth());
		label.setVisible(false);
		
		//Button
		button = new JButton();
		button.setBounds(100,100,250,100);
		button.addActionListener(this);
		button.setText("Im a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(button.CENTER);
		button.setVerticalTextPosition(button.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.blue);
		button.setBackground(Color.orange);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.setEnabled(true);
		
		//Frame settings
		this.add(button);
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		this.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== button) {
			label.setVisible(true);
			System.out.println("TEST");
		}
		
	}

}
