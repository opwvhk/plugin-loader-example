package opwvhk.example.user1;

import opwvhk.example.api.ExamplePlugin;
import opwvhk.example.api.SemanticVersion;

public class PluginOne implements ExamplePlugin {
	@Override
	public SemanticVersion version() {
		return new SemanticVersion(0,1,0);
	}

	@Override
	public String greeting() {
		return "Plugin One";
	}
}
