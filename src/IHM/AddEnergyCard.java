package IHM;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

import Controlers.ControlerAddEnergyCard;
import Datas.Energy;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.JScrollPane;

public class AddEnergyCard extends JDialog {

	private JPanel contentPanel = new JPanel();
	private JTextField textFieldNomcard;
	private JTextField textFieldtypecard;
	private JTextField textFieldnumcarte;
	private JTextArea textAreaDesc;
	private ButtonGroup radioGroup = new ButtonGroup();
	

	/**
	 * Create the dialog.
	 */
	public AddEnergyCard() {
		setTitle("Add Energy Card");
		setBounds(100, 100, 474, 592);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(5, 99, 214, 318);
			lblNewLabel.setIcon(new ImageIcon("Images\\Energy.jpg"));
			contentPanel.add(lblNewLabel);
		}
		
		textFieldNomcard = new JTextField();
		textFieldNomcard.setBounds(268, 5, 86, 20);
		contentPanel.add(textFieldNomcard);
		textFieldNomcard.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(224, 8, 41, 14);
		contentPanel.add(lblNom);
		
		textFieldtypecard = new JTextField();
		textFieldtypecard.setEditable(false);
		textFieldtypecard.setText("energie");
		textFieldtypecard.setBounds(268, 30, 86, 20);
		contentPanel.add(textFieldtypecard);
		textFieldtypecard.setColumns(10);
		
		JLabel lblType = new JLabel("type:");
		lblType.setBounds(224, 33, 41, 14);
		contentPanel.add(lblType);
		
		JLabel lblNumeroDeCarte = new JLabel("numero de carte:");
		lblNumeroDeCarte.setBounds(224, 58, 130, 14);
		contentPanel.add(lblNumeroDeCarte);
		
		textFieldnumcarte = new JTextField();
		textFieldnumcarte.setBounds(335, 55, 86, 20);
		contentPanel.add(textFieldnumcarte);
		textFieldnumcarte.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(224, 80, 71, 14);
		contentPanel.add(lblDescription);
		
		JLabel lblTypeDenergie = new JLabel("Type d'energie : (1 choix)");
		lblTypeDenergie.setBounds(229, 152, 162, 14);
		contentPanel.add(lblTypeDenergie);
		
	
		 
		 //String[] colors = {"Red", "Green", "Blue"};
		 String[] EnergyType = Energy.getEnergyType();
		 JRadioButton[] radioBtns = new JRadioButton[EnergyType.length];
		 int x = 235;
		 int y =145;
		 int width = 109; 
		 int height = 23;
		 for (int i = 0; i < radioBtns.length; i++) {
		    radioBtns[i] = new JRadioButton(EnergyType[i]);
		    radioBtns[i].setActionCommand(EnergyType[i]);
		    radioBtns[i].setBounds(x,y=y+26,width,height);
		    radioGroup.add(radioBtns[i]);		
		    contentPanel.add(radioBtns[i]);
		 }
		 
		 //ButtonModel model = radioGroup.getSelection();
		 //final String actionCommand = (model == null) ? "" : model.getActionCommand();
		 
		 JButton btnCreer = new JButton("Creer");
		 btnCreer.addActionListener(new ControlerAddEnergyCard(this));
			//btnCreer.addActionListener(new ActionListener() {
				//public void actionPerformed(ActionEvent arg0) {
					
					//System.out.println(radioGroup.getSelection().getActionCommand());
					//System.out.println(actionCommand);
			//	}
			//});
			btnCreer.setBounds(359, 509, 89, 23);
			contentPanel.add(btnCreer);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(291, 79, 130, 62);
			contentPanel.add(scrollPane);
			
			textAreaDesc = new JTextArea();
			scrollPane.setViewportView(textAreaDesc);
		 
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		

		
	}
	

	public Object getEnergyChoice(){
		 
		return radioGroup.getSelection().getActionCommand();
	}
	
	public String getNomEnergyCard(){
		
		return textFieldNomcard.getText().toLowerCase();
	}
	
	public String getTypeEnergyCard(){
		
		return textFieldtypecard.getText().toLowerCase();
	}
	
	public int getNumberOfEnergyCard(){
		
		return Integer.parseInt(textFieldnumcarte.getText());
	}
	
	public String getDescriptionEnergyCard(){
		
		return textAreaDesc.getText();
	}

}


 