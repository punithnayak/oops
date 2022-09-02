import java.util.Scanner;
class Add{
	void Adddition(int a[][],int b[][] ,int row,int col){
		int c[][]= new int[row][col];
		for(int i=0;i<row;i++){    
			for(int j=0;j<col;j++){    
				c[i][j]=a[i][j]+b[i][j];   
					System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");		
		}


	}
}

class AdditionOfMatrix{
	public static void main(String[] args) {

		System.out.println("Enter the Row which is common for Both the matrix");
		Scanner sc=new Scanner(System.in);
		int row= sc.nextInt();
		System.out.println("Enter the col which is common for Both the matrix");
		
		int col= sc.nextInt();
		int Matrix1[][]=new int[row][col];
		int Matrix2[][]=new int[row][col];
		System.out.println("Enter the elements of of Matrix 1");
		for (int i=0; i<row;i++ ) {
			for (int j=0;j<col ;j++ ) {
				Matrix1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Enter the elements of of Matrix 2");
		for (int i=0; i<row;i++ ) {
			for (int j=0;j<col ;j++ ) {
				Matrix2[i][j]=sc.nextInt();
			}
			
		}

		Add obj =new Add();
		obj.Adddition(Matrix1,Matrix2,row,col);
	}
}