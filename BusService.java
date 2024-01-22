package com.mkce.springbootbasics;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusService {

	@Autowired
	private BusRepository busRepository;
	
	public void addBus(Vaccine student) {
		 busRepository.save(student);
	}

	public List<Vaccine> getAllBus() {
		return busRepository.findAll();
	}
	
	public Optional<Vaccine> getById(Long id)
	{
		return busRepository.findById(id);
	}
	public void updateBus(Vaccine student)
	{
		 busRepository.save(student);
	}


	public void deleteById(Long id) {
		busRepository.deleteById(id);
	}
}
