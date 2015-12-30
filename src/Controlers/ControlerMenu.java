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
	private String NomPokedeck;
	private static Pokedeck P1 = null;
	private ArrayList<cards> ListCard = new ArrayList<cards>();

	
	public ControlerMenu(menu menu){
		
		this.MenuC = menu;
	}
	
	public void actionPerformed(ActionEvent e) {
	
		if(((JButton)(e.getSource())).getText()=="Nouveau"){
	
		Gestion_Pokeck GP = new Gestion_Pokeck();
		
		if (MenuC.GetNamePoke().isEmpty()){
			
			JOptionPane.showMessageDialog(MenuC,
					"Vous devez entrer un nom pour votre pokedeck",
					"Attention", JOptionPane.ERROR_MESSAGE);
			
		}else{
	
		GP.setVisible(true);
		MenuC.setVisible(false);
		NomPokedeck=MenuC.GetNamePoke();
		P1 = new Pokedeck(ListCard, NomPokedeck);	
		System.out.println(getP1());
		
		}
		
		}
		
		if(((JButton)(e.getSource())).getText()=="OK"){

		System.out.println("Ok");
		Gestion_Pokeck GP = new Gestion_Pokeck();
		GP.setVisible(true);
		MenuC.setVisible(false);
		
		}
	
	}
	
	
	public static Pokedeck getP1() {
		return P1;
	}
	

	
	
}
