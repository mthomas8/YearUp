import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TicTacToe {

	private JFrame frame;
	private String m_previousmove = null;
	private JButton[][]m_allButtons = new JButton[3][3];
	private static String s_x="X";
	private static String s_o = "O";
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.setBounds(10, 31, 129, 68);
		frame.getContentPane().add(btn1);
		m_allButtons[0][0]=btn1;
		
		JButton btn2 = new JButton("");
		btn2.setBounds(149, 31, 128, 68);
		frame.getContentPane().add(btn2);
		m_allButtons[0][1]=btn2;
		
		JButton btn3 = new JButton("");
		btn3.setBounds(287, 31, 137, 68);
		frame.getContentPane().add(btn3);
		m_allButtons[0][2]=btn3;
		
		JButton btn4 = new JButton("");
		btn4.setBounds(10, 110, 129, 68);
		frame.getContentPane().add(btn4);
		m_allButtons[1][0]=btn4;
		
		JButton btn5 = new JButton("");
		btn5.setBounds(149, 110, 128, 68);
		frame.getContentPane().add(btn5);
		m_allButtons[1][1]=btn5;
		
		JButton btn6 = new JButton("");
		btn6.setBounds(287, 110, 137, 68);
		frame.getContentPane().add(btn6);
		m_allButtons[1][2]=btn6;
		
		JButton btn7= new JButton("");
		btn7.setBounds(10, 189, 128, 62);
		frame.getContentPane().add(btn7);
		m_allButtons[2][0]=btn7;
		
		JButton btn8 = new JButton("");
		btn8.setBounds(149, 189, 128, 62);
		frame.getContentPane().add(btn8);
		m_allButtons[2][1]=btn8;
		
		JButton btn9 = new JButton("");
		btn9.setBounds(287, 189, 137, 62);
		frame.getContentPane().add(btn9);
		m_allButtons[2][2]=btn9;
		AddAllEventHandlers();
		
		JLabel lblTictactoe = new JLabel("TicTacToe");
		lblTictactoe.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 22));
		lblTictactoe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTictactoe.setBounds(434, 31, 124, 24);
		frame.getContentPane().add(lblTictactoe);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setBounds(434, 78, 46, 14);
		frame.getContentPane().add(lblPlayer);
		
		textField = new JTextField();
		textField.setBounds(490, 75, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setBounds(434, 123, 46, 14);
		frame.getContentPane().add(lblPlayer_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(490, 120, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
	private void ChangeButtonText(JButton button)
	{
		if(m_previousmove !=null) 
		{
			if(m_previousmove.equals(s_o))
			{
				button.setText(s_x);
				button.setEnabled(false);
				m_previousmove = s_x;
			}
			else if (m_previousmove.equals(s_x))
			{
				button.setText(s_o);
				button.setEnabled(false);
				m_previousmove = s_o;
			}
		}
		else
		{
			button.setText(s_x);
			button.setEnabled(false);
			m_previousmove =s_x;
		}
	}
	private void DisableAllButtons()
	{
		if (m_allButtons !=null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j =0; j < 3; j++)
				{
					m_allButtons[i][j].setEnabled(false);
				}
			}
		}
	}
	
	private void CheckGameWinner()
	{
		CheckGameWinnerRow();
		CheckGameWinnerColumn();
		CheckGameWinnerDiagonalOne();
		CheckGameWinnerDiagonal2();
		
	}
	
	private void CheckGameWinnerRow(){
		if (m_allButtons != null)
		{
			for (int i = 0 ; i < 3; i++)
			{
				String one = m_allButtons[i][0].getText();
				String two = m_allButtons[i][1].getText();
				String three = m_allButtons[i][2].getText();
				
				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
				
				if(! empty)
				{
					boolean same = (one == two) && (two == three);
					
					if (same)
					{
						m_allButtons[i][0].setBackground(Color.CYAN);
						m_allButtons[i][1].setBackground(Color.CYAN);
						m_allButtons[i][2].setBackground(Color.CYAN);
						DisableAllButtons();
					}
				}
			}
		}
	}
	
	private void CheckGameWinnerColumn(){
				if (m_allButtons != null)
				{
					for (int i = 0 ; i < 3; i++)
					{
				String one = m_allButtons[0][i].getText();
				String two = m_allButtons[1][i].getText();
				String three = m_allButtons[2][i].getText();

				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();

				if(! empty)
				{
					boolean same = (one == two) && (two == three);

					if (same)
					{
						m_allButtons[0][i].setBackground(Color.CYAN);
						m_allButtons[1][i].setBackground(Color.CYAN);
						m_allButtons[2][i].setBackground(Color.CYAN);
						DisableAllButtons();
					}
				}
			}
		}
	}
	private void CheckGameWinnerDiagonalOne(){
		if (m_allButtons != null)
		{
			
		String one = m_allButtons[0][0].getText();
		String two = m_allButtons[1][1].getText();
		String three = m_allButtons[2][2].getText();

		boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();

		if(! empty)
		{
			boolean same = (one == two) && (two == three);

			if (same)
			{
				m_allButtons[0][0].setBackground(Color.CYAN);
				m_allButtons[1][1].setBackground(Color.CYAN);
				m_allButtons[2][2].setBackground(Color.CYAN);
				DisableAllButtons();
			}
		}
	}
	}
		
	private void CheckGameWinnerDiagonal2(){
		if (m_allButtons != null)
		{
			
		String one = m_allButtons[0][2].getText();
		String two = m_allButtons[1][1].getText();
		String three = m_allButtons[2][0].getText();

		boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();

		if(! empty)
		{
			boolean same = (one == two) && (two == three);

			if (same)
			{
				m_allButtons[0][2].setBackground(Color.CYAN);
				m_allButtons[1][1].setBackground(Color.CYAN);
				m_allButtons[2][0].setBackground(Color.CYAN);
				DisableAllButtons();
			}
		}
	}
}
	private void AddAllEventHandlers(){
		if (m_allButtons !=null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j =0; j < 3; j++)
				{
					JButton currentButton = m_allButtons[i][j];
					m_allButtons[i][j].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							ChangeButtonText(currentButton);
							currentButton.setEnabled(false);
							CheckGameWinner();
						}
					});
				}
			}
		}
	}
}

