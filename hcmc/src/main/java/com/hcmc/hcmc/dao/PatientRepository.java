package com.hcmc.hcmc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.hcmc.hcmc.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	@Query("FROM Patient WHERE DATEDIFF(CURRENT_DATE, dob)/365 >= 65 ORDER BY dob ASC")
    List<Patient> getAllElderPatient();
}
