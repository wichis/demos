package mx.ryo.xoloitek.demo.exception;

public class SendCodeException extends DevelLogicException {

	private static final long serialVersionUID = 1L;
	private final static String DEFAULT_ERR_MSG = "Valor contenido es invalido";
	public SendCodeException() {
		super(DEFAULT_ERR_MSG);
	}
	public SendCodeException(String errMsg) {
		super(errMsg);
	}
}
