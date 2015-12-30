package IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import Controlers.ControlerMenu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNamePoke;

	/**
	 * Create the frame.
	 */
	public menu() {
		setTitle("Pok\u00E9deck");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNouveauPokedeck = new JLabel("Nouveau Pokedeck :");
		lblNouveauPokedeck.setBounds(72, 135, 116, 14);
		panel.add(lblNouveauPokedeck);
		
		textFieldNamePoke = new JTextField();
		textFieldNamePoke.setBounds(226, 132, 116, 20);
		panel.add(textFieldNamePoke);
		textFieldNamePoke.setColumns(10);
		
		JButton btnNouveau = new JButton("Nouveau");
		btnNouveau.addActionListener(new ControlerMenu(this));
		btnNouveau.setBounds(147, 194, 89, 23);
		panel.add(btnNouveau);
	}
	
	public String GetNamePoke(){
	
		return textFieldNamePoke.getText();
	
	}
}
