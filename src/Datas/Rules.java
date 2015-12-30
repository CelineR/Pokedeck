package Datas;

public class Rules {
	
	private String Rule;
	private int cout;
	
	public Rules(String Rule, int cout){
		
		this.setRule(Rule);
		this.setCout(cout);
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public String getRule() {
		return Rule;
	}

	public void setRule(String rule) {
		Rule = rule;
	}

}
