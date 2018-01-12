package se.mdh.progresside.uppaal.launch.verifyer;

public class Choice {
	private String name;
	private String display;
		
	public Choice(String name, String display) {
		this.name = name;
		this.display = display;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	
}
