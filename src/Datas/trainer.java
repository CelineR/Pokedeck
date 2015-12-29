package Datas;

import java.util.ArrayList;

public class trainer extends cards {

	private String trainerType;
	private ArrayList<Rules> RulesTrainer;
	private static String TypeTrainerCard[]={"objet","supporter","stade","high-teck"};
	
	
	public trainer(String Name, String Type, int Number, String description,
			String trainerType, ArrayList<Rules> rulesTrainer) {
		super(Name, Type, Number, description);
		this.trainerType = trainerType;
		this.RulesTrainer = rulesTrainer;
	}


	public static String[] getTypeTrainerCard(){
		
		return TypeTrainerCard;
		
	}
	public String getTrainerType() {
		return trainerType;
	}

	//public void setTrainerType(String trainerType) {
	//	this.trainerType = trainerType;
	//}

	public ArrayList<Rules> getRulesTrainer() {
		return RulesTrainer;
	}

	//public void setRulesTrainer(String[] rulesTrainer) {
	//	RulesTrainer = rulesTrainer;
	//}
	

}
