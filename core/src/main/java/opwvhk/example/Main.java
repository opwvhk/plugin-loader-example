package opwvhk.example;

import opwvhk.example.api.ExamplePlugin;
import opwvhk.plugin.Plugin;
import opwvhk.plugin.Plugins;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String... args) throws IOException {
		if (args.length == 0) {
			System.out.println("No plugin path specified");
			return;
		}
		Set<Path> pluginPath = Stream.of(args).map(Path::of).collect(Collectors.toSet());
		Plugins plugins = new Plugins(pluginPath, ExamplePlugin.class);

		System.out.println("Plugins found:");
		plugins.getPlugins().stream().map(Plugin::getName).sorted().forEach(pluginName -> System.out.printf("- %s%n", pluginName));
		System.out.println();

		System.out.println("Plugin greeters found:");
		for (ExamplePlugin greeter : plugins.getServices(ExamplePlugin.class)) {
			System.out.printf("- %s (%s)%n", greeter.greeting(), greeter.version());
		}
	}
}
