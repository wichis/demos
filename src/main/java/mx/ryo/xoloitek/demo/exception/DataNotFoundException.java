package mx.ryo.xoloitek.demo.exception;

public class DataNotFoundException extends DevelLogicException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String DEFAULT_ERR_MSG = "No se encontraron coincidencias en la busqueda con los criterios seleccionados.";
	public DataNotFoundException() {
		super(DEFAULT_ERR_MSG);
	}
	
	public DataNotFoundException(String errMsg) {
		super(errMsg);
	}
}
