package practice14;

import practice14.common.Course;

public class JavaCourse implements Course{
	public String getCourseName(){
		return Course.PREFIX +"Java";
	}

	public String[] getCourseUnit() {
		String[] CourseUnit= {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return CourseUnit;

	}

}
