
public class Q1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student A= new Student();
		A.name ="John";
		A.roll_no = 2;
		A.Show(A);
	}

}
class Student {
	String name;
	int roll_no;
	static void Show(Student a) {
		System.out.println("the name is "+a.name+" the number is "+ a.roll_no);
		
	}

	
}
