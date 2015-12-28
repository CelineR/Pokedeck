package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Datas.Pokedeck;
import IHM.Gestion_Pokeck;
import IHM.JdialogueAddCard;

public class ControlerPokedeck implements ActionListener {
	
	private Gestion_Pokeck GP;
	private JdialogueAddCard JAD;
	private ControlerMenu CM;
	
	public ControlerPokedeck(Gestion_Pokeck Gestion_Pokeck){
		
		this.GP = Gestion_Pokeck;
	}

	

	
	public void actionPerformed(ActionEvent e) {
		
		
		if(((JButton)(e.getSource())).getText()=="Add"){
		
				if(CheckDeck()=="ok"){
										JAD = new JdialogueAddCard();
										JAD.setVisible(true);
					}
			
		}
		
		
	}
	
	// Verifie si le deck a - de 60 cartes
	private String CheckDeck(){
		
					
					if(CM.getP1().getCardList().size()== 59){
						JOptionPane.showMessageDialog(JAD,
								"Votre Deck comporte déjà 60 cartes ! Supprimez en pour pouvoir en ajouter de nouveau",
								"Attention", JOptionPane.ERROR_MESSAGE);
					
						return "nok";
					}else{
						
						return "ok";
					}
					
	}
		

}
