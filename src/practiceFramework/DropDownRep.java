package practiceFramework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
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
		fieldPanel.setMaximumSize(new Dimension (400, 100));
		JTextField urlText = new JTextField();
		JTextField idText = new JTextField();

		fieldPanel.setBorder(BorderFactory.createEmptyBorder(15, 35, 15, 35));
		fieldPanel.add(urlText, BorderLayout.NORTH);
		fieldPanel.add(idText, BorderLayout.SOUTH);		

		main.add(fieldPanel);

		JScrollPane pane = new JScrollPane();
		JTextArea outArea = new JTextArea();

		JPanel textPanel = new JPanel(new BorderLayout());
		textPanel.setMaximumSize(new Dimension (400,300));
		textPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		//set word wrap
		outArea.setLineWrap(true);
		//wrap at word boundaries - white spaces
		outArea.setWrapStyleWord(true);
		outArea.setEditable(false);

		//make scrollable
		pane.getViewport().add(outArea);
		textPanel.add(outArea);

		main.add(textPanel);

		JPanel buttPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton submit = new JButton("Submit");
		JButton clear = new JButton ("Clear");
		JButton close = new JButton ("Close");

		buttPanel.add(submit);
		buttPanel.add(clear);
		buttPanel.add(close);
		main.add(buttPanel);

		buttPanel.setMaximumSize(new Dimension (385, 40));


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
