package com.company.departments;

/**
 * @author sruthi
 * @return This class extends SuperDepartment & displays the functionalities of
 *         HR Department
 */
public class HRDepartment extends SuperDepartment {

	private String departmentName = "HR Department";
	private String todaysWork = "Fill today’s worksheet and mark your attendance";
	private String workDeadline = "Complete by EOD";
	private String activity = "teamLunch";

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
	 * @return Activity
	 */
	public String doActivity() {
		return activity;
	}

}
