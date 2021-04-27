package odev;


public class Main {

	public static void main(String[] args) {


		Course course1 = new Course();
		course1.courseId = 1;
		course1.courseName = "Yaz�l�m geli�tirirci yeti�tirme kamp�(C# + ANGULAR)";
		course1.instructor = "Engin Demiro�";
		course1.price = 0;
		
		Course course2 = new Course();
		course2.courseId = 2;
		course2.courseName = "Yaz�l�m geli�tirirci yeti�tirme kamp�(JAVA + REACT)";
		course2.instructor = "Engin Demiro�";
		course2.price = 0;
		
		
		Course course3 = new Course();
		course3.courseId = 3;
		course3.courseName = "Programlamaya giri� i�in temel kurs";
		course3.instructor = "Engin Demiro�";
		course3.price = 0;
		
		Course[] courses = {course1, course2, course3};
		
		System.out.println("....KURSLAR......");
		
		for(Course Course: courses) {
			System.out.println("Kurs id: " + Course.courseId );
			System.out.println("Kurs ad�: " + Course.courseName );
			System.out.println("Kurs e�itmeni: " + Course.instructor );
			System.out.println("Kurs fiyat�: " + Course.price + "TL" );
		}
		
		Student student1 = new Student();
		student1.studentId = 4;
		student1.studentName = "Hacer";
		student1.studentSurname = "Z";
		student1.email = "xyz@gmail.com";
		
		Student student2 = new Student();
		student2.studentId = 5;
		student2.studentName = "Ay�e";
		student2.studentSurname = "X";
		student2.email = "abc@gmail.com";
		
		Student student3 = new Student();
		student3.studentId = 6;
		student3.studentName = "Hakan";
		student3.studentSurname = "Y";
		student3.email = "def@gmail.com";
		
		Student[] students = {student1, student2, student3};
		
		System.out.println(".....��RENC�LER.......");
		
		for (Student Student : students) {
			System.out.println("��renci id: " + Student.studentId);
			System.out.println("��renci ad�: " + Student.studentName);
			System.out.println("��renci soyad�: " + Student.studentSurname);
			System.out.println("��renci email: " + Student.email);
			
		}
		
		
		System.out.println(".......Kay�t oldu�unuz kurslar........");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		
				

	}

}
