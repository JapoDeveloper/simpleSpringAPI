package co.japo.starter.basicapi.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		return courseRepository.findByTopicId(topicId);
	}
	
	public Course getCourse(String courseId){
		return courseRepository.findOne(courseId);
	}
	
	public void addCourse(Course course){
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course){
		courseRepository.save(course);
	}
	
	public void deleteCourse(String courseId){
		courseRepository.delete(courseId);
	}

}
