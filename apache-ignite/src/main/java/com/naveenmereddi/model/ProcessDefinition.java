package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the PROCESS_DEFINITION database table.
 * 
 */
@Entity
@Table(name="PROCESS_DEFINITION")
@NamedQuery(name="ProcessDefinition.findAll", query="SELECT p FROM ProcessDefinition p")
public class ProcessDefinition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	private Timestamp ctime;

	@Column(name="FILE_HASH")
	private String fileHash;

	@Column(name="KEY_NAME")
	private String keyName;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFY_DATE")
	private Date modifyDate;

	private Timestamp mtime;

	private String name;

	@Column(name="PROCESS_DEFINITION_CATEGORY_ID")
	private BigDecimal processDefinitionCategoryId;

	@Column(name="PROCESS_DEFINITION_STATUS_ID")
	private BigDecimal processDefinitionStatusId;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	public ProcessDefinition() {
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

	public String getFileHash() {
		return this.fileHash;
	}

	public void setFileHash(String fileHash) {
		this.fileHash = fileHash;
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getProcessDefinitionCategoryId() {
		return this.processDefinitionCategoryId;
	}

	public void setProcessDefinitionCategoryId(BigDecimal processDefinitionCategoryId) {
		this.processDefinitionCategoryId = processDefinitionCategoryId;
	}

	public BigDecimal getProcessDefinitionStatusId() {
		return this.processDefinitionStatusId;
	}

	public void setProcessDefinitionStatusId(BigDecimal processDefinitionStatusId) {
		this.processDefinitionStatusId = processDefinitionStatusId;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}