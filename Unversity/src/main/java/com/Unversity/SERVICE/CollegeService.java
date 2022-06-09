package com.Unversity.SERVICE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Unversity.MODEL.College;
import com.Unversity.Repository.RepositoryDemo;

@Service
public class CollegeService {
	@Autowired
	RepositoryDemo repositoryDemo;
	public List<College> collegeList=new ArrayList<>(Arrays.asList(new College("101","ECE","Engineering"),
			new College("102","CSE","Engineering"),
			new College("103","EEE","Engineering")));

	public List<College> getAllBranchs() {
		return collegeList;
	}

	public College getParticularBranch(String branchs) {
		return collegeList.stream().filter(f->f.getBranchs().equals(branchs)).findFirst().get();
	}

	public void addCollege(College college) {
		collegeList.add(college);
	}

	public void updateCollege(String branchs, College college) {
		for(int i=0;i<=collegeList.size();i++) {
			if(collegeList.get(i).getId().equals(branchs)) {
				collegeList.set(i, college);
			}
		}
		
	}

	public void deleteCollege(String branchs) {
		collegeList.removeIf(r->r.getId().equals(branchs));
		
	}

}
