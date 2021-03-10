package io.mkknowledge.mkprojects.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mkknowledge.mkprojects.domain.Project;
import io.mkknowledge.mkprojects.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		return projectRepository.save(project);
	}

}
