import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;


import javax.swing.JLabel;
import javax.swing.JTextField;



public class UI {
private Cezar cezar;
	private JFrame frmUI;
	private JPanel panelMeniu;
	private JPanel panelCriptare;
	private JPanel panelDecriptare;
	private JTextField textCr;
	private JTextField MsgCr;
	private JTextField textDe;
	private JTextField CheieDe;
	private JTextField MsgDe;
	private JTextField CheieCr;
	
	

	public void startApp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frmUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UI(Cezar cezar) {
		initialize();
		this.cezar=cezar;
	}


private void initialize() {
	frmUI = new JFrame();
	frmUI.setTitle("Codul lui Cezar");
	frmUI.setBounds(100, 100, 450, 300);
	frmUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmUI.getContentPane().setLayout(new CardLayout(0, 0));

	final JPanel panelMeniu = new JPanel();
	frmUI.getContentPane().add(panelMeniu, "name_94395102344254");
	panelMeniu.setLayout(null);
	panelMeniu.setVisible(true);

	final JPanel panelCriptare = new JPanel();
	frmUI.getContentPane().add(panelCriptare, "name_94397562062502");
	panelCriptare.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Text: ");
	lblNewLabel.setBounds(21, 32, 46, 14);
	panelCriptare.add(lblNewLabel);
	
	textCr = new JTextField();
	textCr.setBounds(77, 29, 305, 20);
	panelCriptare.add(textCr);
	textCr.setColumns(10);
	
	JLabel lblCriptare = new JLabel("Criptare");
	lblCriptare.setBounds(21, 136, 46, 14);
	panelCriptare.add(lblCriptare);
	
	MsgCr = new JTextField();
	MsgCr.setEditable(false);
	MsgCr.setBounds(77, 133, 305, 20);
	panelCriptare.add(MsgCr);
	MsgCr.setColumns(10);
	
	JButton btnBack = new JButton("Back");
	btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {				
				panelMeniu.setVisible(true);
				panelCriptare.setVisible(false);
		}	
		
	});
	btnBack.setBounds(83, 201, 89, 23);
	panelCriptare.add(btnBack);
	
	JButton btnCripteaza = new JButton("Cripteaza");
	btnCripteaza.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String tx=textCr.getText().toString();
			String ch=CheieCr.getText().toString();
			int number=Integer.parseInt(CheieCr.getText());
			String rezultat=cezar.criptare(tx,number);
			MsgCr.setText(rezultat+" ");
		}
	});
	btnCripteaza.setBounds(265, 201, 89, 23);
	panelCriptare.add(btnCripteaza);
	
	JLabel lblCheia_1 = new JLabel("Cheia");
	lblCheia_1.setBounds(21, 83, 46, 14);
	panelCriptare.add(lblCheia_1);
	
	CheieCr = new JTextField();
	CheieCr.setBounds(77, 80, 305, 20);
	panelCriptare.add(CheieCr);
	CheieCr.setColumns(10);
	
	
	JButton btnCriptareButton = new JButton("Criptare");
	btnCriptareButton.setFont(new java.awt.Font("Tahoma", 1, 14));
	btnCriptareButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			panelCriptare.setVisible(true);
			panelMeniu.setVisible(false);
		}
	});
	btnCriptareButton.setBounds(10, 56, 175, 43);
	panelMeniu.add(btnCriptareButton);
	
	final JPanel panelDecriptare = new JPanel();
	frmUI.getContentPane().add(panelDecriptare, "name_94404042532182");
	panelDecriptare.setLayout(null);
	
	JLabel lblMesaj = new JLabel("Mesaj");
	lblMesaj.setBounds(29, 32, 28, 14);
	panelDecriptare.add(lblMesaj);
	
	textDe = new JTextField();
	textDe.setBounds(67, 29, 327, 20);
	panelDecriptare.add(textDe);
	textDe.setColumns(10);
	
	JLabel lblDecriptare = new JLabel("Decriptare");
	lblDecriptare.setBounds(9, 133, 66, 14);
	panelDecriptare.add(lblDecriptare);
	
	CheieDe = new JTextField();
	CheieDe.setBounds(74, 89, 320, 20);
	panelDecriptare.add(CheieDe);
	CheieDe.setColumns(10);
	
	JLabel lblCheia = new JLabel("Cheia");
	lblCheia.setBounds(29, 92, 46, 14);
	panelDecriptare.add(lblCheia);
	
	MsgDe = new JTextField();
	MsgDe.setEditable(false);
	MsgDe.setBounds(67, 130, 327, 20);
	panelDecriptare.add(MsgDe);
	MsgDe.setColumns(10);
	
	JButton btnBack_1 = new JButton("Back");
	btnBack_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
			panelDecriptare.setVisible(false);
				panelMeniu.setVisible(true);
		}	
		
	});
	btnBack_1.setBounds(69, 198, 89, 23);
	panelDecriptare.add(btnBack_1);
	
	JButton btnDecriptare = new JButton("Decriptare");
	btnDecriptare.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String tx=textDe.getText().toString();
			String ch=CheieDe.getText().toString();
			int number=Integer.parseInt(CheieDe.getText());
			String rezultat=cezar.decriptare(tx,number);
			MsgDe.setText(rezultat+"");
		}
	});
	btnDecriptare.setBounds(253, 198, 105, 23);
	panelDecriptare.add(btnDecriptare);
	panelDecriptare.setVisible(false);
	JButton btnDecriptareButton = new JButton("Decriptare");
	
	btnDecriptareButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panelDecriptare.setVisible(true);
			panelMeniu.setVisible(false);
		}
	});
	btnDecriptareButton.setBounds(212, 56, 154, 43);
	panelMeniu.add(btnDecriptareButton);
}



}