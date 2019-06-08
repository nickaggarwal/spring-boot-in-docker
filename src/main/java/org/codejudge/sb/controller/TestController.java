package org.codejudge.sb.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	@ResponseBody 
	public String test() throws IOException {
		return "Hello Docker world!";
	}

    @GetMapping(value = "/api/leads/{lead_id}")
	@ResponseBody
	public String getLeadId(@PathVariable("lead_id") String lead_id) throws IOException{
		return "This is working"+lead_id;
	}
}
