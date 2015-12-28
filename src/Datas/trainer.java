package Datas;

public class trainer {

	private String trainerType;
	private String RulesTrainer[];

	public trainer(String trainerType, String[] rulesTrainer) {
		super();
		this.trainerType = trainerType;
		RulesTrainer = rulesTrainer;
	}

	public String getTrainerType() {
		return trainerType;
	}

	//public void setTrainerType(String trainerType) {
	//	this.trainerType = trainerType;
	//}

	public String[] getRulesTrainer() {
		return RulesTrainer;
	}

	//public void setRulesTrainer(String[] rulesTrainer) {
	//	RulesTrainer = rulesTrainer;
	//}
	

}
