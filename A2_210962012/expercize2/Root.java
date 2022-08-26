
import java.util.Scanner;
class Roots{
	
		void RootOfQuad(double a,double b,double c){
			double discriminant= (b*b)-(4*a*c);
			int flag;

			if (discriminant>0){
				flag=0;
				}
			else if(discriminant==0){
				flag=1;
				
				}
			else{
				flag=2;
			}
			switch(flag){
				case 0:
					double root1= ((-b+ Math.sqrt(discriminant))/2*a);
					double root2=((-b-Math.sqrt(discriminant))/2*a);
					System.out.println(root1+" "+root2);
					break;
			     
				case 1:
					double root =(-b/(2*a));
					System.out.println(root);
					break;

				 
				case 2:
					double root3= ((-b+Math.sqrt(Math.abs(discriminant)))/2*a);
					double root4=((-b-Math.sqrt(Math.abs(discriminant)))/2*a);
					System.out.println(root3+" i"+root4);
					break;
			    

			}



		}

	
	}

class Root{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	 	
	 	System.out.println("Enter three integers:  ");
	 	double a=sc.nextInt();
	 	double b=sc.nextInt();
	 	double c=sc.nextInt();
	 	Roots obj =new Roots();
	 	obj.RootOfQuad(a,b,c);

		
	}
}
