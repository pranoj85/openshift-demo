package com.study.openshift.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shift")
public class ShiftController {
	
	@GetMapping("/call-operator")
	public ResponseEntity<Object> getMessage() {
		Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", "["+ new Date().toString()+ "]" + " Hello Friends, I am your shift operator.");
        map.put("status", HttpStatus.OK.value());
        return new ResponseEntity<Object>(map,HttpStatus.OK);
	}
	

}
