package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kitap_Listele extends JFrame {

	private JPanel contentPane;
	static Kitap_Listele frame1 = new Kitap_Listele();
	private JButton btnNewButton;
	
	private JTable table;	
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kitap_Listele() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("<<ANASAYFA");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				Kitaplar_Form.frame.setVisible(true);
				
				frame1.setVisible(false);
			
			
				
				
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(512, 258, -452, -219);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.YELLOW);
		table.setBounds(26, 60, 532, 214);
		
		contentPane.add(table);
		
		
		
		btnNewButton.setBounds(48, 310, 114, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\jdbc_odev\\bin\\k\u00FCt\u00FCphanee.jpg"));
		label.setBounds(0, 0, 568, 357);
		contentPane.add(label);
		
		
		
		
		
	}
}
