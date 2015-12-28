package IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion_Pokeck frame = new Gestion_Pokeck();
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
	public Gestion_Pokeck() {
		setTitle("Gestion du pokedeck");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\C\u00E9line\\Desktop\\pokemon.jpg"));
		label.setBounds(10, 37, 197, 312);
		contentPane.add(label);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(295, 11, 40, 14);
		contentPane.add(lblMenu);
		
		JButton btnConsult = new JButton("Consult");
		btnConsult.setBounds(259, 107, 89, 23);
		contentPane.add(btnConsult);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(259, 157, 89, 23);
		contentPane.add(btnModify);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(259, 206, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(259, 252, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnMenuPp = new JButton("Menu PP");
		btnMenuPp.setBounds(259, 302, 89, 23);
		contentPane.add(btnMenuPp);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ControlerPokedeck(this));
		btnAdd.setBounds(259, 59, 89, 23);
		contentPane.add(btnAdd);
	}
}
