package com.mindtree.doctor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.doctor.entity.Doctor;

@Service
public interface DoctorService {
	
	Doctor add(Doctor doct);
	List<Doctor> list();
	Doctor searchById(long id);
	
	

	
}
