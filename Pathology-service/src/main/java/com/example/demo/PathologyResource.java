package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {

	public PathologyResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Disease> diseases = Arrays.asList(
			new Disease("D1", "Asthma", "Warm water bath"),
			new Disease("D2", "Headache", "Hot water vapor"),
			new Disease("D3", "Covid", "Wash Hands and Stay Safe")
			);
	
	@RequestMapping("/diseases")
	public DiseaseList getDiseases() {
		DiseaseList diseaseList = new DiseaseList();
		
		diseaseList.setDiseases(diseases);
		return diseaseList;
	}
	
	@RequestMapping("/diseases/{id}")
	public Disease getDiseaseById(@PathVariable("id") String id) {
		Disease d = diseases.stream()
				.filter(disease -> id.equals(disease.getId()))
				.findAny()
				.orElse(null);
		return d;
	}

}
