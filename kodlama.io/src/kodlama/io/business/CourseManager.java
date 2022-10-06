package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Course[] courses = new Course[] { new Course("engin", "java", "javakursu", 500),
				new Course("engina", "bilisim", "bilisimkursu1", 600), };
		
		for (Course c : courses) {
			if (c.getCategory() == course.getCategory()) {
				throw new Exception("aynı isimde kurs girilemez");
			}

			if (c.getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs ismi aynı olamaz");
			}

		}
		if (course.getUnitPrice() < 0) {

			throw new Exception("Kurs fiyatı 0 dan kücük olamaz");
		}
		courseDao.add(course);
		for (Logger log : loggers) {
			log.log("Mesaj atıldı");
		}

	}
}
