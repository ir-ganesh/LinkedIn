package org.BuzzToOffice.learningspring.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROOM_ID")
	private long id;

	@Column(name = "NAME")
	private String name;
	@Column(name = "ROOM_NUMBER")
	private String number;

	@Column(name = "BED_INFO")
	private String bed_info;

	public String getBed_info() {
		return bed_info;
	}

	public void setBed_info(String bed_info) {
		this.bed_info = bed_info;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Room{" +
				"id="+id +
				", name=\'"+name+"\'" +
				", roomNumber=\'" + number + "\'" +
				", bedInfo=\'" + bed_info + "\'}";
				
	}
	
	
}
