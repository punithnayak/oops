import java.util.*;
class merge{
	Scanner sc = new Scanner (System.in); 
	int n;
	int array[]=new int[100];

	public void accept(){
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		System.out.println("Enter the array elements");
		for (int i=0;i<n ;i++ ) {
			array[i]=sc.nextInt();
		}

	}

	public merge mix(merge A,merge B){
		merge obj=new merge();
		obj.n=A.n+B.n;
		int x=0;
		for (int i=0;i<obj.n;i++ ) {
			if(i<A.n){
				obj.array[i]=A.array[i];

			}
			else{
				obj.array[i]=B.array[i];
			}
			
			
			
		}
		display(obj);
		return obj;
	}
	public void display(merge m1){
		for (int i=0;i<m1.n ;i++ ) {
			System.out.println(m1.array[i]+ " ");

		}
	}
}




class mergesortarray{
	public static void main(String[] args) {
		
		merge A=new merge();
		merge B=new merge();
		merge obj=new merge();
		A.accept();
		B.accept();
		obj.mix(A,B);
	}
}