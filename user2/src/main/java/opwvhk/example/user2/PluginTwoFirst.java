package opwvhk.example.user2;

import opwvhk.example.api.ExamplePlugin;
import opwvhk.example.api.SemanticVersion;

public class PluginTwoFirst implements ExamplePlugin {
	@Override
	public SemanticVersion version() {
		return new SemanticVersion(0,2,1);
	}

	@Override
	public String greeting() {
		return "Plugin Two (1)";
	}
}
