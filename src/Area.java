import java.util.Scanner;

 public class Area {
	 int length;
	 int breadth;
	 double area;
	Area(int a, int b){
		length=a;
		breadth=b;
		System.out.println("The area is "+ returnArea());
	}
	private double returnArea(){
		area= length*breadth;
		return area;
		
	}

	
	public static void main(String[] args) {
	System.out.println("hi i'm the area calculator");
	System.out.println("Enter the length");
	Scanner entrey= new Scanner(System.in);
	int a = entrey.nextInt();
	System.out.println("Enter the breadth");
	int b= entrey.nextInt();
	Area aire = new Area(a,b);
	
	
		
		
		
		
		
	}

}
