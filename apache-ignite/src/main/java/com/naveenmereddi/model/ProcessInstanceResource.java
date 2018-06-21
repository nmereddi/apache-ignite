package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the PROCESS_INSTANCE_RESOURCE database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE_RESOURCE")
@NamedQuery(name="ProcessInstanceResource.findAll", query="SELECT p FROM ProcessInstanceResource p")
public class ProcessInstanceResource implements Serializable {
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

	@Column(name="RESOURCE_ID")
	private BigDecimal resourceId;

	//bi-directional many-to-one association to ProcessInstance
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_ID")
	private ProcessInstance processInstance;

	//bi-directional many-to-one association to ProcessInstanceExecution
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_EXECUTION_ID")
	private ProcessInstanceExecution processInstanceExecution;

	//bi-directional many-to-one association to ProcessInstanceResourceType
	@ManyToOne
	@JoinColumn(name="PROCESS_INSTANCE_RES_TYPE_ID")
	private ProcessInstanceResourceType processInstanceResourceType;

	public ProcessInstanceResource() {
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

	public BigDecimal getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(BigDecimal resourceId) {
		this.resourceId = resourceId;
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

	public ProcessInstanceResourceType getProcessInstanceResourceType() {
		return this.processInstanceResourceType;
	}

	public void setProcessInstanceResourceType(ProcessInstanceResourceType processInstanceResourceType) {
		this.processInstanceResourceType = processInstanceResourceType;
	}

}