package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Datas.Pokemon;
import Datas.Rules;
import Datas.cards;
import IHM.AddPokemonCard;

public class ControlerAddPokemonCard implements ActionListener {

	private AddPokemonCard APC;
	private ArrayList<Rules> AttaqueList = new ArrayList<Rules>();
	
	public ControlerAddPokemonCard(AddPokemonCard APC) {
		
		this.APC =APC;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(((JButton)(e.getSource())).getText()=="Ajouter"){
			
			try{
				
				Rules R1 = new Rules(APC.getAreaAttaque1(), APC.getCoutAttaque1());
				Rules R2 = new Rules(APC.getAreaAttaque2(), APC.getCoutAttaque2());
				
				AttaqueList.add(R1);
				AttaqueList.add(R2);
				
				cards pokemon = new Pokemon(APC.getNomPokeCard(), APC.getTypeCardPoke(), APC.getNumCartePoke(),
						APC.getDescPokemon(),APC.getTypePoke(),APC.getPvPokemon(),APC.getLvlPokemon(), APC.getEvolPoke(), AttaqueList);

				ControlerMenu.getP1().AddCard(pokemon);
				
				JOptionPane.showMessageDialog(APC,
						"Votre carte "+ APC.getNomPokeCard() +" a bien été ajoutée !",
						"Confirmation", JOptionPane.INFORMATION_MESSAGE);
				
				APC.setVisible(false);
				
				
			}catch(NullPointerException | NumberFormatException e1){
				
				JOptionPane.showMessageDialog(APC,
						"Un ou plusieurs champ est vide ou mal renseigné",
						"Attention", JOptionPane.ERROR_MESSAGE);
				
			}
		}
	}

}
