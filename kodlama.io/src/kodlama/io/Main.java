package kodlama.io;

import kodlama.io.business.CourseManager;
import kodlama.io.core.logging.DataBaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.HibernateCourseDao;
import kodlama.io.entities.Course;


public class Main {
	public static void main(String[] args) throws Exception {
		Course course1 = new Course("Samed","Java","Bilişim",12);
		
		Logger[] loggers = {new DataBaseLogger(),new FileLogger(),new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course1);
		
	}
}
