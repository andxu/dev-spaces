package com.ms.sample;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@RequestMapping(value = "/api", produces = "text/html")
	public String greeting(@RequestParam(name = "_", required = false, defaultValue = "0") String timestamp) {
		return "Hello from webfrontend at " + new Date(Long.parseLong(timestamp));
	}

}
