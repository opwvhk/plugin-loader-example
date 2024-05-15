package opwvhk.example.user2;

import opwvhk.example.api.ExamplePlugin;
import opwvhk.example.api.SemanticVersion;

public class PluginTwoSecond implements ExamplePlugin {
	@Override
	public SemanticVersion version() {
		return new SemanticVersion(0,2,2);
	}

	@Override
	public String greeting() {
		return "Plugin Two (2)";
	}
}
