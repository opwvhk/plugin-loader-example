package opwvhk.example;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.StdIo;
import org.junitpioneer.jupiter.StdOut;

import java.io.IOException;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.*;

class MainTest {
	@StdIo
	@Test
	void testPluginPathRequired(StdOut stdout) throws IOException {
		Main.main();

		assertThat(stdout.capturedString()).isEqualTo("""
				No plugin path specified
				""");
	}

	@StdIo
	@Test
	void testPluginsFound(StdOut stdout) throws IOException {
		Path classpath = Path.of(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
		Path pathToPlugin = classpath.getParent();
		Path pluginPath = pathToPlugin.getParent();
		Main.main(pluginPath.toString());

		assertThat(stdout.capturedString()).isEqualTo("""
				Plugins found:
				- target
				- src

				Plugin greeters found:
				- Test case (v1.0.0)
				""");
	}
}
