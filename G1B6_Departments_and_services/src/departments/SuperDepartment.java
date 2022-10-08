package departments;

public class SuperDepartment 
{
	String dept = "Super Department";
	String work = "No Work as of now ";
	String deadline = "Nil";
	String holiday = "Today is Not a Holiday";
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
	public String isTodayAHoliday() 
	{
		return holiday;
	}
}
