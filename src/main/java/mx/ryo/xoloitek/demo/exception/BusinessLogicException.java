package mx.ryo.xoloitek.demo.exception;

public class BusinessLogicException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String DEFAULT_ERR_MSG = "Error en la logica de negocio";
	public BusinessLogicException() {
		super(DEFAULT_ERR_MSG);
	}
	public BusinessLogicException(String errMsg) {
		super(errMsg);
	}
}
