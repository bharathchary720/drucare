package com.Unversity.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Unversity.MODEL.College;
import com.Unversity.SERVICE.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	CollegeService collegeService;
	
	@RequestMapping("/College")
	public List<College> getAllBranchs() {
		return collegeService.getAllBranchs();
	}
	@RequestMapping("/College/{branchs}")
	public College getParticularBranch(@PathVariable String branchs) {
		return collegeService.getParticularBranch(branchs);
	}
	@RequestMapping(method =RequestMethod.POST, value="/College")
	public void addCollege(@RequestBody College college) {
		collegeService.addCollege(college);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/College/{id}")
	public void updateCollege(@PathVariable String branchs,@RequestBody College college) {
		collegeService.updateCollege(branchs,college);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/College/{id}")
	public void deleteCollege(@PathVariable String branchs) {
		collegeService.deleteCollege(branchs);
	}
}
