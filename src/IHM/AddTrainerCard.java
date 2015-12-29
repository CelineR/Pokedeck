package IHM;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

import Controlers.ControlerAddTrainerCard;
import Datas.trainer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddTrainerCard extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNom;
	private JTextField txtTrainer;
	private JTextField textFieldNumcarte;
	private JTextField textFieldCout1;
	private JTextField textFieldCout2;
	private JComboBox<String> comboBoxType;
	private JTextArea textAreaDesc;
	private JTextArea textAreaRule1;
	private JTextArea textAreaRule2;


	/**
	 * Create the dialog.
	 */
	public AddTrainerCard() {
		setTitle("Add Trainer Card");
		setBounds(100, 100, 446, 486);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("Images\\Train.jpg"));
		label.setBounds(10, 75, 178, 250);
		contentPanel.add(label);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(209, 11, 46, 14);
		contentPanel.add(lblNom);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(209, 36, 46, 14);
		contentPanel.add(lblType);
		
		JLabel lblNumeroCarte = new JLabel("numero Carte:");
		lblNumeroCarte.setBounds(209, 61, 93, 14);
		contentPanel.add(lblNumeroCarte);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(209, 86, 70, 14);
		contentPanel.add(lblDescription);
		
		JLabel lblTypeTrainer = new JLabel("Type Trainer:");
		lblTypeTrainer.setBounds(209, 176, 93, 14);
		contentPanel.add(lblTypeTrainer);
		
		JLabel lblRegles = new JLabel("Regles :");
		lblRegles.setBounds(209, 201, 46, 14);
		contentPanel.add(lblRegles);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(245, 8, 86, 20);
		contentPanel.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		txtTrainer = new JTextField();
		txtTrainer.setEditable(false);
		txtTrainer.setText("entraineur");
		txtTrainer.setBounds(245, 33, 86, 20);
		contentPanel.add(txtTrainer);
		txtTrainer.setColumns(10);
		
		textFieldNumcarte = new JTextField();
		textFieldNumcarte.setBounds(297, 58, 86, 20);
		contentPanel.add(textFieldNumcarte);
		textFieldNumcarte.setColumns(10);
		
		JScrollPane scrollPaneDesc = new JScrollPane();
		scrollPaneDesc.setBounds(289, 86, 114, 79);
		contentPanel.add(scrollPaneDesc);
		
		textAreaDesc = new JTextArea();
		scrollPaneDesc.setViewportView(textAreaDesc);
		
		comboBoxType = new JComboBox<String>();
	
		String[] trainertype = trainer.getTypeTrainerCard();
		 for (int i = 0; i < trainertype.length; i++) {
			 comboBoxType.addItem(trainertype[i]);
		 
		 }
		comboBoxType.setBounds(298, 173, 105, 20);
		contentPanel.add(comboBoxType);
		
		JLabel lblRegle = new JLabel("Regle 1:");
		lblRegle.setBounds(209, 226, 46, 14);
		contentPanel.add(lblRegle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(265, 226, 138, 41);
		contentPanel.add(scrollPane);
		
		textAreaRule1 = new JTextArea();
		scrollPane.setViewportView(textAreaRule1);
		
		JLabel lblCout = new JLabel("Cout 1:");
		lblCout.setBounds(209, 277, 46, 14);
		contentPanel.add(lblCout);
		
		textFieldCout1 = new JTextField();
		textFieldCout1.setBounds(275, 274, 86, 20);
		contentPanel.add(textFieldCout1);
		textFieldCout1.setColumns(10);
		
		JLabel lblRegle_1 = new JLabel("Regle 2:");
		lblRegle_1.setBounds(209, 321, 46, 14);
		contentPanel.add(lblRegle_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(271, 321, 132, 41);
		contentPanel.add(scrollPane_1);
	
		
		textAreaRule2 = new JTextArea();
		scrollPane_1.setViewportView(textAreaRule2);
		
		JLabel lblCout_1 = new JLabel("Cout 2:");
		lblCout_1.setBounds(209, 371, 46, 14);
		contentPanel.add(lblCout_1);
		
		textFieldCout2 = new JTextField();
		textFieldCout2.setBounds(275, 368, 86, 20);
		contentPanel.add(textFieldCout2);
		textFieldCout2.setColumns(10);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ControlerAddTrainerCard(this));
		btnAjouter.setBounds(331, 413, 89, 23);
		contentPanel.add(btnAjouter);
	}


	public String getNomTrainerCard(){
	
		return textFieldNom.getText().toLowerCase();
	}
	
	public String getTypeTrainerCard(){
		
		return txtTrainer.getText().toLowerCase();
	}
	
	public int getNumberTrainerCard(){
		
		return Integer.parseInt(textFieldNumcarte.getText());
	}
	
	public String getDescriptionTrainerCard(){
		
		return textAreaDesc.getText();
	}
	
	public String getTypeTrainer(){
		
		return comboBoxType.getSelectedItem().toString();
	}
	public String getRule1(){
		
		return textAreaRule1.getText();
	}
	
	public int getCoutRule1(){
		
		return Integer.parseInt(textFieldCout1.getText());
	}
	
	public String getRule2(){
	
		return textAreaRule2.getText();
		
	}
	
	public int getCoutRule2(){
		
		return Integer.parseInt(textFieldCout2.getText());
	}
	
	}