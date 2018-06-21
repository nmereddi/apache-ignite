package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the PROCESS_INSTANCE_EXEC_STATUS database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE_EXEC_STATUS")
@NamedQuery(name="ProcessInstanceExecStatus.findAll", query="SELECT p FROM ProcessInstanceExecStatus p")
public class ProcessInstanceExecStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private Timestamp ctime;

	@Column(name="KEY_NAME")
	private String keyName;

	private Timestamp mtime;

	private String name;

	//bi-directional many-to-one association to ProcessInstanceExecution
	@OneToMany(mappedBy="processInstanceExecStatus")
	private List<ProcessInstanceExecution> processInstanceExecutions;

	public ProcessInstanceExecStatus() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getCtime() {
		return this.ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public Timestamp getMtime() {
		return this.mtime;
	}

	public void setMtime(Timestamp mtime) {
		this.mtime = mtime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProcessInstanceExecution> getProcessInstanceExecutions() {
		return this.processInstanceExecutions;
	}

	public void setProcessInstanceExecutions(List<ProcessInstanceExecution> processInstanceExecutions) {
		this.processInstanceExecutions = processInstanceExecutions;
	}

	public ProcessInstanceExecution addProcessInstanceExecution(ProcessInstanceExecution processInstanceExecution) {
		getProcessInstanceExecutions().add(processInstanceExecution);
		processInstanceExecution.setProcessInstanceExecStatus(this);

		return processInstanceExecution;
	}

	public ProcessInstanceExecution removeProcessInstanceExecution(ProcessInstanceExecution processInstanceExecution) {
		getProcessInstanceExecutions().remove(processInstanceExecution);
		processInstanceExecution.setProcessInstanceExecStatus(null);

		return processInstanceExecution;
	}

}