package IHM;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Controlers.ControlerMenu;
import Controlers.ControlerModify;
import Controlers.ControlerModifyDesc;
import Datas.cards;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyDesc extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private JTextField textFieldNom;
	private JTextField textFieldType;
	private JTextField textField;
	private JTextArea textAreaDesc;

	
	/**
	 * Create the dialog.
	 * @param numSearch 
	 * @param nomSearch 
	 */
	public ModifyDesc(String nomSearch, int numSearch) {
		
		cards C = ControlerMenu.getP1().searchCardByAttribute(nomSearch, numSearch);
		setTitle("Modifier la description de la carte");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNom = new JLabel("Nom");
			lblNom.setBounds(21, 28, 46, 14);
			contentPanel.add(lblNom);
		}
		{
			textFieldNom = new JTextField();
			textFieldNom.setText(C.getName());
			textFieldNom.setEditable(false);
			textFieldNom.setBounds(90, 25, 86, 20);
			contentPanel.add(textFieldNom);
			textFieldNom.setColumns(10);
		}
		{
			JLabel lblType = new JLabel("Type");
			lblType.setBounds(21, 64, 46, 14);
			contentPanel.add(lblType);
		}
		{
			textFieldType = new JTextField();
			textFieldType.setText(C.getType());
			textFieldType.setEditable(false);
			textFieldType.setBounds(90, 61, 86, 20);
			contentPanel.add(textFieldType);
			textFieldType.setColumns(10);
		}
		{
			JLabel lblNumero = new JLabel("Numero");
			lblNumero.setBounds(21, 101, 46, 14);
			contentPanel.add(lblNumero);
		}
		{
			textField = new JTextField();
			textField.setText(Integer.toString(C.getNumCarte()));
			textField.setEditable(false);
			textField.setBounds(90, 98, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblDescription = new JLabel("Description");
			lblDescription.setBounds(21, 140, 80, 14);
			contentPanel.add(lblDescription);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(124, 129, 300, 88);
		contentPanel.add(scrollPane);
		
	    textAreaDesc = new JTextArea();
		textAreaDesc.setText(C.getdescription());
		scrollPane.setViewportView(textAreaDesc);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnModify = new JButton("Modify");
				btnModify.addActionListener(new ControlerModifyDesc(this));
				buttonPane.add(btnModify);
			}
		}
	}


	public String getNameCardModify(){
		
		return textFieldNom.getText();
	}
	
	public String getTypeCard(){
		
		return textFieldType.getText();
	}
	
	public int getNumofCrd(){
		
		return Integer.parseInt(textField.getText());
	}
	
	public String getTextDesc(){
		
		return textAreaDesc.getText();
	}
}
