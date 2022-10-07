

import java.util.*;


class Building
{
	float sqft;
	int stories;

	public void setFeet(float sqft)
	{
	   this.sqft = sqft;
	}

	public void setStories(int stories)
	{
	    this.stories = stories;
	}

	public float getStories()
	{
        return stories;
	}

	public float getFeet()
	{
        return sqft;
	}
}

class House extends Building
{
	int beds;
	int baths;

	public void setBeds(int nbeds)
	{
	   this.beds = nbeds;
	}

	public void setBath(int nBaths)
	{
	    this.baths = nBaths;
	}

	public int getBed()
	{
        return beds;
	}

	public int getBath()
	{
        return baths;
	}
}

class School extends Building
{
	public int classes;
	public String grade;

	public void setClass(int nclasses)
	{
	   this.classes = nclasses;
	}

	public void setGrade(String grade)
	{
	    this.grade = new String(grade);
	}

	public int getClasses()
	{
        return classes;
	}

	public String getGrade()
	{
        return grade;
	}
}


public class BuildingTest
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);

	   Building b = new Building();
	   House h = new House();
	   School s = new School();

	   System.out.println("Enter sq : ");
	   b.setFeet(sc.nextFloat());

	   System.out.println("Enter stories : ");
	   b.setStories(sc.nextInt());

	   System.out.println("Building made with \n Stories : " + b.getStories() + "\n Sq Foot : " + b.getFeet());

	   System.out.println("Enter bedrooms : ");
	   h.setBeds(sc.nextInt());

	   System.out.println("Enter bathrooms : ");
	   h.setBath(sc.nextInt());

	   System.out.println("House made with \n Rooms : " + h.getBed() + "\n Bathrooms : " + h.getBath());

	   System.out.println("Enter classrooms : ");
	   s.setClass(sc.nextInt());

	   System.out.println("Enter level of grade : ");
	   sc.nextLine();
	   s.setGrade(sc.nextLine());

	   System.out.println("School \n Grade : " + s.getGrade() + "\n Sq Foot : " + s.getClasses());
	}
}