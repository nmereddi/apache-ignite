package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the PROCESS_INSTANCE database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE")
@NamedQuery(name="ProcessInstance.findAll", query="SELECT p FROM ProcessInstance p")
public class ProcessInstance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="COMPLETED_FLAG")
	private BigDecimal completedFlag;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	private Timestamp ctime;

	@Temporal(TemporalType.DATE)
	@Column(name="DUE_DATE")
	private Date dueDate;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFY_DATE")
	private Date modifyDate;

	private Timestamp mtime;

	@Column(name="PROCESS_DEFINITION_ID")
	private BigDecimal processDefinitionId;

	@Column(name="SEVERITY_LEVEL")
	private BigDecimal severityLevel;

	//bi-directional many-to-one association to ProcessInstanceMode
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_MODE_ID")
	private ProcessInstanceMode processInstanceMode;

	//bi-directional many-to-one association to ProcessInstanceExecution
	@OneToMany(mappedBy="processInstance")
	private List<ProcessInstanceExecution> processInstanceExecutions;

	//bi-directional many-to-one association to ProcessInstanceExecXref
	@OneToMany(mappedBy="processInstance")
	private List<ProcessInstanceExecXref> processInstanceExecXrefs;

	//bi-directional many-to-one association to ProcessInstanceLog
	@OneToMany(mappedBy="processInstance")
	private List<ProcessInstanceLog> processInstanceLogs;

	//bi-directional many-to-one association to ProcessInstanceResource
	@OneToMany(mappedBy="processInstance")
	private List<ProcessInstanceResource> processInstanceResources;

	//bi-directional many-to-one association to ProcessInstanceVariable
	@OneToMany(mappedBy="processInstance")
	private List<ProcessInstanceVariable> processInstanceVariables;

	public ProcessInstance() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCompletedFlag() {
		return this.completedFlag;
	}

	public void setCompletedFlag(BigDecimal completedFlag) {
		this.completedFlag = completedFlag;
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

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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

	public BigDecimal getProcessDefinitionId() {
		return this.processDefinitionId;
	}

	public void setProcessDefinitionId(BigDecimal processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public BigDecimal getSeverityLevel() {
		return this.severityLevel;
	}

	public void setSeverityLevel(BigDecimal severityLevel) {
		this.severityLevel = severityLevel;
	}

	public ProcessInstanceMode getProcessInstanceMode() {
		return this.processInstanceMode;
	}

	public void setProcessInstanceMode(ProcessInstanceMode processInstanceMode) {
		this.processInstanceMode = processInstanceMode;
	}

	public List<ProcessInstanceExecution> getProcessInstanceExecutions() {
		return this.processInstanceExecutions;
	}

	public void setProcessInstanceExecutions(List<ProcessInstanceExecution> processInstanceExecutions) {
		this.processInstanceExecutions = processInstanceExecutions;
	}

	public ProcessInstanceExecution addProcessInstanceExecution(ProcessInstanceExecution processInstanceExecution) {
		getProcessInstanceExecutions().add(processInstanceExecution);
		processInstanceExecution.setProcessInstance(this);

		return processInstanceExecution;
	}

	public ProcessInstanceExecution removeProcessInstanceExecution(ProcessInstanceExecution processInstanceExecution) {
		getProcessInstanceExecutions().remove(processInstanceExecution);
		processInstanceExecution.setProcessInstance(null);

		return processInstanceExecution;
	}

	public List<ProcessInstanceExecXref> getProcessInstanceExecXrefs() {
		return this.processInstanceExecXrefs;
	}

	public void setProcessInstanceExecXrefs(List<ProcessInstanceExecXref> processInstanceExecXrefs) {
		this.processInstanceExecXrefs = processInstanceExecXrefs;
	}

	public ProcessInstanceExecXref addProcessInstanceExecXref(ProcessInstanceExecXref processInstanceExecXref) {
		getProcessInstanceExecXrefs().add(processInstanceExecXref);
		processInstanceExecXref.setProcessInstance(this);

		return processInstanceExecXref;
	}

	public ProcessInstanceExecXref removeProcessInstanceExecXref(ProcessInstanceExecXref processInstanceExecXref) {
		getProcessInstanceExecXrefs().remove(processInstanceExecXref);
		processInstanceExecXref.setProcessInstance(null);

		return processInstanceExecXref;
	}

	public List<ProcessInstanceLog> getProcessInstanceLogs() {
		return this.processInstanceLogs;
	}

	public void setProcessInstanceLogs(List<ProcessInstanceLog> processInstanceLogs) {
		this.processInstanceLogs = processInstanceLogs;
	}

	public ProcessInstanceLog addProcessInstanceLog(ProcessInstanceLog processInstanceLog) {
		getProcessInstanceLogs().add(processInstanceLog);
		processInstanceLog.setProcessInstance(this);

		return processInstanceLog;
	}

	public ProcessInstanceLog removeProcessInstanceLog(ProcessInstanceLog processInstanceLog) {
		getProcessInstanceLogs().remove(processInstanceLog);
		processInstanceLog.setProcessInstance(null);

		return processInstanceLog;
	}

	public List<ProcessInstanceResource> getProcessInstanceResources() {
		return this.processInstanceResources;
	}

	public void setProcessInstanceResources(List<ProcessInstanceResource> processInstanceResources) {
		this.processInstanceResources = processInstanceResources;
	}

	public ProcessInstanceResource addProcessInstanceResource(ProcessInstanceResource processInstanceResource) {
		getProcessInstanceResources().add(processInstanceResource);
		processInstanceResource.setProcessInstance(this);

		return processInstanceResource;
	}

	public ProcessInstanceResource removeProcessInstanceResource(ProcessInstanceResource processInstanceResource) {
		getProcessInstanceResources().remove(processInstanceResource);
		processInstanceResource.setProcessInstance(null);

		return processInstanceResource;
	}

	public List<ProcessInstanceVariable> getProcessInstanceVariables() {
		return this.processInstanceVariables;
	}

	public void setProcessInstanceVariables(List<ProcessInstanceVariable> processInstanceVariables) {
		this.processInstanceVariables = processInstanceVariables;
	}

	public ProcessInstanceVariable addProcessInstanceVariable(ProcessInstanceVariable processInstanceVariable) {
		getProcessInstanceVariables().add(processInstanceVariable);
		processInstanceVariable.setProcessInstance(this);

		return processInstanceVariable;
	}

	public ProcessInstanceVariable removeProcessInstanceVariable(ProcessInstanceVariable processInstanceVariable) {
		getProcessInstanceVariables().remove(processInstanceVariable);
		processInstanceVariable.setProcessInstance(null);

		return processInstanceVariable;
	}

}