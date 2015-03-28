import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Scrollbar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import java.awt.Font;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;


public class GuiENG 
{

	private JFrame frame;
	private JTextField txthomeopenfoam;
	private JTextField txthomeopenfoam_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField txte;
	private JTextField txte_1;

	/**
	 * Launch the application.
	 */
	public static void runGUIeng() 
	{
	
			
		 try {
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
					GuiENG window = new GuiENG();
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
	public GuiENG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JButton btnNewButton_3;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, 10, 1350, 650); // minimum size
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 1300, 600);
		frame.getContentPane().add(tabbedPane);  
		
		JPanel tabbedPane_1 = new JPanel();
		tabbedPane.addTab("<html><body><table width='80'><td align='center'>Start</td></table></body></html>", null, tabbedPane_1, null);	
		tabbedPane_1.setLayout(null);
		
		JLabel lblNazwaPrzypadku = new JLabel("Nazwa Przypadku");
		lblNazwaPrzypadku.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNazwaPrzypadku.setBounds(10, 10, 169, 29);
		tabbedPane_1.add(lblNazwaPrzypadku);
		
		txthomeopenfoam = new JTextField();
		txthomeopenfoam.setText("simulationDDT");
		txthomeopenfoam.setToolTipText("Nazwa Przypadku BEZ spacji");
		txthomeopenfoam.setBounds(10, 45, 261, 28);
		tabbedPane_1.add(txthomeopenfoam);
		txthomeopenfoam.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Lokalizacja Folderu Przypadku");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 76, 200, 29);
		tabbedPane_1.add(lblNewLabel);
		
		txthomeopenfoam_1 = new JTextField();
		txthomeopenfoam_1.setText("/home/OpenFoam/");
		txthomeopenfoam_1.setToolTipText("Prosz\u0119 poda\u0107 \u015Bcie\u017Ck\u0119 dost\u0119pu lub wybra\u0107 folder");
		txthomeopenfoam_1.setBounds(10, 116, 261, 28);
		tabbedPane_1.add(txthomeopenfoam_1);
		txthomeopenfoam_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Otw\u00F3rz");
		btnNewButton.setToolTipText("Wybierz folder, w kt\u00F3rym b\u0119dzie zapisany Przypadek");
		btnNewButton.setBounds(10, 156, 91, 29);
		tabbedPane_1.add(btnNewButton);
		
		JPanel tabbedPane_2 = new JPanel();
		tabbedPane.addTab("<html><body><table width='80'><td align='center'>Mixture</td></table></body></html>", null, tabbedPane_2, null);
		tabbedPane_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mieszaniny");
		lblNewLabel_1.setBounds(10, 33, 168, 22);
		tabbedPane_2.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "wod\u00F3r-powietrze", "metan-powietrze"}));
		comboBox.setBounds(10, 66, 168, 28);
		tabbedPane_2.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Wsp\u00F3\u0142czynnik Stechiomterii");
		lblNewLabel_2.setBounds(10, 99, 168, 22);
		tabbedPane_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(308, 132, 168, 28);
		tabbedPane_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Wsp\u00F3\u0142czynnik Rozcie\u0144czenia");
		lblNewLabel_3.setBounds(10, 165, 168, 28);
		tabbedPane_2.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(308, 203, 168, 28);
		tabbedPane_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Wrunki Pocz\u0105tkowe");
		lblNewLabel_4.setBounds(10, 248, 168, 28);
		tabbedPane_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("P [Pa]");
		lblNewLabel_5.setBounds(10, 288, 38, 22);
		tabbedPane_2.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 359, 110, 28);
		tabbedPane_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTk = new JLabel("T [K]");
		lblTk.setBounds(188, 288, 38, 22);
		tabbedPane_2.add(lblTk);
		
		textField_5 = new JTextField();
		textField_5.setBounds(188, 359, 110, 28);
		tabbedPane_2.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"...", "0.7", "0.8", "0.9", "1", "1.1", "1.2", "1.3"}));
		comboBox_7.setBounds(10, 132, 168, 28);
		tabbedPane_2.add(comboBox_7);
		
		JButton btnNewButton_4 = new JButton("Wpisz");
		btnNewButton_4.setBounds(188, 132, 110, 28);
		tabbedPane_2.add(btnNewButton_4);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"...", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox_8.setBounds(10, 204, 168, 28);
		tabbedPane_2.add(comboBox_8);
		
		JButton btnNewButton_5 = new JButton("Wpisz");
		btnNewButton_5.setBounds(188, 203, 110, 28);
		tabbedPane_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_9 = new JLabel("T = 298 - 400 K");
		lblNewLabel_9.setBounds(188, 321, 110, 22);
		tabbedPane_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("P = 900 - 3000 kPa");
		lblNewLabel_10.setBounds(10, 321, 110, 22);
		tabbedPane_2.add(lblNewLabel_10);
		
		JPanel tabbedPane_3 =new JPanel();
		tabbedPane.addTab("<html><body><table width='80'><td align='center'>Geometry</td></table></body></html>", null, tabbedPane_3, null);
		tabbedPane_3.setLayout(null);
		
		JLabel lblImportGeometrii = new JLabel("Import Geometrii");
		lblImportGeometrii.setBounds(10, 10, 200, 27);
		tabbedPane_3.add(lblImportGeometrii);
		
		JButton button = new JButton("Otw\u00F3rz");
		button.setToolTipText("Wybierz folder, w kt\u00F3rym b\u0119dzie zapisany Przypadek");
		button.setBounds(10, 48, 91, 28);
		tabbedPane_3.add(button);
		
		JLabel lblNewLabel_6 = new JLabel("W\u0142asna Geometria");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 94, 163, 27);
		tabbedPane_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Wybierz przekr\u00F3j kana\u0142u");
		lblNewLabel_7.setBounds(10, 132, 163, 14);
		tabbedPane_3.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"...", "ko\u0142owy", "kwadratowy"}));
		comboBox_1.setBounds(10, 157, 147, 28);
		tabbedPane_3.add(comboBox_1);
		
		JLabel lblNewLabel_8 = new JLabel("D\u0142ugo\u015B\u0107 Kana\u0142u [m]");
		lblNewLabel_8.setBounds(10, 206, 147, 14);
		tabbedPane_3.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setText("2");
		textField_6.setBounds(10, 231, 147, 28);
		tabbedPane_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("0.4");
		textField_7.setBounds(167, 231, 125, 28);
		tabbedPane_3.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblSzerokoKanau = new JLabel("Szeroko\u015B\u0107 kana\u0142u [m]");
		lblSzerokoKanau.setBounds(167, 206, 125, 14);
		tabbedPane_3.add(lblSzerokoKanau);
		
		JLabel lblWysokoKanau = new JLabel("Wysoko\u015B\u0107 kana\u0142u [m]");
		lblWysokoKanau.setBounds(302, 206, 125, 14);
		tabbedPane_3.add(lblWysokoKanau);
		
		textField_8 = new JTextField();
		textField_8.setText("0.4");
		textField_8.setBounds(302, 231, 125, 28);
		tabbedPane_3.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblrednicaKanau = new JLabel("\u015Arednica kana\u0142u");
		lblrednicaKanau.setBounds(10, 269, 147, 14);
		tabbedPane_3.add(lblrednicaKanau);
		
		textField_9 = new JTextField();
		textField_9.setText("0.4");
		textField_9.setBounds(10, 294, 147, 28);
		tabbedPane_3.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblGeometriaPrzeszkd = new JLabel("Geometria przeszk\u00F3d");
		lblGeometriaPrzeszkd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGeometriaPrzeszkd.setBounds(10, 332, 200, 14);
		tabbedPane_3.add(lblGeometriaPrzeszkd);
		
		JLabel lblWysoko = new JLabel("Wysoko\u015B\u0107");
		lblWysoko.setBounds(10, 357, 147, 14);
		tabbedPane_3.add(lblWysoko);
		
		JLabel lblGrubo = new JLabel("Grubo\u015B\u0107");
		lblGrubo.setBounds(167, 357, 125, 14);
		tabbedPane_3.add(lblGrubo);
		
		textField_10 = new JTextField();
		textField_10.setText("0.2");
		textField_10.setBounds(10, 382, 147, 28);
		tabbedPane_3.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setText("0.01");
		textField_11.setBounds(167, 382, 125, 28);
		tabbedPane_3.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblOdlegoMidzyPrzeszkodami = new JLabel("Odleg\u0142o\u015B\u0107");
		lblOdlegoMidzyPrzeszkodami.setBounds(302, 357, 125, 14);
		tabbedPane_3.add(lblOdlegoMidzyPrzeszkodami);
		
		textField_12 = new JTextField();
		textField_12.setText("0.8");
		textField_12.setBounds(302, 383, 125, 28);
		tabbedPane_3.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnGenerujGeometri = new JButton("Generuj Geometri\u0119");
		btnGenerujGeometri.setBounds(10, 423, 147, 28);
		tabbedPane_3.add(btnGenerujGeometri);
		
		JPanel tabbedPane_4 = new JPanel();
		tabbedPane.addTab("<html><body><table width='80'><td align='center'>Mesh</td></table></body></html>", null, tabbedPane_4, null);
		tabbedPane_4.setLayout(null);
		
		JLabel lblUstawieniaSiatkiNumerycznej = new JLabel("Ustawienia siatki numerycznej");
		lblUstawieniaSiatkiNumerycznej.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUstawieniaSiatkiNumerycznej.setBounds(10, 11, 259, 14);
		tabbedPane_4.add(lblUstawieniaSiatkiNumerycznej);
		
		JLabel lblRozmiarKomrkiNumerycznej = new JLabel("Rozmiar kom\u00F3rki numerycznej [m]");
		lblRozmiarKomrkiNumerycznej.setBounds(10, 36, 259, 14);
		tabbedPane_4.add(lblRozmiarKomrkiNumerycznej);
		
		textField_13 = new JTextField();
		textField_13.setText("0.001");
		textField_13.setBounds(10, 61, 172, 28);
		tabbedPane_4.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblRodzajKomrki = new JLabel("Rodzaj kom\u00F3rki ");
		lblRodzajKomrki.setBounds(10, 119, 172, 14);
		tabbedPane_4.add(lblRodzajKomrki);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"...", "sze\u015Bcio\u015Bcienn (kwadrat)", "czworo\u015Bcienna (tr\u00F3jk\u0105t)"}));
		comboBox_6.setBounds(10, 144, 172, 28);
		tabbedPane_4.add(comboBox_6);
		
		JButton btnNewButton_1 = new JButton("Generuj Siatk\u0119");
		btnNewButton_1.setBounds(10, 196, 172, 28);
		tabbedPane_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Wy\u015Bwietl siatk\u0119");
		btnNewButton_2.setBounds(10, 235, 172, 28);
		tabbedPane_4.add(btnNewButton_2);
		
		JPanel tabbedPane_5 = new JPanel();
		tabbedPane.addTab("<html><body><table width='80'><td align='center'>Boundary Cond.</td></table></body></html>", null, tabbedPane_5, null);
		tabbedPane_5.setLayout(null);
		
		JLabel lblWarunkiBrzegowe = new JLabel("Warunki brzegowe");
		lblWarunkiBrzegowe.setBounds(10, 11, 173, 14);
		tabbedPane_5.add(lblWarunkiBrzegowe);
		
		JLabel lblcianaLewa = new JLabel("Lewa p\u0142aszczyzna");
		lblcianaLewa.setBounds(10, 36, 173, 14);
		tabbedPane_5.add(lblcianaLewa);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"...", "\u015Aciana", "Wlot", "Wylot"}));
		comboBox_2.setBounds(10, 61, 173, 28);
		tabbedPane_5.add(comboBox_2);
		
		JLabel lblPrawaPaszczyzna = new JLabel("Prawa p\u0142aszczyzna");
		lblPrawaPaszczyzna.setBounds(10, 94, 173, 14);
		tabbedPane_5.add(lblPrawaPaszczyzna);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"...", "\u015Aciana", "Wlot", "Wylot"}));
		comboBox_3.setBounds(10, 119, 173, 28);
		tabbedPane_5.add(comboBox_3);
		
		JLabel lblGrnaPaszczyzna = new JLabel("G\u00F3rna p\u0142aszczyzna");
		lblGrnaPaszczyzna.setBounds(10, 152, 173, 14);
		tabbedPane_5.add(lblGrnaPaszczyzna);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"...", "\u015Aciana", "Wlot", "Wylot"}));
		comboBox_4.setBounds(10, 177, 173, 28);
		tabbedPane_5.add(comboBox_4);
		
		JLabel lblDolnaPaszczyzna = new JLabel("Dolna p\u0142aszczyzna");
		lblDolnaPaszczyzna.setBounds(10, 210, 173, 14);
		tabbedPane_5.add(lblDolnaPaszczyzna);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"...", "\u015Aciana", "Wlot", "Wylot"}));
		comboBox_5.setBounds(10, 235, 173, 28);
		tabbedPane_5.add(comboBox_5);
		
		JPanel tabbedPane_6 = new JPanel();
		tabbedPane.addTab("<html><body><table width='80'><td align='center'>Models</td></table></body></html>", null, tabbedPane_6, null);
		tabbedPane_6.setLayout(null);
		
		JLabel lblModelTurbulencji = new JLabel("Model Turbulencji");
		lblModelTurbulencji.setBounds(10, 10, 174, 27);
		tabbedPane_6.add(lblModelTurbulencji);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"...", "Laminar", "RANS", "LES"}));
		comboBox_9.setBounds(194, 10, 174, 28);
		tabbedPane_6.add(comboBox_9);
		
		JPanel tabbedPane_7 = new JPanel();
		tabbedPane.addTab("<html><body><table width='80'><td align='center'>Solver</td></table></body></html>", null, tabbedPane_7, null);
		tabbedPane_7.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("StartSym [sec]");
		lblNewLabel_11.setBounds(10, 15, 172, 21);
		tabbedPane_7.add(lblNewLabel_11);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"...", "0", "ostatniCzasSymulacji"}));
		comboBox_10.setBounds(192, 11, 172, 28);
		tabbedPane_7.add(comboBox_10);
		
		JLabel lblNewLabel_12 = new JLabel("StopSym [sec]");
		lblNewLabel_12.setBounds(10, 53, 172, 26);
		tabbedPane_7.add(lblNewLabel_12);
		
		textField_14 = new JTextField();
		textField_14.setText("0.5");
		textField_14.setBounds(192, 52, 172, 28);
		tabbedPane_7.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblDeltat = new JLabel("DeltaTime [sec]");
		lblDeltat.setBounds(10, 92, 172, 26);
		tabbedPane_7.add(lblDeltat);
		
		txte = new JTextField();
		txte.setText("1e-6");
		txte.setBounds(192, 91, 172, 28);
		tabbedPane_7.add(txte);
		txte.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("ZapisPlikow [sec]");
		lblNewLabel_13.setBounds(10, 134, 172, 21);
		tabbedPane_7.add(lblNewLabel_13);
		
		txte_1 = new JTextField();
		txte_1.setText("1e-3");
		txte_1.setBounds(192, 130, 172, 28);
		tabbedPane_7.add(txte_1);
		txte_1.setColumns(10);
		
		JCheckBox chckbxObliczenia = new JCheckBox("Obliczenia r\u00F3wnoleg\u0142e");
		chckbxObliczenia.setBounds(6, 172, 176, 23);
		tabbedPane_7.add(chckbxObliczenia);
		
		JLabel lblLiczbaRdzeni = new JLabel("Liczba rdzeni");
		lblLiczbaRdzeni.setBounds(10, 214, 172, 21);
		tabbedPane_7.add(lblLiczbaRdzeni);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_11.setBounds(192, 214, 87, 28);
		tabbedPane_7.add(comboBox_11);
		
		JPanel tabbedPane_8 = new JPanel();
		tabbedPane.addTab("<html><body><table width='80'><td align='center'>Post Proc.</td></table></body></html>", null, tabbedPane_8, null);
		tabbedPane_8.setLayout(null);
		
		JLabel lblAnalizaWynikw = new JLabel(" Analiza wynik\u00F3w");
		lblAnalizaWynikw.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnalizaWynikw.setBounds(10, 11, 171, 14);
		tabbedPane_8.add(lblAnalizaWynikw);
		
		btnNewButton_3 = new JButton("Wy\u015Bwietl wyniki");
		btnNewButton_3.setBounds(10, 36, 181, 28);
		tabbedPane_8.add(btnNewButton_3);
		
		ListenForButton lForButton = new ListenForButton();
		btnNewButton_3.addActionListener(lForButton);
		
		JPanel tabbedPane_9 = new JPanel();
		tabbedPane.addTab("<html><body><table width='80'><td align='center'>Help</td></table></body></html>", null, tabbedPane_9, null);
		tabbedPane_9.setLayout(null);
	}
	
	private class ListenForButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == btnNewButton_3)
			{

				try {
					System.out.println("Opening notepad");
					Runtime runTime = Runtime.getRuntime();
					Process process = runTime.exec("paraFoam");
					
				} catch (IOException e1) {
					e1.printStackTrace();
					System.out.println("No file");
				}
				
	        }
		        
		   }
	     
	    }

}
