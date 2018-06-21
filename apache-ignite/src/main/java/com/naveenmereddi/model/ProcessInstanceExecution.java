package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the PROCESS_INSTANCE_EXECUTION database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE_EXECUTION")
@NamedQuery(name="ProcessInstanceExecution.findAll", query="SELECT p FROM ProcessInstanceExecution p")
public class ProcessInstanceExecution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="ACTIVE_FLAG")
	private BigDecimal activeFlag;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	private Timestamp ctime;

	@Temporal(TemporalType.DATE)
	@Column(name="DUE_DATE")
	private Date dueDate;

	@Column(name="MODIFY_DATE")
	private Timestamp modifyDate;

	private Timestamp mtime;

	@Column(name="PROCESS_DEFINITION_ACT_LABEL")
	private String processDefinitionActLabel;

	@Column(name="PROCESS_DEFINITION_ACTIVITY_ID")
	private String processDefinitionActivityId;

	@Temporal(TemporalType.DATE)
	@Column(name="RUN_DATE")
	private Date runDate;

	@Column(name="SCOPE_EXECUTION_ID")
	private BigDecimal scopeExecutionId;

	@Column(name="SEVERITY_LEVEL")
	private BigDecimal severityLevel;

	//bi-directional many-to-one association to ProcessInstance
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_ID")
	private ProcessInstance processInstance;

	//bi-directional many-to-one association to ProcessInstanceExecution
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	private ProcessInstanceExecution processInstanceExecution;

	//bi-directional many-to-one association to ProcessInstanceExecution
	@OneToMany(mappedBy="processInstanceExecution")
	private List<ProcessInstanceExecution> processInstanceExecutions;

	//bi-directional many-to-one association to ProcessInstanceExecStatus
	@ManyToOne
	@JoinColumn(name="PROCESS_INST_EXEC_STATUS_ID")
	private ProcessInstanceExecStatus processInstanceExecStatus;

	//bi-directional many-to-one association to ProcessInstanceExecXref
	@OneToMany(mappedBy="processInstanceExecution")
	private List<ProcessInstanceExecXref> processInstanceExecXrefs;

	//bi-directional many-to-one association to ProcessInstanceResource
	@OneToMany(mappedBy="processInstanceExecution")
	private List<ProcessInstanceResource> processInstanceResources;

	public ProcessInstanceExecution() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
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

	public Timestamp getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
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

	public Date getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}

	public BigDecimal getScopeExecutionId() {
		return this.scopeExecutionId;
	}

	public void setScopeExecutionId(BigDecimal scopeExecutionId) {
		this.scopeExecutionId = scopeExecutionId;
	}

	public BigDecimal getSeverityLevel() {
		return this.severityLevel;
	}

	public void setSeverityLevel(BigDecimal severityLevel) {
		this.severityLevel = severityLevel;
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

	public List<ProcessInstanceExecution> getProcessInstanceExecutions() {
		return this.processInstanceExecutions;
	}

	public void setProcessInstanceExecutions(List<ProcessInstanceExecution> processInstanceExecutions) {
		this.processInstanceExecutions = processInstanceExecutions;
	}

	public ProcessInstanceExecution addProcessInstanceExecution(ProcessInstanceExecution processInstanceExecution) {
		getProcessInstanceExecutions().add(processInstanceExecution);
		processInstanceExecution.setProcessInstanceExecution(this);

		return processInstanceExecution;
	}

	public ProcessInstanceExecution removeProcessInstanceExecution(ProcessInstanceExecution processInstanceExecution) {
		getProcessInstanceExecutions().remove(processInstanceExecution);
		processInstanceExecution.setProcessInstanceExecution(null);

		return processInstanceExecution;
	}

	public ProcessInstanceExecStatus getProcessInstanceExecStatus() {
		return this.processInstanceExecStatus;
	}

	public void setProcessInstanceExecStatus(ProcessInstanceExecStatus processInstanceExecStatus) {
		this.processInstanceExecStatus = processInstanceExecStatus;
	}

	public List<ProcessInstanceExecXref> getProcessInstanceExecXrefs() {
		return this.processInstanceExecXrefs;
	}

	public void setProcessInstanceExecXrefs(List<ProcessInstanceExecXref> processInstanceExecXrefs) {
		this.processInstanceExecXrefs = processInstanceExecXrefs;
	}

	public ProcessInstanceExecXref addProcessInstanceExecXref(ProcessInstanceExecXref processInstanceExecXref) {
		getProcessInstanceExecXrefs().add(processInstanceExecXref);
		processInstanceExecXref.setProcessInstanceExecution(this);

		return processInstanceExecXref;
	}

	public ProcessInstanceExecXref removeProcessInstanceExecXref(ProcessInstanceExecXref processInstanceExecXref) {
		getProcessInstanceExecXrefs().remove(processInstanceExecXref);
		processInstanceExecXref.setProcessInstanceExecution(null);

		return processInstanceExecXref;
	}

	public List<ProcessInstanceResource> getProcessInstanceResources() {
		return this.processInstanceResources;
	}

	public void setProcessInstanceResources(List<ProcessInstanceResource> processInstanceResources) {
		this.processInstanceResources = processInstanceResources;
	}

	public ProcessInstanceResource addProcessInstanceResource(ProcessInstanceResource processInstanceResource) {
		getProcessInstanceResources().add(processInstanceResource);
		processInstanceResource.setProcessInstanceExecution(this);

		return processInstanceResource;
	}

	public ProcessInstanceResource removeProcessInstanceResource(ProcessInstanceResource processInstanceResource) {
		getProcessInstanceResources().remove(processInstanceResource);
		processInstanceResource.setProcessInstanceExecution(null);

		return processInstanceResource;
	}

}