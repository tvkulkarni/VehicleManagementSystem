package com.cts.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController 
{
	@GetMapping(value="/myVehicles")
	public String getPage()
	{
		return "<h1>Welcome to Vehicle Management System</h1>";
	}
	
}
