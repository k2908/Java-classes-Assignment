
class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle b = new Triangle();
		System.out.println("The area is "+ b.getArea());
		System.out.println("The Perimeter is "+ b.getPerimeter());
	}

}
class Triangle {
	  int s1 =3  ;
	 int s2 = 4;
	  int s3 = 5;
	  double area;
	  int perimeter;
	
	public double getArea(){
		double s =(s1+s2+s3)/2;
		area= Math.pow((s*(s-s1)*(s-s2)*(s-s3)),0.5);
		return area;
		
		
	}
	
	public int getPerimeter() {
		int perimeter= s1 + s2 +s3;
		
		return perimeter;
		
	}

	
}
