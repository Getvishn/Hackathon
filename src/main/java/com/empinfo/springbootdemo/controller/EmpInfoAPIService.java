package com.empinfo.springbootdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empinfo.springbootdemo.model.EmpInfo;

@RestController
@RequestMapping("/empinfo")
public class EmpInfoAPIService {
	EmpInfo empInfo;
	@GetMapping("{empId}")
	public EmpInfo getEmpDetails(String empId)
	{
		return empInfo;
	}
	
	@PostMapping
	public String createEmpDetails(@RequestBody EmpInfo empInfo)
	{
		this.empInfo = empInfo;
		return "Employee Details created sucessfully";
	}
	
	@PutMapping
	public String updateEmpDetails(@RequestBody EmpInfo empInfo)
	{
		this.empInfo = empInfo;
		return "Employee Details updated sucessfully";
	}
	@DeleteMapping("{empId}")
	public String deleteEmpDetails(String empId)
	{
		this.empInfo = null;
		return "Employee Details deleted sucessfully";
	}
	

}
