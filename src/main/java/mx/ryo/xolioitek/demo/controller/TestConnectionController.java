package mx.ryo.xolioitek.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value= {"test"})
public class TestConnectionController {

	@RequestMapping(value = "/string", method = RequestMethod.GET)
	public String getCatalogo() {
		return "alive";
	}
}
