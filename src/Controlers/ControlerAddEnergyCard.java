package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Datas.Energy;
import Datas.cards;
import IHM.AddEnergyCard;

public class ControlerAddEnergyCard implements ActionListener{
	
	private AddEnergyCard AED;

	
	public ControlerAddEnergyCard(AddEnergyCard AED){
		 
		this.AED=AED;
	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(((JButton)(e.getSource())).getText()=="Creer"){
		
			try{
				
				cards Energy = new Energy(AED.getNomEnergyCard(),AED.getTypeEnergyCard(), AED.getNumberOfEnergyCard(), AED.getDescriptionEnergyCard(), (String) AED.getEnergyChoice());
				ControlerMenu.getP1().AddCard(Energy);
				
				JOptionPane.showMessageDialog(AED,
						"Votre carte "+ AED.getNomEnergyCard()  +" a bien �t� ajout�e !",
						"Confirmation", JOptionPane.INFORMATION_MESSAGE);
				
				AED.setVisible(false);
				
			}catch(NullPointerException | NumberFormatException e1){
				
				JOptionPane.showMessageDialog(AED,
						"Un ou plusieurs champ est vide ou mal renseign�",
						"Attention", JOptionPane.ERROR_MESSAGE);
				
			}
		
														 }
		
		}
	}


