package io.mkknowledge.mkprojects.repositories;
import io.mkknowledge.mkprojects.domain.Project;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	
	Iterable<Project> findAllById(Iterable<Long> iterable);

}
