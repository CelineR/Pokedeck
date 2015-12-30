package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import IHM.ChoseCardModify;
import IHM.ModifyDesc;

public class ControlerModify implements ActionListener{
	
	ChoseCardModify CCM;
	String NomSearch;
	int NumSearch;


	public ControlerModify(ChoseCardModify CCM) {
		// TODO Auto-generated constructor stub
		this.CCM = CCM;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(((JButton)(e.getSource())).getText()=="Modifier"){
			
			try{
				
				NomSearch=CCM.getNameCardSearch();
				NumSearch=CCM.getNumCardSearch();
				
				ModifyDesc MD = new ModifyDesc(NomSearch,NumSearch);
				MD.setVisible(true);
				CCM.setVisible(false);
				
			}catch(NullPointerException | NumberFormatException e1){
				
				JOptionPane.showMessageDialog(CCM,
						"Un ou plusieurs champ est vide ou mal renseigné",
						"Attention", JOptionPane.ERROR_MESSAGE);
				
			}
		}
	}

}
