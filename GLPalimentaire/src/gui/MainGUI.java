package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainGUI extends JFrame implements Runnable{

	public static final Dimension IDEAL_MAIN_DIMENSION = new Dimension(800, 400);
	
	private OperationZone operationZone = new OperationZone();
	
	public MainGUI(String title){
		super(title);
		init();
		
	}
	
	private void init() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		operationZone.setPreferredSize(IDEAL_MAIN_DIMENSION);
		contentPane.add(BorderLayout.NORTH, operationZone);
		getContentPane().add(new JButton("bonjour..."));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setPreferredSize(IDEAL_MAIN_DIMENSION);
		setResizable(false);
	}
	
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new MainGUI("Map");
	}
}
