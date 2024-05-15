package opwvhk.example.api;

public record SemanticVersion(int major, int minor, int patch) {
	@Override
	public String toString() {
		return "v" + major + "." + minor + "." + patch;
	}
}
