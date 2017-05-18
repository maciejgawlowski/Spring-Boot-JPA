package pl.gawlowski.maciej.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pl.gawlowski.maciej.domain.Course;

public interface CourseRepository extends CrudRepository<Course, String> { //String to typ primary key (id)

	//Spring Data JPA sam implementuje tą metodę! nie muszę jej sam pisać, tylko deklarować ją w interfejsie!!!
	public List<Course> findByTopicId(String topicId); 
}
