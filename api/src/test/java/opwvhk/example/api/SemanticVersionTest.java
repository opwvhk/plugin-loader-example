package opwvhk.example.api;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SemanticVersionTest {
	@Test
	void validateVersionString() {
		assertThat(new SemanticVersion(1,2,3).toString()).isEqualTo("v1.2.3");
	}
}
