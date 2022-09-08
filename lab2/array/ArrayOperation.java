import java.util.Scanner;

class array{
	void delete(int a[],int n,int pos){
		int i;
		pos=pos-1;
		for(i=pos;i<n;i++){
			a[i]=a[i+1];
		}
		System.out.println("New array is :");
			for(i=0;i<n-1;i++){
					System.out.println(a[i]);
			}       
	}

	void insert(int a[],int n,int pos,int x){
		int i;
		int temp[]=new int[50];

		for(i=0;i<n+1;i++){
			if (i < pos - 1)
                temp[i] = a[i];
            else if (i == pos - 1)
                temp[i] = x;
            else
                temp[i] = a[i - 1];
		}
		System.out.println("New array is :");
			for(i=0;i<n+1;i++){
					System.out.println(temp[i]);
			}
	}
}

class modarr{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		int n,i;
		int arr[]=new int[50];
		System.out.println("Enter number of elements :");
		n=scan.nextInt();

		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}

		array function=new array();	

		System.out.println("Enter 1 to delete element and 0 to insert element :");
		int opt=scan.nextInt();

		System.out.println("Enter the position :");
		int pos=scan.nextInt();

		if(opt==1){
			function.delete(arr,n,pos);
		}

		else if(opt==0){
			System.out.println("Enter element to be inserted :");
			int x=scan.nextInt();
			function.insert(arr,n,pos,x);
		}

		else{
			System.out.println("Invalid input :");
		}

	}
}
