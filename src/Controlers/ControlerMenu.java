package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Datas.Pokedeck;
import Datas.cards;
import IHM.Gestion_Pokeck;
import IHM.menu;

public class ControlerMenu implements ActionListener {

	
	private menu MenuC;
	private String NomPokecek;
	private Pokedeck P1;

	
	public ControlerMenu(menu menu){
		
		
		this.MenuC = menu;
	}
	public void actionPerformed(ActionEvent e) {
	
		if(((JButton)(e.getSource())).getText()=="Nouveau"){

		System.out.println("nouveau");	
		Gestion_Pokeck GP = new Gestion_Pokeck();
		
		if (MenuC.GetNamePoke().isEmpty()){
			
			JOptionPane.showMessageDialog(MenuC,
					"Vous devez entrer un nom pour votre pokedeck",
					"Attention", JOptionPane.ERROR_MESSAGE);
		}else{
	
		GP.setVisible(true);
		MenuC.setVisible(false);
		NomPokecek=MenuC.GetNamePoke();
		ArrayList<cards> ListCard = new ArrayList<cards>();
		P1 = new Pokedeck(ListCard, NomPokecek);
		
		}
		
		}
		
		if(((JButton)(e.getSource())).getText()=="OK"){

		System.out.println("Ok");
		Gestion_Pokeck GP = new Gestion_Pokeck();
		GP.setVisible(true);
		MenuC.setVisible(false);
		
		}
	}
	public Pokedeck getP1() {
		return P1;
	}
	
	public void setP1(Pokedeck p1) {
		P1 = p1;
	}

	
	
}
