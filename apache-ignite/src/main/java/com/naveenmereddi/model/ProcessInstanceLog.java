package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the PROCESS_INSTANCE_LOG database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE_LOG")
@NamedQuery(name="ProcessInstanceLog.findAll", query="SELECT p FROM ProcessInstanceLog p")
public class ProcessInstanceLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	private Timestamp ctime;

	@Column(name="\"DATA\"")
	private String data;

	@Column(name="EMP_RECORD_ID")
	private BigDecimal empRecordId;

	@Column(name="LOG_LEVEL")
	private BigDecimal logLevel;

	private Timestamp mtime;

	@Column(name="PROCESS_DEFINITION_ACT_LABEL")
	private String processDefinitionActLabel;

	@Column(name="PROCESS_DEFINITION_ACTIVITY_ID")
	private String processDefinitionActivityId;

	//bi-directional many-to-one association to ProcessInstance
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_ID")
	private ProcessInstance processInstance;

	//bi-directional many-to-one association to ProcessInstanceLogType
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_LOG_TYPE_ID")
	private ProcessInstanceLogType processInstanceLogType;

	public ProcessInstanceLog() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BigDecimal getEmpRecordId() {
		return this.empRecordId;
	}

	public void setEmpRecordId(BigDecimal empRecordId) {
		this.empRecordId = empRecordId;
	}

	public BigDecimal getLogLevel() {
		return this.logLevel;
	}

	public void setLogLevel(BigDecimal logLevel) {
		this.logLevel = logLevel;
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

	public ProcessInstanceLogType getProcessInstanceLogType() {
		return this.processInstanceLogType;
	}

	public void setProcessInstanceLogType(ProcessInstanceLogType processInstanceLogType) {
		this.processInstanceLogType = processInstanceLogType;
	}

}