package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the PROCESS_INSTANCE_MODE database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE_MODE")
@NamedQuery(name="ProcessInstanceMode.findAll", query="SELECT p FROM ProcessInstanceMode p")
public class ProcessInstanceMode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private Timestamp ctime;

	private String description;

	@Column(name="KEY_NAME")
	private String keyName;

	private Timestamp mtime;

	private String name;

	//bi-directional many-to-one association to ProcessInstance
	@OneToMany(mappedBy="processInstanceMode")
	private List<ProcessInstance> processInstances;

	public ProcessInstanceMode() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List<ProcessInstance> getProcessInstances() {
		return this.processInstances;
	}

	public void setProcessInstances(List<ProcessInstance> processInstances) {
		this.processInstances = processInstances;
	}

	public ProcessInstance addProcessInstance(ProcessInstance processInstance) {
		getProcessInstances().add(processInstance);
		processInstance.setProcessInstanceMode(this);

		return processInstance;
	}

	public ProcessInstance removeProcessInstance(ProcessInstance processInstance) {
		getProcessInstances().remove(processInstance);
		processInstance.setProcessInstanceMode(null);

		return processInstance;
	}

}