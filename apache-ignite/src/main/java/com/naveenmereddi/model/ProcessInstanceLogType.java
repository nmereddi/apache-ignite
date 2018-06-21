package com.naveenmereddi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the PROCESS_INSTANCE_LOG_TYPE database table.
 * 
 */
@Entity
@Table(name="PROCESS_INSTANCE_LOG_TYPE")
@NamedQuery(name="ProcessInstanceLogType.findAll", query="SELECT p FROM ProcessInstanceLogType p")
public class ProcessInstanceLogType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private Timestamp ctime;

	@Column(name="KEY_NAME")
	private String keyName;

	private Timestamp mtime;

	private String name;

	//bi-directional many-to-one association to ProcessInstanceLog
	@OneToMany(mappedBy="processInstanceLogType")
	private List<ProcessInstanceLog> processInstanceLogs;

	public ProcessInstanceLogType() {
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

	public List<ProcessInstanceLog> getProcessInstanceLogs() {
		return this.processInstanceLogs;
	}

	public void setProcessInstanceLogs(List<ProcessInstanceLog> processInstanceLogs) {
		this.processInstanceLogs = processInstanceLogs;
	}

	public ProcessInstanceLog addProcessInstanceLog(ProcessInstanceLog processInstanceLog) {
		getProcessInstanceLogs().add(processInstanceLog);
		processInstanceLog.setProcessInstanceLogType(this);

		return processInstanceLog;
	}

	public ProcessInstanceLog removeProcessInstanceLog(ProcessInstanceLog processInstanceLog) {
		getProcessInstanceLogs().remove(processInstanceLog);
		processInstanceLog.setProcessInstanceLogType(null);

		return processInstanceLog;
	}

}