package com.fse.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task implements Serializable{
	private static final long serialVersionUTD =1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="task_id")
	int taskId;
	@JoinColumn(name="parent_id")
	@ManyToOne(cascade=CascadeType.ALL)
	ParentTask parent;
	@Column(name="task")
	String task;
	@Column(name="start_date")
	String startDate;
	@Column(name="end_date")
	String endDate;
	@Column(name="priority")
	int priority;
	@Column(name="delete_flag")
	int deleteFlag;
	
	public int getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	
	public ParentTask getParent() {
		return parent;
	}
	public void setParent(ParentTask parent) {
		this.parent = parent;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public static long getSerialversionutd() {
		return serialVersionUTD;
	}
	

}
