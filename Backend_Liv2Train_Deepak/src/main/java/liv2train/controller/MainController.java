package liv2train.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import liv2train.model.Center;
import liv2train.services.Services_Impl;

@RestController
public class MainController {
	
	@Autowired
	private Services_Impl services;
	
	
	// Controller for adding new Center in database.
	@PostMapping("/createcenter")
	public Center createcenter(@Valid @RequestBody Center center ) {
		Center created_center = services.add_center(center);
		return created_center;
	}
	
	// Controller for getting all saved Centers from Database.
	@GetMapping("/getcenterlist")
	public List<Center> getCenterList(){
		return services.getCenterList();
	}
}
