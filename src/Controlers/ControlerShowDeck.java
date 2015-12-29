package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Datas.ModelDeck;
import IHM.ShowDeckContent;

public class ControlerShowDeck implements ActionListener{
	
	ShowDeckContent SHD;
	ModelDeck MD = new ModelDeck();
	
	public ControlerShowDeck(ShowDeckContent SHD){
		
		this.SHD=SHD;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(((JButton)(e.getSource())).getText()=="OK"){
			
			SHD.setVisible(false);
		
		}
		
		if(((JButton)(e.getSource())).getText()=="Supprimer"){
			
			
			if (SHD.getTable().getSelectedRow() != -1) {

				int Option = JOptionPane.showConfirmDialog(SHD,
						"Voulez-vous supprimer cette carte ?", "Delete",
						JOptionPane.YES_NO_OPTION);

				if (Option == JOptionPane.YES_OPTION) {

					SHD.getmodelMD().deleteProduit(SHD.getTable().getSelectedRow());
					SHD.getmodelMD().fireTableDataChanged();
					
				}
			} else {
				JOptionPane.showMessageDialog(SHD,
						"Veuillez selectioner un produit", "Attention",
						JOptionPane.WARNING_MESSAGE);
			}
		 
		}
		
	}

}
