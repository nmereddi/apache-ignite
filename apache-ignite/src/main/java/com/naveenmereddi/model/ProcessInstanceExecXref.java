package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the PROCESS_INSTANCE_EXEC_XREF database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE_EXEC_XREF")
@NamedQuery(name="ProcessInstanceExecXref.findAll", query="SELECT p FROM ProcessInstanceExecXref p")
public class ProcessInstanceExecXref implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	private Timestamp ctime;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFY_DATE")
	private Date modifyDate;

	private Timestamp mtime;

	@Column(name="PROCESS_DEFINITION_ACT_LABEL")
	private String processDefinitionActLabel;

	@Column(name="PROCESS_DEFINITION_ACTIVITY_ID")
	private String processDefinitionActivityId;

	//bi-directional many-to-one association to ProcessInstance
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_ID")
	private ProcessInstance processInstance;

	//bi-directional many-to-one association to ProcessInstanceExecution
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_EXECUTION_ID")
	private ProcessInstanceExecution processInstanceExecution;

	public ProcessInstanceExecXref() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Timestamp getCtime() {
		return this.ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Timestamp getMtime() {
		return this.mtime;
	}

	public void setMtime(Timestamp mtime) {
		this.mtime = mtime;
	}

	public String getProcessDefinitionActLabel() {
		return this.processDefinitionActLabel;
	}

	public void setProcessDefinitionActLabel(String processDefinitionActLabel) {
		this.processDefinitionActLabel = processDefinitionActLabel;
	}

	public String getProcessDefinitionActivityId() {
		return this.processDefinitionActivityId;
	}

	public void setProcessDefinitionActivityId(String processDefinitionActivityId) {
		this.processDefinitionActivityId = processDefinitionActivityId;
	}

	public ProcessInstance getProcessInstance() {
		return this.processInstance;
	}

	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

	public ProcessInstanceExecution getProcessInstanceExecution() {
		return this.processInstanceExecution;
	}

	public void setProcessInstanceExecution(ProcessInstanceExecution processInstanceExecution) {
		this.processInstanceExecution = processInstanceExecution;
	}

}