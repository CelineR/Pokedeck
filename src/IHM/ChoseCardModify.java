package IHM;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlers.ControlerModify;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoseCardModify extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNom;
	private JTextField textFieldNumero;

	/**
	 * Create the dialog.
	 */
	public ChoseCardModify() {
		setTitle("Carte a modifier");
		setBounds(100, 100, 308, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(36, 68, 46, 14);
		contentPanel.add(lblNom);
		
		JLabel lblNumro = new JLabel("Num\u00E9ro:");
		lblNumro.setBounds(36, 107, 82, 14);
		contentPanel.add(lblNumro);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(128, 65, 86, 20);
		contentPanel.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setText("");
		textFieldNumero.setBounds(128, 104, 86, 20);
		contentPanel.add(textFieldNumero);
		textFieldNumero.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnModifier = new JButton("Modifier");
				btnModifier.addActionListener(new ControlerModify(this));
				buttonPane.add(btnModifier);
			}
		}
	}


	public String getNameCardSearch(){
		
		return textFieldNom.getText();
		
	}
	
	public int getNumCardSearch(){
		
		return Integer.parseInt(textFieldNumero.getText());
	}
}
