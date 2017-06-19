package co.japo.starter.basicapi.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.japo.starter.basicapi.course.Course;
import co.japo.starter.basicapi.course.CourseService;
import co.japo.starter.basicapi.lesson.Lesson;
import co.japo.starter.basicapi.lesson.LessonService;
import co.japo.starter.basicapi.topic.Topic;
import co.japo.starter.basicapi.topic.TopicService;

@RestController
public class InitializerController {

	@Autowired
	private TopicService topicService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private LessonService lessonService;
	
	@RequestMapping("/init")
	public String init(){
		Topic topic = new Topic("java","Java","Java description");
		Course course = new Course("java-8","Java 8 Fundamentals","Java 8 fundamentals description",topic);
		Lesson lesson = new Lesson ("java-8-lambdas","Introduction to lambdas in java 8","Lambdas introduction description",course);
		
		topicService.addTopic(topic);
		courseService.addCourse(course);
		lessonService.addLesson(lesson);
		
		return "done!";
	}
}
