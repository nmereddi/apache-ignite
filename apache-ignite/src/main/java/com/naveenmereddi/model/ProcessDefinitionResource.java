package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the PROCESS_DEFINITION_RESOURCE database table.
 * 
 */
@Entity
@Table(name="PROCESS_DEFINITION_RESOURCE")
@NamedQuery(name="ProcessDefinitionResource.findAll", query="SELECT p FROM ProcessDefinitionResource p")
public class ProcessDefinitionResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	private Timestamp ctime;

	@Column(name="\"DATA\"")
	private String data;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFY_DATE")
	private Date modifyDate;

	private Timestamp mtime;

	@Column(name="PROCESS_DEFINITION_ID")
	private java.math.BigDecimal processDefinitionId;

	//bi-directional many-to-one association to ProcessDefinitionResType
	@ManyToOne
	@JoinColumn(name="PROCESS_DEFINITION_RES_TYPE_ID")
	private ProcessDefinitionResType processDefinitionResType;

	public ProcessDefinitionResource() {
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

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
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

	public java.math.BigDecimal getProcessDefinitionId() {
		return this.processDefinitionId;
	}

	public void setProcessDefinitionId(java.math.BigDecimal processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public ProcessDefinitionResType getProcessDefinitionResType() {
		return this.processDefinitionResType;
	}

	public void setProcessDefinitionResType(ProcessDefinitionResType processDefinitionResType) {
		this.processDefinitionResType = processDefinitionResType;
	}

}