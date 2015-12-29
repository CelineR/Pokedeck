package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;



import IHM.Gestion_Pokeck;
import IHM.JdialogueAddCard;
import IHM.ShowDeckContent;

public class ControlerPokedeck implements ActionListener {
	
	private Gestion_Pokeck GP;
	private JdialogueAddCard JAD = new JdialogueAddCard();
	private ShowDeckContent SDC = new ShowDeckContent();
	private static int nbcartesMax = 60;
	
	public ControlerPokedeck(Gestion_Pokeck Gestion_Pokeck){
		
		this.GP = Gestion_Pokeck;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(((JButton)(e.getSource())).getText()=="Add"){
			
				if(ControlerMenu.getP1().getCardsList().size()== nbcartesMax-1){
					JOptionPane.showMessageDialog(GP,
							"Vous avez déjà 60 cartes dans votre Deck, supprimez-en pour pouvoir en ajouter.",
							"Attention", JOptionPane.ERROR_MESSAGE);
					
				}else{
					JAD.setVisible(true);
				}
		}
		
		if(((JButton)(e.getSource())).getText()=="Consult"){
			
			SDC.setVisible(true);
			
		}
		
		
		
	}
	

		

}
