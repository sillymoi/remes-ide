package se.mdh.progresside.uppaal.launch.verifyer;

public class Option {
	private String name;
	private String type;
	private String def;
	private String display;
		
	public Option(String name, String type, String def, String display) {
		this.name = name;
		this.type = type;
		this.def = def;
		this.display = display;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDef() {
		return def;
	}
	public void setDef(String def) {
		this.def = def;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
}
