package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import IHM.ChoseCardModify;
import IHM.Gestion_Pokeck;
import IHM.JdialogueAddCard;
import IHM.ShowDeckContent;

public class ControlerPokedeck implements ActionListener {
	
	private Gestion_Pokeck GP;
	private ChoseCardModify CCM = new ChoseCardModify();
	private JdialogueAddCard JAD = new JdialogueAddCard();
	private ShowDeckContent SDC = new ShowDeckContent();;
	private static int nbcartesMax = 60;
	
	public ControlerPokedeck(Gestion_Pokeck Gestion_Pokeck){
		
		this.GP = Gestion_Pokeck;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(((JButton)(e.getSource())).getText()=="Add"){
			
				if(ControlerMenu.getP1().getCardsList().size()== nbcartesMax-1){
					JOptionPane.showMessageDialog(GP,
							"Vous avez d�j� 60 cartes dans votre Deck, supprimez-en pour pouvoir en ajouter.",
							"Attention", JOptionPane.ERROR_MESSAGE);
					
				}else{
					JAD.setVisible(true);
				}
		}
		
		if(((JButton)(e.getSource())).getText()=="Modify Description"){
			
			CCM.setVisible(true);
			
		}

		if(((JButton)(e.getSource())).getText()=="Save"){
			
		
				
				try {
					
					ControlerMenu.getP1().save();
					JOptionPane.showMessageDialog(GP,
							"Votre Deck est enregistr� sous: "+ ControlerMenu.getP1().getName()+".serial",
							"Attention", JOptionPane.INFORMATION_MESSAGE);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(GP,
							"Une erreur est survenue.",
							"Attention", JOptionPane.ERROR_MESSAGE);
				}
				
			
			
		}

		
		if(((JButton)(e.getSource())).getText()=="Consult"){
			
			SDC.setVisible(true);
			
		}

		if(((JButton)(e.getSource())).getText()=="Quit"){
			
			GP.setVisible(false);
			
		}
		
		
		
	}
	

		

}
