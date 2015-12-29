package Datas;

public class Energy extends cards{
	
	private static String tableenergyType[] = {"plante","feu","eau","electricite","psy","combat","obscurite","metal","fee","dragon","inclore"};
	private String energyType;
	
	public Energy(String Name, String Type, int Number, String description, String energyType) {
		super(Name, Type, Number, description);
		this.energyType=energyType;
		
	}

	public static  String[] getEnergyType() {
		return tableenergyType;
	}






	
	


}
