package org.test.namal.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Messege {

	private long id;
	private String messege;
	private Date created;
	private String creator;
	
	public Messege() {
		
	}
	
	public Messege(long id, String messege, String creator) {
		this.id = id;
		this.messege = messege;
		this.created = new Date();
		this.creator = creator;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	 
	
}
