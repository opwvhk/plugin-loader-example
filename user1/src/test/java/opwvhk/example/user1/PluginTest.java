package opwvhk.example.user1;

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
				.hasSize(1)
				.map(ExamplePlugin::version, ExamplePlugin::greeting)
				.map(tuple -> tuple(tuple.toArray()[0].toString(), tuple.toArray()[1]))
				.containsExactly(tuple("v0.1.0", "Plugin One"));
	}
}
