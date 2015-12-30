package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Datas.Rules;
import Datas.cards;
import Datas.trainer;
import IHM.AddTrainerCard;

public class ControlerAddTrainerCard implements ActionListener {

	private AddTrainerCard ATD;
	private ArrayList<Rules> RulesList = new ArrayList<Rules>();
	
	public ControlerAddTrainerCard(AddTrainerCard ATD){
		
		this.ATD=ATD;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(((JButton)(e.getSource())).getText()=="Ajouter"){
			
			try{
						
				Rules R1 = new Rules(ATD.getRule1(), ATD.getCoutRule1());
				Rules R2 = new Rules(ATD.getRule2(), ATD.getCoutRule2());
				
				RulesList.add(R1);
				RulesList.add(R2);
				
				cards trainer = new trainer(ATD.getNomTrainerCard(), ATD.getTypeTrainerCard(),ATD.getNumberTrainerCard(),
						ATD.getDescriptionTrainerCard(), ATD.getTypeTrainer(),RulesList);
				
				ControlerMenu.getP1().AddCard(trainer);
				
				JOptionPane.showMessageDialog(ATD,
						"Votre carte "+ ATD.getNomTrainerCard() +" a bien été ajoutée !",
						"Confirmation", JOptionPane.INFORMATION_MESSAGE);
				
				ATD.setVisible(false);
				
			}catch(NullPointerException | NumberFormatException e1){
				
				JOptionPane.showMessageDialog(ATD,
						"Un ou plusieurs champ est vide ou mal renseigné",
						"Attention", JOptionPane.ERROR_MESSAGE);
				
			}
		
														 }
			
		}
		
		
		}
		


