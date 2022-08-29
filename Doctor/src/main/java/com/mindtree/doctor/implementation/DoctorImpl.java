package com.mindtree.doctor.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.doctor.entity.Doctor;
import com.mindtree.doctor.repository.DoctorRepository;
import com.mindtree.doctor.service.DoctorService;

@Component
public class DoctorImpl implements DoctorService{

	@Autowired
	DoctorRepository doctRepo;

	@Override
	public Doctor add(Doctor doct) {
		// TODO Auto-generated method stub
		return doctRepo.save(doct);
	}

	@Override
	public List<Doctor> list() {
		// TODO Auto-generated method stub
		return doctRepo.findAll();
	}

	@Override
	public Doctor searchById(long id) {
		// TODO Auto-generated method stub
		if(doctRepo.findById(id)==null) {
			return null;
		}
		return doctRepo.findById(id);
	}
	
	
	
}
