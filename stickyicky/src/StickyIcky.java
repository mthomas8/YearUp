import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


public class StickyIcky {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StickyIcky window = new StickyIcky();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StickyIcky() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel namelabel = new JLabel("My Name Is:");
		namelabel.setHorizontalAlignment(SwingConstants.RIGHT);
		namelabel.setBounds(52, 58, 85, 14);
		frame.getContentPane().add(namelabel);
		
		textField = new JTextField();
		textField.setBounds(147, 55, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel AGELABEL = new JLabel("I am:");
		AGELABEL.setHorizontalAlignment(SwingConstants.RIGHT);
		AGELABEL.setBounds(91, 106, 46, 14);
		frame.getContentPane().add(AGELABEL);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 103, 122, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIAmA = new JLabel("I am a student at YearUp");
		lblIAmA.setHorizontalAlignment(SwingConstants.CENTER);
		lblIAmA.setBounds(110, 168, 175, 14);
		frame.getContentPane().add(lblIAmA);
		
		JButton whoButton = new JButton("Who are you");
		whoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (whoButton.getText().equals("Who are you"))
				{
					textField.setText("MichaelThomas");
					textField_1.setText("21");
					whoButton.setText("Clear me!");
				}
				else if (whoButton.getText().equals("Clear me!"))
				{
					textField.setText("");
					textField_1.setText("");
					whoButton.setText("Who are you");
				}
			}
		});
		whoButton.setBounds(110, 204, 175, 23);
		frame.getContentPane().add(whoButton);
		
		}
}
