package pl.gawlowski.maciej.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.gawlowski.maciej.domain.Course;
import pl.gawlowski.maciej.domain.Topic;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course); //db wie że jest takie id jakie zapisujemy i je uaktualni, a jak nie będzie to utworzy nowe
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}

}
