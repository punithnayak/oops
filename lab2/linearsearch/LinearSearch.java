import java.util.Scanner;
class Lsearch{
	void Linears(int array[],int n,int x){
		for (int i=0;i<n ;i++ ) {
			if(array[i]==x){
				
				System.out.println("Value found at position" );
				System.out.println(i+1 );

				break;
			}

		}
		System.out.println("Value not found" );

	}
}

class LinearSearch{
	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int[] array =new int[500];
		System.out.println("Enter the elements:");
		for (int i=0;i<a ;i++ ) {
			array[i]=sc.nextInt();

		}
		Lsearch obj=new Lsearch();
		System.out.println("Enter the element that needs to be search:");
		int b=sc.nextInt();
		obj.Linears(array,a,b);

	}
}