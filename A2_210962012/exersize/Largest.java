import java.util.Scanner;


class Large{
	 int largest(int a,int b,int c){
		int large;
			if (a>b && b>c){
				large= a;
			}
			else if(b>a && b>c){
				large=b;
			}
			else{
				large=c;
			}
			return large;
	}

}
class Largest{

	
	 public static void main(String[] args) {
	 	Scanner sc= new Scanner(System.in);
	 	
	 	System.out.println("Enter three integers:  ");
	 	int a=sc.nextInt();
	 	int b=sc.nextInt();
	 	int c=sc.nextInt();
	 	Large obj = new Large();

	 
	 	System.out.print("Largest no is  ");
	 	System.out.println(obj.largest(a,b,c));


	}
		
	
}