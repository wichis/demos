package mx.ryo.xoloitek.demo.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "test" })
public class TestConnectionController {
	Logger logger = LogManager.getLogger(TestConnectionController.class);

	@RequestMapping(value = "/string", method = RequestMethod.GET)
	public String getCatalogo() {
		logger.info("dsdssdsdd");
		return "alive";
	}
}
