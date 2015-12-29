	package Controlers;
	
	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
	



	import javax.swing.JButton;
import javax.swing.JOptionPane;
	



	import Datas.Pokedeck;
import Datas.cards;
import IHM.AddEnergyCard;
import IHM.AddPokemonCard;
import IHM.AddTrainerCard;
import IHM.JdialogueAddCard;
	
	public class ControlerAddCard  implements ActionListener{
		
		private JdialogueAddCard JAD;
		private AddEnergyCard AEC = new AddEnergyCard();
		private AddTrainerCard ATC = new AddTrainerCard();
		private AddPokemonCard APC = new AddPokemonCard();
		private int MaxTypeEnergyCard;
		private int MaxEntraineurCard;
		private int MaxPokemonCard;
		
		
		public ControlerAddCard(JdialogueAddCard JAD){
			
			this.JAD = JAD;
			
			
		}
	
		public void actionPerformed(ActionEvent e) {
			
	
			if(((JButton)(e.getSource())).getText()=="Energie"){
				
				JOptionPane.showMessageDialog(JAD,
						"Rappellez-vous 1 ou 2 type d'énergie maximum !",	
				"Conseil", JOptionPane.INFORMATION_MESSAGE);
				
				AEC.setVisible(true);
				JAD.setVisible(false);
				
			}
			
	
			if(((JButton)(e.getSource())).getText()=="Entraineur"){
				
				// Pas plus de 22 cartes
				ATC.setVisible(true);
				JAD.setVisible(false);
				

			}
			
	
			if(((JButton)(e.getSource())).getText()=="Pok\u00E9mon"){
				
				APC.setVisible(true);
				JAD.setVisible(false);

			}
			
		}

			
	
	
	}
