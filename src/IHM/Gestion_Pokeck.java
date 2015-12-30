package IHM;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;


import Controlers.ControlerPokedeck;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Gestion_Pokeck extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Gestion_Pokeck() {
		setTitle("Gestion du pokedeck");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("Images\\pokemon.jpg"));
		label.setBounds(10, 37, 197, 312);
		contentPane.add(label);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(295, 11, 40, 14);
		contentPane.add(lblMenu);
		
		JButton btnConsult = new JButton("Consult");
		btnConsult.addActionListener(new ControlerPokedeck(this));
		btnConsult.setBounds(259, 149, 89, 23);
		contentPane.add(btnConsult);
		
		JButton btnModify = new JButton("Modify Description");
		btnModify.addActionListener(new ControlerPokedeck(this));
		btnModify.setBounds(228, 210, 141, 23);
		contentPane.add(btnModify);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ControlerPokedeck(this));
		btnSave.setBounds(259, 264, 89, 23);
		contentPane.add(btnSave);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ControlerPokedeck(this));
		btnAdd.setBounds(259, 81, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ControlerPokedeck(this));
		btnQuit.setBounds(259, 329, 89, 23);
		contentPane.add(btnQuit);
	}
}
