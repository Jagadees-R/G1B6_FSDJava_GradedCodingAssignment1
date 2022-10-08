package departments;

public class TechDepartment extends SuperDepartment 
{
	String dept = "Tech Department";
	String work = "Complete coding of module 1 ";
	String deadline = "Complete by EOD ";
	String info = "Core JAVA ";
	public String departmentName() 
	{
		return dept;
	}
	public String getTodaysWork() 
	{
		return work;
	}
	public String getWorkDeadline() 
	{
		return deadline;
	}
	public String getTechStackInformation() 
	{
		return info;
	}
	public void display() 
	{
		System.out.println("Welcome To "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
		System.out.println(" ");
	}
}
