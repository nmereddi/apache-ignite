package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the PROCESS_INSTANCE_VARIABLE database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE_VARIABLE")
@NamedQuery(name="ProcessInstanceVariable.findAll", query="SELECT p FROM ProcessInstanceVariable p")
public class ProcessInstanceVariable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	private Timestamp ctime;

	@Column(name="\"KEY\"")
	private String key;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFY_DATE")
	private Date modifyDate;

	private Timestamp mtime;

	@Column(name="PROCESS_DEFINITION_ACT_LABEL")
	private String processDefinitionActLabel;

	@Column(name="PROCESS_DEFINITION_ACTIVITY_ID")
	private String processDefinitionActivityId;

	@Column(name="PROCESS_INSTANCE_EXECUTION_ID")
	private BigDecimal processInstanceExecutionId;

	@Column(name="\"VALUE\"")
	private String value;

	//bi-directional many-to-one association to ProcessInstance
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_ID")
	private ProcessInstance processInstance;

	public ProcessInstanceVariable() {
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

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
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

	public BigDecimal getProcessInstanceExecutionId() {
		return this.processInstanceExecutionId;
	}

	public void setProcessInstanceExecutionId(BigDecimal processInstanceExecutionId) {
		this.processInstanceExecutionId = processInstanceExecutionId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ProcessInstance getProcessInstance() {
		return this.processInstance;
	}

	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

}