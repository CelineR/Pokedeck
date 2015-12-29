package IHM;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controlers.ControlerShowDeck;
import Datas.ModelDeck;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowDeckContent extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private ModelDeck MD = new ModelDeck();
	/**
	 * Create the dialog.
	 */
	public ShowDeckContent() {
		setTitle("ShowMyDeck");
		setBounds(100, 100, 444, 369);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMonDeck = new JLabel("Mon Deck");
			lblMonDeck.setBounds(187, 25, 46, 14);
			contentPanel.add(lblMonDeck);
		}
		{
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 67, 398, 174);
			contentPanel.add(scrollPane);
			{
				table = new JTable();
				table.setModel(MD);
				scrollPane.setViewportView(table);
			}
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ControlerShowDeck(this));
			btnOk.setBounds(52, 266, 89, 23);
			contentPanel.add(btnOk);
		}
		
	}

}
