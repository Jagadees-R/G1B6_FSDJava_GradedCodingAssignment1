package departments;

public class HrDepartment extends SuperDepartment 
{
	String dept = "Hr Department ";
	String work = "Fill today's timesheet and mark your attendence";
	String deadline = "Complete by EOD";
	String activity = "team Lunch ";
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
	public String doActivity() 
	{
		return activity;
	}
	public void display() 
	{
		System.out.println("Welcome To "+departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println(" ");
	}
}





