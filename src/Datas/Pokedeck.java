package Datas;

import java.util.ArrayList;

public class Pokedeck {

	private ArrayList<cards> CardsList;
	private String name;
	
	
	public Pokedeck(ArrayList<cards> cardsList, String name) {
		
		this.CardsList = cardsList;
		this.name = name;
	}

	/**
	 * 
	 * @param Name
	 * @param Numero
	 * This method Search a card with 2 attributes
	 * @return card
	 */
	public cards searchCardByAttribute(String Name, int Numero){
		
		for(cards card: this.CardsList){
			if((card.getName().equals(Name))||(card.getNumCarte()== Numero)){
					return card;
			}
		}
		return null;	
		
	}
	
	
	/**
	 * 
	 * @param Name
	 * @param Type
	 * @param Number
	 * @param description
	 * This method Update a Card But Only description
	 * 
	 * 	 */
	public void updateDescriptionCard(String Name, String description){
		
		for(cards card: this.CardsList){
			if(card.getName().equals(Name)){
				 card.setDescription(description);
			}
		}
		
	}
	
	public void AddCard(cards c){
		
		CardsList.add(c);
		
	}
	
	public ArrayList<cards> getCardsList() {
		return CardsList;
	}

	public String getName() {
		return name;
	}
	

}
