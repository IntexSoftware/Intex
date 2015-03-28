import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;


public class GuiStart 
{
	
	int languageIndex = 0;
	
	JButton btnNewButton;
	String[] languageList = new String[] {"English", "Polski"};
	
	
	private JFrame frmIntex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		try 
		{
            // Set System L&F
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} 
		catch (UnsupportedLookAndFeelException e) {
   	   // handle exception
		}
		catch (ClassNotFoundException e) {
       // handle exception
		}
		catch (InstantiationException e) {
       // handle exception
		}
		catch (IllegalAccessException e) {
       // handle exception
		}
    
    	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiStart window = new GuiStart();
					window.frmIntex.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
		
	}

	/**
	 * Create the application.
	 */
	public GuiStart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIntex = new JFrame();
		frmIntex.setBounds(100, 100, 450, 240);
		frmIntex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIntex.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 422, 26);
		frmIntex.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please choose language");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 48, 422, 26);
		frmIntex.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prosz\u0119 wybra\u0107 j\u0119zyk");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 85, 422, 26);
		frmIntex.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "English", "Polski"}));
		comboBox.setBounds(139, 122, 172, 26);
		frmIntex.getContentPane().add(comboBox);
		
		ListenForCombobox lForComboBoxLanguage = new ListenForCombobox();
		comboBox.addActionListener(lForComboBoxLanguage);
		
		btnNewButton = new JButton("START");
		btnNewButton.setBounds(139, 164, 172, 26);
		frmIntex.getContentPane().add(btnNewButton);
		
		ListenForButton lForButtonSTART = new ListenForButton();
		btnNewButton.addActionListener(lForButtonSTART);
	}
	
	
	private class ListenForCombobox implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			JComboBox comboBox = (JComboBox) e.getSource();

            Object selected = comboBox.getSelectedItem();
            if(selected.equals("English"))
            {
            	languageIndex = 1;
            	System.out.println("ENG");
            }
            else if(selected.equals("Polski"))
            {
            	languageIndex = 2;
            	System.out.println("PL");
            }
            		        
		   }
	     
	    }

	
	private class ListenForButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			            
			if(e.getSource() == btnNewButton)
			{
				
				if(languageIndex == 1)
				{
					GuiENG guieng = new GuiENG();
					GuiENG.runGUIeng();
					frmIntex.dispose();
				}
				
				if(languageIndex == 2)
				{
					GuiPL guipl = new GuiPL();
					guipl.runGUIpl();
					frmIntex.dispose();
				}				
				
	        }
						
			
		        
		 }
	    
	  }

	

}
