package com.company.departments;

/**
 * @author sruthi
 * @return This class extends SuperDepartment & displays the functionalities of
 *         Admin Department
 */
public class AdminDepartment extends SuperDepartment {

	private String departmentName = "Admin Department";
	private String todaysWork = "Complete your documents Submission";
	private String workDeadline = "Complete by EOD";

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

}
