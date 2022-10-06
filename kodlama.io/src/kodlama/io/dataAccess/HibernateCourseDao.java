package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate İle veritabanına aktarıldı");
		
	}

}
