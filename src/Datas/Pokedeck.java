package Datas;

import java.util.ArrayList;

public class Pokedeck {

	private ArrayList<cards> CardsList;
	private String name;
	
	
	public Pokedeck(ArrayList<cards> cardsList, String name) {
		
		this.CardsList = cardsList;
		this.name = name;
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
