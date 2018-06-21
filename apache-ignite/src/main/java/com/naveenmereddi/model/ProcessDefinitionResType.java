package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the PROCESS_DEFINITION_RES_TYPE database table.
 * 
 */
@Entity
@Table(name="PROCESS_DEFINITION_RES_TYPE")
@NamedQuery(name="ProcessDefinitionResType.findAll", query="SELECT p FROM ProcessDefinitionResType p")
public class ProcessDefinitionResType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private Timestamp ctime;

	@Column(name="KEY_NAME")
	private String keyName;

	private Timestamp mtime;

	private String name;

	//bi-directional many-to-one association to ProcessDefinitionResource
	@OneToMany(mappedBy="processDefinitionResType")
	private List<ProcessDefinitionResource> processDefinitionResources;

	public ProcessDefinitionResType() {
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

	public List<ProcessDefinitionResource> getProcessDefinitionResources() {
		return this.processDefinitionResources;
	}

	public void setProcessDefinitionResources(List<ProcessDefinitionResource> processDefinitionResources) {
		this.processDefinitionResources = processDefinitionResources;
	}

	public ProcessDefinitionResource addProcessDefinitionResource(ProcessDefinitionResource processDefinitionResource) {
		getProcessDefinitionResources().add(processDefinitionResource);
		processDefinitionResource.setProcessDefinitionResType(this);

		return processDefinitionResource;
	}

	public ProcessDefinitionResource removeProcessDefinitionResource(ProcessDefinitionResource processDefinitionResource) {
		getProcessDefinitionResources().remove(processDefinitionResource);
		processDefinitionResource.setProcessDefinitionResType(null);

		return processDefinitionResource;
	}

}