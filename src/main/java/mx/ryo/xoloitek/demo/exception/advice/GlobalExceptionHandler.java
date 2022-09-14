package mx.ryo.xoloitek.demo.exception.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;


@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

//	@ExceptionHandler(value = { SendCodeException.class })
//	public ResponseEntity<String> handleIOException(SendCodeException exc) {
//		String[] splited = exc.getMessage().split(";");
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).header(XitHeaderType.CRO.getKey(), splited[0])
//				.body(splited[0]) ;
//	}
//
//	@ExceptionHandler(value = { ResponseStatusException.class })
//	public ResponseEntity<String> handleResponseStatusExceptionn(Exception devLogExc) {
//		logger.error("DevelLogicException handler executed" + devLogExc.getMessage());
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//				.body(MsgBundleUtils.useResponse(MsgBundleType.OP_FALLIDA));
//	}
//
//	@ExceptionHandler(value = { BusinessLogicException.class })
//	public ResponseEntity<String> handleIOException(BusinessLogicException devLogExc) {
//		logger.error("Solicita apoyo con tu administrador para atender el fallo" + devLogExc.getMessage());
//		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(devLogExc.getMessage());
//	}
//
//	@ExceptionHandler(value = { Exception.class })
//	public ResponseEntity<String> handleIOException(Exception exc) {
//		logger.error(">>> " + exc.getMessage());
//		logger.error(">>>>>> " + exc.getCause());
//		return ResponseEntity.status(HttpStatus.NO_CONTENT).header(XitHeaderType.CRO.getKey(), exc.getMessage())
//				.body(exc.getMessage());
//	}
//
//	@ExceptionHandler(value = { DataException.class })
//	public ResponseEntity<String> handleIOException(DataException exc) {
//		return ResponseEntity.status(HttpStatus.NO_CONTENT).header(XitHeaderType.CRO.getKey(), exc.getMessage())
//				.body(exc.getMessage());
//	}

}
