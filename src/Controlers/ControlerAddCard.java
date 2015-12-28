	package Controlers;
	
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	
	import javax.swing.JButton;
	import javax.swing.JOptionPane;
	
	import Datas.Pokedeck;
	import Datas.cards;
	import IHM.JdialogueAddCard;
	
	public class ControlerAddCard  implements ActionListener{
		
		private JdialogueAddCard JAD;
		private ControlerMenu CM;
		private int MaxEnergyCard;
		private int MaxEntraineurCard;
		private int MaxPokemonCard;
		
		
		public ControlerAddCard(JdialogueAddCard JAD){
			
			this.JAD = JAD;
			
			
		}
	
		public void actionPerformed(ActionEvent e) {
			
	
			if(((JButton)(e.getSource())).getText()=="Energie"){
				
			//	JOptionPane.showMessageDialog(JAD,
			//			"Rappellez-vous 1 ou 2 type d'énergie maximum !",
			//   "Conseil", JOptionPane.INFORMATION_MESSAGE);
				
				
				
			}
			
	
			if(((JButton)(e.getSource())).getText()=="Entraineur"){

			}
			
	
			if(((JButton)(e.getSource())).getText()=="Pok\u00E9mon"){

			}
			
		}

			
	
	
	}
