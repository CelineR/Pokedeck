package Datas;

import java.util.ArrayList;

public class Pokemon extends cards{

	private String typePokemon;
	private int PV;
	private int Level;
	private static String tblTypePokemon[]={"acier","combat","fee","dragon","eau","electrique","feu","glace","insecte","normal","plante","poison","psy","roche","sol","spectre","tenebres","vol"};
	private static String tblEvolutionPokemon[]={"de base","niveau 1","niveau 2", "niveau recree", "Pokemon Ex","Mega Ex", "team Plasma"};
	private String evolutionPokemon;
	private ArrayList<Rules> RulesAttack;
	
	public Pokemon(String Name, String Type, int Number, String description,
			String typePokemon, int pV, int level, String evolutionPokemon,
			ArrayList<Rules> RulesAttack) {
		super(Name, Type, Number, description);
		this.typePokemon = typePokemon;
		this.PV = pV;
		this.Level = level;
		this.evolutionPokemon = evolutionPokemon;
		this.RulesAttack = RulesAttack;
	}


	public static String[] gettblTypePokemon(){
		
		return tblTypePokemon;
	}
	
	public static String[] gettblEvolutionPokemon(){
		
		return tblEvolutionPokemon;
	}


	public String getTypePokemon() {
		return typePokemon;
	}

	//public void setTypePokemon(String typePokemon) {
	//	this.typePokemon = typePokemon;
	//}

	public int getPV() {
		return PV;
	}

	//public void setPV(int pV) {
	//	PV = pV;
	//}

	public int getLevel() {
		return Level;
	}

	//public void setLevel(int level) {
	//	Level = level;
	//}

	public String getEvolutionPokemon() {
		return evolutionPokemon;
	}

	//public void setEvolutionPokemon(String evolutionPokemon) {
	//	this.evolutionPokemon = evolutionPokemon;
	//}

	public ArrayList<Rules> getAttack() {
		return RulesAttack;
	}

	//public void setAttack(String[] attack) {
	//	Attack = attack;
	//}

	

}
