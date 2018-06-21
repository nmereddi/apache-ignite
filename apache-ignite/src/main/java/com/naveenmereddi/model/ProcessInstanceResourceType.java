package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the PROCESS_INSTANCE_RESOURCE_TYPE database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE_RESOURCE_TYPE")
@NamedQuery(name="ProcessInstanceResourceType.findAll", query="SELECT p FROM ProcessInstanceResourceType p")
public class ProcessInstanceResourceType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="CLASS_NAME")
	private String className;

	private Timestamp ctime;

	@Column(name="KEY_NAME")
	private String keyName;

	private Timestamp mtime;

	private String name;

	//bi-directional many-to-one association to ProcessInstanceResource
	@OneToMany(mappedBy="processInstanceResourceType")
	private List<ProcessInstanceResource> processInstanceResources;

	public ProcessInstanceResourceType() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
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

	public List<ProcessInstanceResource> getProcessInstanceResources() {
		return this.processInstanceResources;
	}

	public void setProcessInstanceResources(List<ProcessInstanceResource> processInstanceResources) {
		this.processInstanceResources = processInstanceResources;
	}

	public ProcessInstanceResource addProcessInstanceResource(ProcessInstanceResource processInstanceResource) {
		getProcessInstanceResources().add(processInstanceResource);
		processInstanceResource.setProcessInstanceResourceType(this);

		return processInstanceResource;
	}

	public ProcessInstanceResource removeProcessInstanceResource(ProcessInstanceResource processInstanceResource) {
		getProcessInstanceResources().remove(processInstanceResource);
		processInstanceResource.setProcessInstanceResourceType(null);

		return processInstanceResource;
	}

}