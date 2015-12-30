package IHM;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import Controlers.ControlerAddCard;
import Controlers.ControlerPokedeck;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JdialogueAddCard extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public JdialogueAddCard() {
		setTitle("Choisir une carte");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMerciDeChoisir = new JLabel("Merci de choisir la carte que vous voulez ajouter a votre Deck");
			lblMerciDeChoisir.setBounds(20, 29, 414, 14);
			contentPanel.add(lblMerciDeChoisir);
		}
		{
			JButton btnEnergie = new JButton("Energie");
			btnEnergie.addActionListener(new ControlerAddCard(this));
			btnEnergie.setBounds(35, 100, 89, 23);
			contentPanel.add(btnEnergie);
		}
		{
			JButton btnEntraineur = new JButton("Entraineur");
			btnEntraineur.addActionListener(new ControlerAddCard(this));
			btnEntraineur.setBounds(160, 100, 113, 23);
			contentPanel.add(btnEntraineur);
		}
		{
			JButton btnPokmon = new JButton("Pok\u00E9mon");
			btnPokmon.addActionListener(new ControlerAddCard(this));
			btnPokmon.setBounds(302, 100, 89, 23);
			contentPanel.add(btnPokmon);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
