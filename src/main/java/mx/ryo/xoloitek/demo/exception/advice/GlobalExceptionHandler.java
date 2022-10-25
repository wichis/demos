package mx.ryo.xoloitek.demo.exception.advice;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import mx.ryo.xoloitek.demo.exception.BusinessLogicException;
import mx.ryo.xoloitek.demo.exception.DevelLogicException;
import mx.ryo.xoloitek.demo.exception.devel.DataNotFoundException;
import mx.ryo.xoloitek.demo.pojo.dto.XoloInternalHeaderType;

@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@Autowired
	private ResourceBundle errors;

//	@ExceptionHandler(value = { ResponseStatusException.class })
//	public ResponseEntity<String> handleResponseStatusExceptionn(Exception devLogExc) {
//		logger.error("DevelLogicException handler executed" + devLogExc.getMessage());
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//				.body(MsgBundleUtils.useResponse(MsgBundleType.OP_FALLIDA));
//	}

	@ExceptionHandler(value = { DataNotFoundException.class })
	public ResponseEntity<String> handleIOException(DevelLogicException devLogExc) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).header(XoloInternalHeaderType.X_CRO.getKey(), devLogExc.getMessage())
				.body(devLogExc.getMessage());
	}

	@ExceptionHandler(value = { BusinessLogicException.class })
	public ResponseEntity<String> handleIOException(BusinessLogicException devLogExc) {
		logger.error("Solicita apoyo con tu administrador para atender el fallo" + devLogExc.getMessage());
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(devLogExc.getMessage());
	}

//	@ExceptionHandler(value = { Exception.class })
//	public ResponseEntity<ApiErrorResponseDto> handleIOException(Exception exc) {
//		logger.error(">>> " + exc.getMessage());
//		logger.error(">>>>>> " + exc.getCause());
//		
//		final ApiErrorResponseDto errorResponse = new ApiErrorResponseDto("error.internal.default", "" );
//		return ResponseEntity.status(HttpStatus.NO_CONTENT).header(XoloInternalHeaderType.X_CRO.getKey(), exc.getMessage())
//				.body(exc.getMessage());
//	}

//	@ExceptionHandler(value = { DataException.class })
//	public ResponseEntity<String> handleIOException(DataException exc) {
//		return ResponseEntity.status(HttpStatus.NO_CONTENT).header(XitHeaderType.CRO.getKey(), exc.getMessage())
//				.body(exc.getMessage());
//	}

}
