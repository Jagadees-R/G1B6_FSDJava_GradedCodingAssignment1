package departments;

public class AdminDepartment extends SuperDepartment
{
	String dept = "Admin Department";
	String work = "Complete your documents Submission";
	String deadline = "Complete by EOD";
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
	public void display() 
	{
		System.out.println("Welcome To "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println(" ");
	}

}
