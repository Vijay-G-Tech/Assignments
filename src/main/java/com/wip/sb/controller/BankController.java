package com.wip.sb.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
	public class BankController {

	    @GetMapping("/bank/name")
	    public String getBankName() {
	        return "My Bank";
	    }

	    @GetMapping("/bank/address")
	    public String getBankAddress() {
	        return "123 Main Street";
	    }
	    
	    
	
}
