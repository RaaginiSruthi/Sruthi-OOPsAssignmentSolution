package com.company.departments;

/**
 * @author sruthi
 * @return This is department superclass extended by other departments
 */
public class SuperDepartment {

	private String departmentName = "Super Department";
	private String todaysWork = "No Work as of now";
	private String workDeadline = "Nil";
	private String isHoliday = "Today is not a holiday";

	/**
	 * 
	 * @return Department name
	 */
	public String departmentName() {
		return departmentName;
	}

	/**
	 * 
	 * @return Work for the day / Today's work
	 */
	public String getTodaysWork() {
		return todaysWork;
	}

	/**
	 * 
	 * @return Work Deadline
	 */
	public String getWorkDeadline() {
		return workDeadline;
	}

	/**
	 * 
	 * @return if today is a holiday
	 */
	public String isTodayAHoliday() {
		return isHoliday;
	}

}
