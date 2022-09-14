package mx.ryo.xoloitek.demo.exception;

public class MissingRuleBusException extends BusinessLogicException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final static String DEFAULT_INFO_MSG = "La solicitud se está procesando.";

	public MissingRuleBusException() {
		super(DEFAULT_INFO_MSG);
	}

	public MissingRuleBusException(String errMsg) {
		super(errMsg);
	}
}
