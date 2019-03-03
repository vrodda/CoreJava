package interview;

public class ImmutableStudentTest {

	public static void main(String args[]) {
		Age age = new Age();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1992);
		
		ImmutableStudent student = new ImmutableStudent("Alex", 1, age);
		
		System.out.println("Alex age year before modification = " + student.getAge().getYear());
		age.setYear(1993);
		
		System.out.println("Alex age year after modification = " + student.getAge().getYear());
	}
}
