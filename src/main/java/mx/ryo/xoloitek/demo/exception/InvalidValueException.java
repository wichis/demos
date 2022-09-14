package mx.ryo.xoloitek.demo.exception;

public class InvalidValueException extends DevelLogicException {

	private static final long serialVersionUID = 1L;
	private final static String DEFAULT_ERR_MSG = "El valor contenido es invalido";
	public InvalidValueException() {
		super(DEFAULT_ERR_MSG);
	}
	public InvalidValueException(String errMsg) {
		super(errMsg);
	}
}
