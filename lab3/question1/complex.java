import java.util.*;

class Complex{
	double real;
	double imag;
	public Complex(double real,double imag){
		this.real=real;
		this.imag=imag;
		

	}
	void displaycomplexnumber(){
		System.out.println("Complex number: " + real + " + "+ imag + "i");
	}
	public void display(Complex complexnumber){
		System.out.printf("\nResult = %.1f + %.1fi\n",complexnumber.real,complexnumber.imag);
	}
	
	
	public Complex Add(Complex complexnumber1,Complex complexnumber2){
	Complex temp =new Complex(0.0,0.0);
	temp.real=complexnumber1.real+complexnumber2.real;
	temp.imag=complexnumber1.imag+complexnumber2.imag;
	display(temp);
	return temp;
	}
	public Complex Subtract(Complex complexnumber1,Complex complexnumber2){
	Complex temp =new Complex(0.0,0.0);
	temp.real=Math.abs(complexnumber1.real-complexnumber2.real);
	temp.imag=Math.abs(complexnumber1.imag-complexnumber2.imag);
	display(temp);
	return temp;
	}
}


class complex{
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in); 
	System.out.println("Enter the Complex number 1");
	System.out.print("Real part");
	double a =sc.nextDouble();
	System.out.print("imaginary part");
	double b =sc.nextDouble();
	System.out.println("Enter the Complex number 2");
	System.out.print("Real part");
	double c =sc.nextDouble();
	System.out.print("imaginary part");
	double d =sc.nextDouble();

	Complex obj=new Complex(a,b);
	Complex obj2=new Complex(c,d);
	obj.displaycomplexnumber();
	obj2.displaycomplexnumber();

	Complex temp = new Complex(0,0);
	System.out.print("Addition");
	temp.Add(obj,obj2);
	System.out.print("subtraction");
	temp.Subtract(obj,obj2);
	

	
	}
}