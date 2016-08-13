package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pojo.Kitaplar;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Window.Type;

public class Kitaplar_Form extends JFrame {

	private JPanel contentPane;
	
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JComboBox comboBox = new JComboBox();
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Bask\u0131l\u0131 Yay\u0131n");
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("E Kitap");
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Online Kitap");
	JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Yerli");
	JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Yabanc\u0131");
	JComboBox comboBox_1 = new JComboBox();
	static Kitaplar_Form frame = new Kitaplar_Form();

	
	String mensei="";
	String tur="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kitaplar_Form() {
		setType(Type.POPUP);
		setTitle("Kitap Y\u00F6netimi");
		comboBox.setBackground(Color.YELLOW);
		comboBox.addItem("Seçiniz");
		comboBox.addItem("Papatya");
		comboBox.addItem("Palme");
		comboBox.addItem("Alfa");
		comboBox.addItem("Kodlab");
		comboBox.addItem("Sun");
		comboBox_1.setBackground(Color.YELLOW);
	    
		comboBox_1.addItem("Seçiniz");
		comboBox_1.addItem("1.hamur");
		comboBox_1.addItem("2.hamur");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKitapAd = new JLabel("Kitap Ad\u0131:");
		lblKitapAd.setForeground(Color.RED);
		lblKitapAd.setBounds(50, 43, 86, 14);
		contentPane.add(lblKitapAd);
		
		JLabel lblKitapYazar = new JLabel("Kitap Yazar\u0131:");
		lblKitapYazar.setForeground(Color.RED);
		lblKitapYazar.setBounds(50, 77, 86, 14);
		contentPane.add(lblKitapYazar);
		
		JLabel lblNewLabel = new JLabel("ISBN:");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(50, 108, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bas\u0131m Y\u0131l\u0131:");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(47, 133, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bas\u0131m Evi:");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(47, 158, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fiyat:");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(47, 183, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblKitapTr = new JLabel("Kitap T\u00FCr\u00FC:");
		lblKitapTr.setForeground(Color.RED);
		lblKitapTr.setBounds(47, 216, 66, 14);
		contentPane.add(lblKitapTr);
		
		
		comboBox.setBounds(138, 155, 94, 20);
		contentPane.add(comboBox);
		rdbtnNewRadioButton.setBackground(Color.YELLOW);
		
		
		rdbtnNewRadioButton.setBounds(136, 211, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton_1.setBackground(Color.YELLOW);
		
		
		rdbtnNewRadioButton_1.setBounds(135, 237, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_2.setBackground(Color.YELLOW);
		
		
		rdbtnNewRadioButton_2.setBounds(136, 265, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		textField = new JTextField();
		textField.setBackground(Color.YELLOW);
		textField.setBounds(138, 40, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.YELLOW);
		textField_1.setBounds(138, 74, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.YELLOW);
		textField_2.setBounds(138, 102, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.YELLOW);
		textField_3.setBounds(138, 130, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.YELLOW);
		textField_4.setBounds(136, 180, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Men\u015Fei:");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(371, 26, 57, 14);
		contentPane.add(lblNewLabel_4);
		
		
		rdbtnNewRadioButton_3.setBackground(Color.YELLOW);
		rdbtnNewRadioButton_3.setBounds(410, 39, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4.setBackground(Color.YELLOW);
		rdbtnNewRadioButton_4.setBounds(412, 65, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(rdbtnNewRadioButton_4);
		group.add(rdbtnNewRadioButton_3);
		
		JLabel lblKalite = new JLabel("Kalite:");
		lblKalite.setForeground(Color.RED);
		lblKalite.setBounds(382, 133, 46, 14);
		contentPane.add(lblKalite);
		
		JSpinner spinner = new JSpinner();
		spinner.setBackground(Color.YELLOW);
		spinner.setBounds(433, 145, 29, 20);
		contentPane.add(spinner);
		
		JLabel lblKaliteTipi = new JLabel("Kalite Tipi:");
		lblKaliteTipi.setForeground(Color.RED);
		lblKaliteTipi.setBounds(383, 183, 74, 14);
		contentPane.add(lblKaliteTipi);
		
		
		comboBox_1.setBounds(428, 203, 91, 20);
		contentPane.add(comboBox_1);
		
		JButton btnYeni = new JButton("YEN\u0130");
		btnYeni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				comboBox.setSelectedItem("Seçiniz");
				comboBox_1.setSelectedItem("Seçiniz");
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton_3.setSelected(false);
				rdbtnNewRadioButton_4.setSelected(false);
				spinner.setValue(0);
				
				
				
				
			}
		});
		btnYeni.setBackground(Color.YELLOW);
		btnYeni.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\jdbc_odev\\bin\\yeni.png"));
		btnYeni.setBounds(114, 301, 133, 57);
		contentPane.add(btnYeni);
		
		JButton btnListele = new JButton("L\u0130STELE");
		btnListele.setBackground(Color.YELLOW);
		btnListele.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\jdbc_odev\\bin\\liste.png"));
		btnListele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Kitaplar liste=new Kitaplar();
				Kitap_Listele listele=new Kitap_Listele();		
				frame.setVisible(false);
				listele.setVisible(true);
				
				
				try {
					listele.getTable().setModel(liste.listele());
					System.out.println("listelendi");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("olmadý");
					e.printStackTrace();
				}
		
				
			}
		});
		btnListele.setBounds(333, 299, 123, 55);
		contentPane.add(btnListele);
		
		JButton btnKaydet = new JButton("KAYDET");
		btnKaydet.setBackground(Color.YELLOW);
		btnKaydet.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\jdbc_odev\\bin\\kaydett.png"));
		btnKaydet.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) 
			{
				
				if(rdbtnNewRadioButton_4.isSelected()==true&&rdbtnNewRadioButton_3 .isSelected()==false)
				{
					mensei="Yabancý";
					rdbtnNewRadioButton_3.setEnabled(false);
				}
				else if(rdbtnNewRadioButton_4.isSelected()==false&&rdbtnNewRadioButton_3 .isSelected()==true)
				{
					mensei="Yerli";
				}
				
				
				
				rdbtnNewRadioButton_3.addActionListener(this);
				rdbtnNewRadioButton_4.addActionListener(this);
				
				if(rdbtnNewRadioButton.isSelected()==true&&rdbtnNewRadioButton_1.isSelected()==false&&rdbtnNewRadioButton_2.isSelected()==false)
				{
					tur="Baskýlý Yayýn";
				}
				else if(rdbtnNewRadioButton.isSelected()==false&&rdbtnNewRadioButton_1.isSelected()==true&&rdbtnNewRadioButton_2.isSelected()==false)
				{
					 tur="E kitap";
				}
				else if(rdbtnNewRadioButton.isSelected()==false&&rdbtnNewRadioButton_1.isSelected()==false&&rdbtnNewRadioButton_2.isSelected()==true)
				{
					 tur="Online Kitap";
				}
				
				Kitaplar kitaplar=new Kitaplar();
				kitaplar.setKitapAdi(textField.getText());
				kitaplar.setKitapYazari(textField_1.getText());
				kitaplar.setISBN(textField_2.getText());
				kitaplar.setBasimYili(textField_3.getText());
				kitaplar.setBasimEvi(comboBox.getSelectedItem().toString());
				kitaplar.setKitapFiyati(Float.parseFloat(textField_4.getText()));
				kitaplar.setKitapTuru(tur);
				kitaplar.setMensei(mensei);
				kitaplar.setKalite(spinner.getValue().toString());
				kitaplar.setKagitTipi(comboBox_1.getSelectedItem().toString());
				
				try {
					kitaplar.insert();
					
					JOptionPane.showMessageDialog(null, "Kayýt baþarýlý.");
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					
					
					e.getMessage();
					JOptionPane.showMessageDialog(null, "Kayýt yapýlamadý.");
				}
				
				
				
				
			}
		});
		btnKaydet.setBounds(514, 299, 133, 50);
		contentPane.add(btnKaydet);
		
		JButton btnk = new JButton("");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				System.exit(1);
				
				
			}
		});
		btnk.setBackground(Color.RED);
		btnk.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\jdbc_odev\\bin\\\u00E7\u0131k\u0131\u015F.png"));
		btnk.setBounds(681, 332, 47, 41);
		contentPane.add(btnk);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\jdbc_odev\\bin\\k\u00FCt\u00FCphanee.jpg"));
		lblNewLabel_5.setBounds(-8, 0, 736, 390);
		contentPane.add(lblNewLabel_5);
	}
}
