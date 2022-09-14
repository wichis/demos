package mx.ryo.xoloitek.demo.exception;

public class FailedProcessException extends DevelLogicException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String DEFAULT_ERR_MSG = "El proceso fue interrumpido por fallo";
	public FailedProcessException() {
		super(DEFAULT_ERR_MSG);
	}
	public FailedProcessException(String errMsg) {
		super(errMsg);
	}
}
