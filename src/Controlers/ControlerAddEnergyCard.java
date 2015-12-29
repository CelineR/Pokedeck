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
				//System.out.println(AED.getNumberOfEnergyCard());
				//System.out.println(AED.getDescriptionEnergyCard());
				//System.out.println(AED.getTypeEnergyCard());
				//System.out.println(AED.getEnergyChoice());
				//System.out.println(AED.getNomEnergyCard());
				
				cards Energy = new Energy(AED.getNomEnergyCard(),AED.getTypeEnergyCard(), AED.getNumberOfEnergyCard(), AED.getDescriptionEnergyCard(), (String) AED.getEnergyChoice());
				ControlerMenu.getP1().AddCard(Energy);
				
				//System.out.println(ControlerMenu.getP1().getCardsList().size());
				
				JOptionPane.showMessageDialog(AED,
						"Votre carte "+ AED.getNomEnergyCard()  +" a bien été ajoutée !",
						"Confirmation", JOptionPane.INFORMATION_MESSAGE);
				
				AED.setVisible(false);
				
			}catch(NullPointerException | NumberFormatException e1){
				
				JOptionPane.showMessageDialog(AED,
						"Un ou plusieurs champ est vide ou mal renseigné",
						"Attention", JOptionPane.ERROR_MESSAGE);
				
			}
		
														 }
		
		}
	}


