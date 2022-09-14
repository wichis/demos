package mx.ryo.xoloitek.demo.exception;

public class MissingRuleDevException extends DevelLogicException {
	
	private static final long serialVersionUID = 1L;
	private final static String DEFAULT_ERR_MSG = "[STRAY SHEEP]";

	public MissingRuleDevException() {
		super(DEFAULT_ERR_MSG.concat(" No ha sido implementada una respuesta coherente."));
	}

	public MissingRuleDevException(String errMsg) {
		super(DEFAULT_ERR_MSG);
	}
}
