package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EngineController {

	//private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/engine")
	public Engine greeting(@RequestParam(value = "engineId") String engineId,
						   @RequestParam(value = "engineNumber", required = false) String engineNumber,
						   @RequestParam(value = "speed",required = false) String speed,
						   @RequestParam(value = "oilTemp",required = false) String oilTemp,
						   @RequestParam(value = "status",required = false) String status,
						   @RequestParam(value = "outputPredict",required = false) String outPredict) {
		return new Engine(counter.incrementAndGet(),
				String.format(engineId),
				engineNumber,
				speed,
				oilTemp,
				status,
				outPredict);
	}
}
