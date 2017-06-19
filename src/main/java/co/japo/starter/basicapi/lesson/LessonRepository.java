package co.japo.starter.basicapi.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, String> {

	List<Lesson> findByCourseId(String courseId);
	
}
