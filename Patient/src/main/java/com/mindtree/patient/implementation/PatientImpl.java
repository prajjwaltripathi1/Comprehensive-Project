package com.mindtree.patient.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.patient.entity.Patient;
import com.mindtree.patient.repository.PatientRepository;
import com.mindtree.patient.service.PatientService;

@Component
public class PatientImpl implements PatientService {
	
	@Autowired
	PatientRepository patRepo;

	@Override
	public Patient add(Patient pat) {
		// TODO Auto-generated method stub
		return patRepo.save(pat);
	}

	@Override
	public List<Patient> list() {
		// TODO Auto-generated method stub
		return patRepo.findAll();
	}

	@Override
	public Patient serachById(long id) {
		// TODO Auto-generated method stub
		if(patRepo.findById(id)==null){
			return null;
			
		}
		return patRepo.findById(id);
	}
	

}
