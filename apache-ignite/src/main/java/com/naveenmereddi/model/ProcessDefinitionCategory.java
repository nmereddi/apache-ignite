package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the PROCESS_DEFINITION_CATEGORY database table.
 * 
 */
@Entity
@Table(name="PROCESS_DEFINITION_CATEGORY")
@NamedQuery(name="ProcessDefinitionCategory.findAll", query="SELECT p FROM ProcessDefinitionCategory p")
public class ProcessDefinitionCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private Timestamp ctime;

	@Column(name="KEY_NAME")
	private String keyName;

	private Timestamp mtime;

	private String name;

	public ProcessDefinitionCategory() {
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

}