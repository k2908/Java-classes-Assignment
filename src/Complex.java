import java.util.Scanner;

public class Complex {


	int real;
	int imag;
	public Complex (int r, int i) {
		real=r;
		imag=i;
	}
	
	public static Complex sum (Complex a, Complex b) {
		// TODO Auto-generated constructor stub
		return new Complex((a.real+(b.real)),(a.imag+(b.imag))); 
	}
	 public static Complex diff(Complex a, Complex b){
		 return new Complex((a.real-(b.real)),(a.imag-(b.imag)));
		 }
	 public static Complex pro(Complex a, Complex b){
		 return new Complex(((a.real*(b.real))-(a.imag*(b.imag))),(a.real*(b.imag))+(a.imag*(b.real)));
	 }
	 public void ans(){
		 if (real==0 && imag!=0) {
			
			 if(imag ==1) { System.out.println("the answer is i");
			 }
			 else if(imag ==-1) { System.out.println("the answer is -i");
			 }
			 else {
				 System.out.println("the answer is "+imag +"i");
				 }
			 }
		 else if(real!=0 && imag ==0) {
			 System.out.println("the answer is "+real);
		
	 }
		 else{
			 if(imag ==1) { System.out.println("the answer is "+real+" + i");
			 }
			 else if(imag ==-1) { System.out.println("the answer is "+real+"  -i");
			 }
			 else {
			 System.out.println("the answer is "+real+" + "+imag+"i");}
			 }
		 
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi i'm the Complex operator");
		System.out.println("Enter the first real ");
		Scanner entrey= new Scanner(System.in);
		int a = entrey.nextInt();
		System.out.println("Enter the first imaginary ");
		int b= entrey.nextInt();
		System.out.println("Enter the second real");
		int c= entrey.nextInt();
		System.out.println("Enter the second imaginary ");
		int d= entrey.nextInt();
		Complex ans1 = new Complex(a,b);
		Complex ans2 = new Complex(c,d);
		System.out.println(ans1.real+" "+ans1.imag);
		System.out.println(ans2.real+" "+ans2.imag);
		Complex e = Complex.sum(ans1,ans2);
		
		Complex f = Complex.diff(ans1,ans2);
		Complex g = Complex.pro(ans1,ans2);
		e.ans();
		f.ans();
		g.ans();
		
	}

}
