package mx.ryo.xoloitek.demo.exception.type;

public enum LevelError {
	CLIENT("C", "error.global.client.resume"), 
	INTERNAL_UNKNOWN("U", "error.global.internal_unknown.resume"),
	INTERNAL_KNOWN("K", "error.global.internal_known.resume"),
	LOCAL_DEPENDENCY("L", "error.global.local_dependency.resume"),
	EXTERNAL_DEPENDENCY("E", "error.global.external_dependency.resume");

	private String abrev;
	private String errorProperty;

	private LevelError(String abrev, String errorProperty) {
		this.abrev = abrev;
	}

	public String getAbrev() {
		return abrev;
	}

}
