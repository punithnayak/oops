import java.util.Scanner;
class Factorial{
	void factorial(int n){
		int ans=1;
		for (int i=1;i<=n ;i++ ) {
			ans=ans*i;
			
		}
		System.out.println(ans);
	}
}

class Fact{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	 	
	 	System.out.println("Enter The Number:  ");
	 	int a=sc.nextInt();
	 	Factorial obj =new Factorial();
	 	obj.factorial(a);

	}
}