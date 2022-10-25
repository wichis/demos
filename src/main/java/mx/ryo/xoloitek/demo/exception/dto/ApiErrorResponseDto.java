package mx.ryo.xoloitek.demo.exception.dto;

import java.io.Serializable;
import java.util.ResourceBundle;

public class ApiErrorResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8851112067804044677L;

	private String scode;
	private String resume;
	private String technicalDetails;
	private Object extra;

	public ApiErrorResponseDto(String codigo, String mensaje) {
		super();
		this.scode = codigo;
		this.resume = mensaje;
	}

	public ApiErrorResponseDto(String codigo, String mensaje, String technicalDetails) {
		super();
		this.scode = codigo;
		this.resume = mensaje;
		this.technicalDetails = technicalDetails;
	}

	public ApiErrorResponseDto(ResourceBundle error) {
		// TODO Auto-generated constructor stub
	}

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getTechnicalDetails() {
		return technicalDetails;
	}

	public void setTechnicalDetails(String technicalDetails) {
		this.technicalDetails = technicalDetails;
	}

	public Object getExtra() {
		return extra;
	}

	public void setExtra(Object extra) {
		this.extra = extra;
	}

}
