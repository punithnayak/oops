import java.util.Scanner;

class Sort{
	void Bubblesort(int array[],int n){
		for (int i=0;i<n ;i++ ) {
			for(int j=0;j<n;j++){
				if(array[j]>array[j+1]){
					int temp= array[j];
					array[j]=array[j+1];
					array[j+1]=temp;

				}

			}
		}
	}
	void Bubblesort
}

class BubbleSort{
	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println(a);
		int[] array =new int[500];
		System.out.println("Enter the elements:");
		for (int i=0;i<a ;i++ ) {
			array[i]=sc.nextInt();

		}
		Sort obj=new Sort();
		obj.Bubblesort(array,a);
		System.out.println("The sorted array ");
		for (int c=0;c<a ;c++ ) {
			System.out.println(array[c]);
			
		}

		

		
	}
}