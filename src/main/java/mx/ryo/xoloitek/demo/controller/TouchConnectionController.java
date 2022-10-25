package mx.ryo.xoloitek.demo.controller;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.ryo.xoloitek.demo.pojo.dto.PojoExample;

@RestController
@RequestMapping(value = { "touch" })
public class TouchConnectionController {
	Logger logger = LogManager.getLogger(TouchConnectionController.class);

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ResponseEntity<Date> getTime() {
//		logger.info("dsdssdsdd");
		return new ResponseEntity<Date>(new Date(), HttpStatus.OK) ;
	}
	
	@RequestMapping(value = "/pojo", method = RequestMethod.GET)
	public ResponseEntity<PojoExample> getPojo() {
		PojoExample returning = PojoExample.builder().id(new Long(1)).description("example").build();
		return new ResponseEntity<PojoExample>( returning, HttpStatus.OK) ;
	}
}
