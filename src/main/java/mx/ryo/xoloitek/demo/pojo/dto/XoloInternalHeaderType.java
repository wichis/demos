package mx.ryo.xoloitek.demo.pojo.dto;

public enum XoloInternalHeaderType {
	/**
	 * Con Respuesta Oculta
	 */
	CRO("X_CRO"),
	/**
	 * Identificador del usuario
	 */
	USER("X_USER"), 
	/**
	 * Identificador del role
	 */
	ROLE("X_ROLE"), 
	/**
	 * Identificador de la aplicacion
	 */
	APP("X_APP"),
	/**
	 * Identificador de la pantalla
	 */	
	PAGE("X_PAGE"),
	/**
	 * Mensaje que se podra msotrar en la notificacion
	 */	
	MSG("X_MSG"),
	/**
	 * Modo de notificacion
	 * {modal, tip, toast}
	 */	
	NOTIFY("X_NOTIFY"),
	/**
	 * Siguiente accion
	 * {continue, confirm, warn, info, error}
	 */	
	NACTION("X_NACTION"),;

	private String key;

	private XoloInternalHeaderType(String k) {
		this.key = k;
	}

	public String getKey() {
		return key;
	}

}
