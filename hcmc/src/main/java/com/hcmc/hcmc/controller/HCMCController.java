package com.hcmc.hcmc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.hcmc.hcmc.dao.PatientRepository;

@Controller
public class HCMCController {
	private PatientRepository repo;
	@Autowired
	public HCMCController(PatientRepository repo) {
		this.repo = repo;
	}
	@GetMapping("/")
	public String homePage(Model model) {
		return "index";
	}
	@GetMapping("/patient")
	public String patientPage(Model model) {
		model.addAttribute("data", "List of Registered Patients");
		model.addAttribute("patient", repo.findAll(Sort.by(Sort.Direction.ASC, "fullName")));
		return "patient";
	}
	@GetMapping("/elderpatient")
	public String elderPatientPage(Model model) {
		model.addAttribute("data", "List of Elderly Patients");
		model.addAttribute("patient", repo.getAllElderPatient());
		return "patient";
	}
}
