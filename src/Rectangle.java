 public class Rectangle {
	int area;
	int breadth;
	int length;
	Rectangle ( int b, int c) {
		breadth= c;
		length= b;
	System.out.println("the area of a rectangle with  length "+length+" and breadth "+breadth+" is " +Area());
	}
	private int Area() {
		area= breadth*length;
		return area;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle x = new Rectangle (4,5);
		Rectangle y = new Rectangle (5,8);
		
	}

}
