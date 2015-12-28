package Datas;

public class Pokemon {
	
	private String typePokemon;
	private int PV;
	private int Level;
	private String evolutionPokemon;
	private String Attack[];
	
	public Pokemon(String typePokemon, int pV, int level,
			String evolutionPokemon, String[] attack) {
		super();
		this.typePokemon = typePokemon;
		PV = pV;
		Level = level;
		this.evolutionPokemon = evolutionPokemon;
		Attack = attack;
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

	public String[] getAttack() {
		return Attack;
	}

	//public void setAttack(String[] attack) {
	//	Attack = attack;
	//}

	

}
