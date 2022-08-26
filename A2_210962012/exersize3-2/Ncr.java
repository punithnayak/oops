import java.util.Scanner;
class ncr{
	void NNcr(int n,int r){
		int ans=1;
		for (int i=1;i<=n ;i++ ) {
			ans=ans*i;
			
		}
		int ans2=1;
		int nminusr=n-r;
		for (int j=1;j<=nminusr ;j++ ) {
			ans2=ans2*j;
			
		}
		int ans3=1;

		
		for (int k=1;k<=r ;k++ ) {
			ans3=ans3*k;
			
		}

		double ncr22=(ans/(ans2*ans3));
		System.out.println(ncr22);


	}
}
class Ncr{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n and r");
		int a=sc.nextInt();
	 	int b=sc.nextInt();
	 	ncr obj =new ncr();
	 	obj.NNcr(a,b);


	}
}