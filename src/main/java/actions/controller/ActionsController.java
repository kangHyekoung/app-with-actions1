package actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionsController {
	
	@GetMapping(value = "/")
	public String actionsTest() {
		return "app-with-actions version:0.0.1";
	}
	
	@GetMapping(value = "/api/actions1")
	public String actionsTest1() {
		return "app-with-actions Test";
	}
	
}
