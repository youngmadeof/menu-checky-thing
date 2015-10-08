package practiceFramework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.FlowLayout;


import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;


public class DropDownRep extends JFrame{
	
	public DropDownRep(){
		
		prepareGUI();
	}
	

	public final void prepareGUI(){
		
		JPanel main = new JPanel();
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		add(main);
		
		JPanel fieldPanel = new JPanel(new BorderLayout());
		fieldPanel.setMaximumSize(new Dimension (400,100));
		JLabel tempfields = new JLabel("This is where the fields will go");
		tempfields.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		fieldPanel.add(tempfields);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLUE);
		
		fieldPanel.add(separator, BorderLayout.SOUTH);
		
		main.add(fieldPanel);
		
		JPanel listPanel = new JPanel(new BorderLayout());
		listPanel.setMaximumSize(new Dimension (400,300));
		JLabel tempList = new JLabel("Stick output list here!");
		tempList.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		listPanel.add(tempList);
		
		main.add(listPanel);
		
		JPanel buttPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));		
		JButton submit = new JButton("Submit");
		JButton clear = new JButton ("Clear");
		JButton close = new JButton ("Close");
		
		buttPanel.add(submit);
		buttPanel.add(clear);
		buttPanel.add(close);
		main.add(buttPanel);
		
		buttPanel.setMaximumSize(new Dimension (400, 50));
		
		
		setTitle("menu checky thing");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
			
		public void run(){
		DropDownRep drop = new DropDownRep();
		drop.setVisible(true);
		}
		});
		

	}
	
	

}
