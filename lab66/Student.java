import java.util.*;

class student{
	String name;
	int ID;

}
class Sports extends student{
	int s_grade;
	Sports(int s_grade){
		this.s_grade=s_grade;
	}
}

class Exam extends student{
	int e_grade;
	void Exan(int e_grade){
		this.e_grade=e_grade;
	}
}

class Results extends Sports,Exam {


	void display(){
		System.out.println(name+"with"+ID+"has"+s_grade+"in Sports exam and"+e_grade+"in academic exam");

	}
}