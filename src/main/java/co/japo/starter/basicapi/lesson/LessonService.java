package co.japo.starter.basicapi.lesson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

	@Autowired
	private LessonRepository lessonRepository;
	
	public List<Lesson> getAllLessons(String courseId){
		return lessonRepository.findByCourseId(courseId);
	}
	
	public Lesson getLession(String lessonId){
		return lessonRepository.findOne(lessonId);
	}
	
	public void addLesson(Lesson lesson){
		lessonRepository.save(lesson);
	}
	
	public void updateLesson(Lesson lesson){
		lessonRepository.save(lesson);
	}
	
	public void deleteLesson(String lessonId){
		lessonRepository.delete(lessonId);
	}
}
