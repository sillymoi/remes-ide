package se.mdh.progresside.uppaal.launch.verifyer;

import java.util.HashMap;
import java.util.Map;

public class ChoiceOption extends Option {

	private Choice[] choices;

	private Map<String, String> displayToNameMap = new HashMap<String, String>();
	private Map<String, String> nameToDisplayMap = new HashMap<String, String>();

	public ChoiceOption(String name, String type, String def, String display,
			Choice[] choices) {
		super(name, type, def, display);
		setChoices(choices);
	}

	public void setChoices(Choice[] choices) {
		this.choices = choices;

		displayToNameMap.clear();
		nameToDisplayMap.clear();
		for (Choice c : choices) {
			displayToNameMap.put(c.getDisplay(), c.getName());
			nameToDisplayMap.put(c.getName(), c.getDisplay());
		}
	}

	public Choice[] getChoices() {
		return choices;
	}

	public String getNameForDisplayName(String displayName) {
		return displayToNameMap.get(displayName);
	}

	public String getDisplayForName(String name) {
		return nameToDisplayMap.get(name);
	}

}
