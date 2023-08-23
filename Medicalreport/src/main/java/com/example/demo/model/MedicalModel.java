package com.example.demo.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name="report")
	public class MedicalModel {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int medicalId;
		@Column(name="medicalname")
		private String name;
		private String address;
		private String gender;
		private String phonenumber;
		public int getMedicalId() {
			return medicalId;
		}
		public void setMedicalId(int medicalId) {
			this.medicalId = medicalId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		
}		