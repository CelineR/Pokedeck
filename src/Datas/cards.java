package Datas;

public abstract class cards {

	private String name;
	private String type;
	private int number;
	private String Description;
	
	 public cards(String Name, String Type, int Number, String description){
		 
		 this.name = Name;
		 this.type = Type;
		 this.number= Number;
		 this.Description = description;
		 
	 }



	public String getName() {
		return name;
	}
	
	public String getType(){
		
		return type;
	}
	
	public int getNumCarte(){
		
		return number;
	}

	public String getdescription(){
		
		return Description;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}
	
}
