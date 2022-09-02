
import java.util.Scanner;
class Operation{
	int[] InsertElement(int array[],int n,int pos,int newElement){
		int i;
 		
    	
        int newarr[] = new int[n + 1];
 
     
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = array[i];
            else if (i == pos - 1)
                newarr[i] = newElement;
            else
                newarr[i] = array[i - 1];
        }
        return newarr;
    }
	

	void DeleteElement(int array[],int n,int pos){
		for (int i=pos;i<=n ;i++ ) {

			array[i]=array[i+1];
			
			
		}

	}

}


class ArrayOperation{
	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int[] array =new int[500];
		System.out.println("Enter the elements:");
		
		for (int i=0;i<a ;i++ ) {
			array[i]=sc.nextInt();

		}
		System.out.println("Enter the postion to be added:");
		int pos= sc.nextInt();
		System.out.println("Enter the new element:");
		int newElement1= sc.nextInt();
		Operation obj=new Operation();

		System.out.println(obj.InsertElement(array,a,pos,newElement1));
		System.out.println("newArray:");
		for (int c=0;c<a ;c++ ) {
			System.out.println(array[c]);
			
		}
		System.out.println("Enter Element to be deleted ");
		int delPos= sc.nextInt();
		;
		obj.DeleteElement(array,a,delPos);

		System.out.println("newArray:");
		for (int e=0;e<a ;e++ ) {
			System.out.println(array[e]);
			
		}

	}
}