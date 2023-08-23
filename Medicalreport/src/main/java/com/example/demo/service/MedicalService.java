package com.example.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MedicalModel;
import com.example.demo.repository.MedicalRepo;

@Service
public class MedicalService {
	@Autowired
	public MedicalRepo hrepo;
	public String saveMedical(MedicalModel h) {
		hrepo.save(h);
		return "Data is saved to database";
	}
	public List<MedicalModel> getMedical(){
		return hrepo.findAll();
	}
	public MedicalModel updateMedical(MedicalModel hm) {
		return hrepo.saveAndFlush(hm);
	}
	public boolean updateMedicalif(int medicalId,MedicalModel hm) {
		if(hrepo.existsById(medicalId)) {
			hrepo.save(hm);
			return true;
		}
		return false;
	}
	public boolean deleteMedicalif(int medicalId) {
		if(hrepo.existsById(medicalId)) {
			hrepo.deleteById(medicalId);
			return true;
		}
		return false;
	}
	public void deleteMedical(int medical_id) {
		System.out.println("Deleted");
		hrepo.deleteById(medical_id);
	}
	public Optional<MedicalModel> getUserId(int userId){
		Optional<MedicalModel>medical=hrepo.findById(userId);
		if(medical.isPresent()) {
			return medical;
		}
		return null;
	

	}
}