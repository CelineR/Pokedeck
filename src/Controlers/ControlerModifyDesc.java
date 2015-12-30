package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import IHM.ModifyDesc;

public class ControlerModifyDesc implements ActionListener {

	ModifyDesc MD;
	
	
	public ControlerModifyDesc(ModifyDesc MD){
		
		this.MD=MD;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(((JButton)(e.getSource())).getText()=="Modify"){
			
			try{
				
				ControlerMenu.getP1().updateDescriptionCard(MD.getNameCardModify(), MD.getTextDesc());
				
				JOptionPane.showMessageDialog(MD,
						"La carte a été modifiée",
						"C'est ok !", JOptionPane.INFORMATION_MESSAGE);
				
				MD.setVisible(false);
				
			}catch(NullPointerException | NumberFormatException e1){
			
			JOptionPane.showMessageDialog(MD,
					"Un ou plusieurs champ est vide ou mal renseigné",
					"Attention", JOptionPane.ERROR_MESSAGE);
			
		}
	
			}
		}
		
	
}
