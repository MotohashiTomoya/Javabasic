package practice14;

import practice14.common.Course;

public class JavaCourse implements Course{
	public String getCourseName(){
		return Course.PREFIX +"Java";
	}
		String[] CourseUnit= {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};

	public String[] getCourseUnit() {
		return CourseUnit;

	}

}
