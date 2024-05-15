package opwvhk.example;

import opwvhk.example.api.ExamplePlugin;
import opwvhk.example.api.SemanticVersion;

public class TestPlugin implements ExamplePlugin {
	@Override
	public SemanticVersion version() {
		return new SemanticVersion(1,0,0);
	}

	@Override
	public String greeting() {
		return "Test case";
	}
}
