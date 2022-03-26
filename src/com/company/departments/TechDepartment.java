package com.company.departments;

/**
 * @author sruthi
 * @return This class extends SuperDepartment & displays the functionalities of
 *         Tech Department
 */
public class TechDepartment extends SuperDepartment {

	private String departmentName = "Tech Department";
	private String todaysWork = "Complete coding of module 1";
	private String workDeadline = "Complete by EOD";
	private String stackInformation = "Core Java";

	/**
	 * @return Department name
	 */
	@Override
	public String departmentName() {
		return departmentName;
	}

	/**
	 * @return Work for the day / Today's work
	 */
	@Override
	public String getTodaysWork() {
		return todaysWork;
	}

	/**
	 * @return Work Deadline
	 */
	@Override
	public String getWorkDeadline() {
		return workDeadline;
	}

	/**
	 * @return Stack information
	 */
	public String getTechStackInformation() {
		return stackInformation;
	}

}
