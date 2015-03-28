import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;


public class WarningsIntex {

	private JFrame frame;
	static String inputFromConsole;
	
	JButton btnNewButton;
	private JTextArea textArea;
	
	public static String setInputToConsole(String name)
	{
		return inputFromConsole = name;
	}
	/**
	 * Launch the application.
	 */
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WarningsIntex window = new WarningsIntex();
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
	public WarningsIntex() 
	{
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUwaga = new JLabel("Uwaga");
		lblUwaga.setForeground(Color.RED);
		lblUwaga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUwaga.setHorizontalAlignment(SwingConstants.CENTER);
		lblUwaga.setBounds(10, 11, 422, 32);
		frame.getContentPane().add(lblUwaga);
		
		btnNewButton = new JButton("OK");
		btnNewButton.setBounds(179, 229, 91, 32);
		frame.getContentPane().add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 54, 406, 156);
		textArea.setWrapStyleWord(true);
		//frame.getContentPane().add(textArea);
		textArea.insert(inputFromConsole,0);
		
		
		JScrollPane sp = new JScrollPane(textArea);
		sp.setBounds(20, 54, 406, 156);
		sp.setViewportView(textArea);
	    frame.getContentPane().add( sp );
					
		ListenForButton lForButtonOK = new ListenForButton();
		btnNewButton.addActionListener(lForButtonOK);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private class ListenForButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			            
			if(e.getSource() == btnNewButton)
			{
				
				frame.dispose();
				
	        }
		        
		   }
	     
	    }
}
