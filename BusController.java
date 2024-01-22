package com.mkce.springbootbasics;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class BusController {

	@Autowired
	private BusService BusService;
	
	@PostMapping("/addStudent")
	public String addBus(@RequestBody Vaccine s) {
		BusService.addBus(s);
		return "Bus Added Successfully";
	}
	
	@GetMapping("/getAllStudent")
	public List<Vaccine> getAllstudent()
	{
		return BusService.getAllBus();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Vaccine> getById(@PathVariable Long id)
	{
		return BusService.getById(id);
	}
	@PutMapping("/update")
	public String updateBus(@RequestBody Vaccine s)
	{
		BusService.updateBus(s);
		return "Bus updated Successfully";
	}
	
	@DeleteMapping("/remove/{id}")
	public String DeleteById(@PathVariable Long id)
	{
		BusService.deleteById(id);
		return "Bus Deleted Successfully";
	}
	

}
