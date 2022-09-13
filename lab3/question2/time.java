import java.util.*;
class TIME{
	int hours;
	int minutes;
	int seconds;

	public TIME(int hours,int minutes,int seconds){
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}

	void displaytime(){
		System.out.printf("\nTime= %d hours:%d minutes:%d seconds",hours,minutes,seconds);

	}
	public void display(TIME timetobedisplayed){
		System.out.printf("\nTime= %d hours:%d minutes:%d seconds \n",timetobedisplayed.hours,timetobedisplayed.minutes,timetobedisplayed.seconds);

	}
	public TIME add(TIME t1,TIME t2){
		TIME temp=new TIME(0,0,0);
		temp.hours=t1.hours+t2.hours;
		temp.minutes=t1.minutes+t2.minutes;
		temp.seconds=t1.seconds+t2.seconds;
		display(temp);
		return temp;
	}

	public TIME substract(TIME t1,TIME t2){
		TIME temp=new TIME(0,0,0);
		temp.hours=Math.abs(t1.hours-t2.hours);
		temp.minutes=Math.abs(t1.minutes-t2.minutes);
		temp.seconds=Math.abs(t1.seconds-t2.seconds);
		display(temp);
		return temp;
	}

	public TIME compare(TIME t1,TIME t2){
		TIME temp=new TIME(0,0,0);
		if(t1.hours>t2.hours){
			temp=t1;
		}
		else if (t1.hours==t2.hours) {
			if(t1.minutes>t2.minutes){
				temp=t1;
			}
			else if(t1.minutes==t2.minutes){
				if(t1.seconds>t2.seconds){
					temp=t1;
				}
				else{
					temp=t2;
				}

			}
			else{
				temp=t2;
			}
			
		}
		else{
			temp=t2;
		}
		display(temp);
		return temp;
	}

}

class time{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in); 
	System.out.println("Enter the time 1");
	System.out.print("hour");
	int a =sc.nextInt();
	System.out.print("minutes");
	int b =sc.nextInt();
	System.out.print("seconds");
	int c =sc.nextInt();
	System.out.println("Enter the time 2");
	System.out.print("hour");
	int e =sc.nextInt();
	System.out.print("minutes");
	int f =sc.nextInt();
	System.out.print("seconds");
	int g =sc.nextInt();


	TIME obj1=new TIME(a,b,c);
	TIME obj2=new TIME(e,f,g);
	TIME temp =new TIME(0,0,0);
	obj1.displaytime();
	obj2.displaytime();
	temp.add(obj1,obj2);
	temp.substract(obj1,obj2);
	temp.compare(obj1,obj2);
	
	}
}