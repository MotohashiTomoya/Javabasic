package practice14;

import practice14.common.Course;

public class DBCourse implements Course{
	public String getCourseName(){
		return Course.PREFIX +"DB基礎";
	}



	public String[] getCourseUnit() {
		String[] CourseUnit= {"DB基礎","SQL基礎","正規化","SQL応用"};
		return CourseUnit;

	}

}
