package opwvhk.example.user2;

import opwvhk.example.api.ExamplePlugin;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class PluginTest {

	@Test
	void verifyPlugin() {
		ServiceLoader<ExamplePlugin> loader = ServiceLoader.load(ExamplePlugin.class);
		assertThat(loader)
				.hasSize(2)
				.map(ExamplePlugin::version, ExamplePlugin::greeting)
				.map(tuple -> tuple(tuple.toArray()[0].toString(), tuple.toArray()[1]))
				.containsExactly(tuple("v0.2.1", "Plugin Two (1)"), tuple("v0.2.2", "Plugin Two (2)"));
	}
}
