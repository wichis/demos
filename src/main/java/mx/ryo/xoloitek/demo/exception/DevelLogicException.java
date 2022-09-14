package mx.ryo.xoloitek.demo.exception;

public class DevelLogicException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String DEFAULT_ERR_MSG = "¡Ups! Algo falló. Reportelo inmediatamente.";
	public DevelLogicException() {
		super(DEFAULT_ERR_MSG);
	}
	
	public DevelLogicException(String errMsg) {
		super(errMsg);
	}
}
