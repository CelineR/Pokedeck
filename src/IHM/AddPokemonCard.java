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

import Controlers.ControlerAddPokemonCard;
import Datas.Pokemon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPokemonCard extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNom;
	private JTextField txtPokemon;
	private JTextField textFieldNumcarte;
	private JTextField textFieldPv;
	private JTextField textFieldLvl;
	private JTextField textFieldCoutAttaque1;
	private JTextField textFieldCoutAttaque2;
	private JComboBox<String> comboBoxTypePoke;
	private JComboBox<String> comboBoxEvolPoke;
	private JTextArea textAreaDesc;
	private JTextArea textAreaAttaque1;
	private JTextArea textAreaAttaque2;
	
	public static void main(String[] args) {
		try {
			AddPokemonCard dialog = new AddPokemonCard();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddPokemonCard() {
		setTitle("Add Pokemon Card");
		setBounds(100, 100, 463, 644);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 1, 493);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("Images\\Pokecarte.jpg"));
			label.setBounds(10, 74, 235, 371);
			getContentPane().add(label);
		}
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(264, 22, 46, 14);
		getContentPane().add(lblNom);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(325, 19, 86, 20);
		getContentPane().add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(264, 50, 46, 14);
		getContentPane().add(lblType);
		
		txtPokemon = new JTextField();
		txtPokemon.setEditable(false);
		txtPokemon.setText("Pokemon");
		txtPokemon.setBounds(325, 47, 86, 20);
		getContentPane().add(txtPokemon);
		txtPokemon.setColumns(10);
		
		JLabel lblNumeroDeCarte = new JLabel("Numero de carte");
		lblNumeroDeCarte.setBounds(264, 75, 96, 14);
		getContentPane().add(lblNumeroDeCarte);
		
		textFieldNumcarte = new JTextField();
		textFieldNumcarte.setBounds(325, 100, 86, 20);
		getContentPane().add(textFieldNumcarte);
		textFieldNumcarte.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(264, 132, 75, 14);
		getContentPane().add(lblDescription);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(264, 157, 147, 41);
		getContentPane().add(scrollPane);
		
		textAreaDesc = new JTextArea();
		scrollPane.setViewportView(textAreaDesc);
		
		JLabel lblTypePokemon = new JLabel("Type Pokemon :");
		lblTypePokemon.setBounds(264, 209, 96, 14);
		getContentPane().add(lblTypePokemon);
		
		comboBoxTypePoke = new JComboBox<String>();
		
		String[] TypePoke = Pokemon.gettblTypePokemon();
		 for (int i = 0; i < TypePoke.length; i++) {
			 comboBoxTypePoke.addItem(TypePoke[i]);
		 
		 }
		
		
		comboBoxTypePoke.setBounds(274, 234, 123, 20);
		getContentPane().add(comboBoxTypePoke);
		
		JLabel lblPv = new JLabel("PV :");
		lblPv.setBounds(264, 263, 46, 14);
		getContentPane().add(lblPv);
		
		textFieldPv = new JTextField();
		textFieldPv.setBounds(325, 260, 86, 20);
		getContentPane().add(textFieldPv);
		textFieldPv.setColumns(10);
		
		JLabel lblLvl = new JLabel("LVL:");
		lblLvl.setBounds(264, 288, 46, 14);
		getContentPane().add(lblLvl);
		
		textFieldLvl = new JTextField();
		textFieldLvl.setBounds(325, 285, 86, 20);
		getContentPane().add(textFieldLvl);
		textFieldLvl.setColumns(10);
		
		JLabel lblEvolutionPokmon = new JLabel("Evolution Pok\u00E9mon:");
		lblEvolutionPokmon.setBounds(264, 313, 112, 14);
		getContentPane().add(lblEvolutionPokmon);
		
		comboBoxEvolPoke = new JComboBox<String>();
		
		String[] EvolPoke = Pokemon.gettblEvolutionPokemon();
		 for (int i = 0; i < EvolPoke.length; i++) {
			 comboBoxEvolPoke.addItem(EvolPoke[i]);
		 
		 }
		
		 
		comboBoxEvolPoke.setBounds(274, 338, 124, 20);
		getContentPane().add(comboBoxEvolPoke);
		
		JLabel lblAttaque = new JLabel("Attaque 1:");
		lblAttaque.setBounds(255, 369, 84, 14);
		getContentPane().add(lblAttaque);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(264, 394, 138, 41);
		getContentPane().add(scrollPane_1);
		
		textAreaAttaque1 = new JTextArea();
		scrollPane_1.setViewportView(textAreaAttaque1);
		
		JLabel lblCout = new JLabel("Cout:");
		lblCout.setBounds(253, 446, 46, 14);
		getContentPane().add(lblCout);
		
		JLabel lblNewLabel = new JLabel("Attaque 2:");
		lblNewLabel.setBounds(255, 471, 66, 14);
		getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(264, 496, 138, 41);
		getContentPane().add(scrollPane_2);
		
		textAreaAttaque2 = new JTextArea();
		scrollPane_2.setViewportView(textAreaAttaque2);
		
		JLabel lblCout_1 = new JLabel("Cout:");
		lblCout_1.setBounds(255, 546, 46, 14);
		getContentPane().add(lblCout_1);
		
		textFieldCoutAttaque1 = new JTextField();
		textFieldCoutAttaque1.setBounds(293, 446, 86, 20);
		getContentPane().add(textFieldCoutAttaque1);
		textFieldCoutAttaque1.setColumns(10);
		
		textFieldCoutAttaque2 = new JTextField();
		textFieldCoutAttaque2.setText("");
		textFieldCoutAttaque2.setBounds(290, 543, 86, 20);
		getContentPane().add(textFieldCoutAttaque2);
		textFieldCoutAttaque2.setColumns(10);
		
		JButton btnValider = new JButton("Ajouter");
		btnValider.addActionListener(new ControlerAddPokemonCard(this));
		btnValider.setBounds(348, 571, 89, 23);
		getContentPane().add(btnValider);
	}

	public String getNomPokeCard(){
		return textFieldNom.getText().toLowerCase();
	}
	
	public String getTypeCardPoke(){
		return txtPokemon.getText();
	}
	
	public int getNumCartePoke(){
		return Integer.parseInt(textFieldNumcarte.getText());
	}
	
	public int getPvPokemon(){
		return Integer.parseInt(textFieldPv.getText());
	}
	
	public int getLvlPokemon(){
		
		return Integer.parseInt(textFieldLvl.getText());
	}
	
	public int getCoutAttaque1(){
		
		return Integer.parseInt(textFieldCoutAttaque1.getText());
	}
	
	public int getCoutAttaque2(){
		
		return Integer.parseInt(textFieldCoutAttaque2.getText());
	}
	
	public String getDescPokemon(){
		
		return textAreaDesc.getText();
	}
	
	public String getAreaAttaque1(){
		
		return textAreaAttaque1.getText();
	}
	
	public String getAreaAttaque2(){
		
		return textAreaAttaque2.getText();
	}
	
	public String getTypePoke(){
		
		return comboBoxTypePoke.getSelectedItem().toString();
		
	}
	
	public String getEvolPoke(){
		
		return comboBoxEvolPoke.getSelectedItem().toString();
		
	}
}
