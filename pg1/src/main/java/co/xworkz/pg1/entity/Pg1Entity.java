



package co.xworkz.pg1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pg1Entity {
	
	@Id
	private Integer id;
	private String name;
	@Override
	public String toString() {
		return "Pd1Entity [id=" + id + ", name=" + name + "]";
	}
	public Pg1Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pg1Entity(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
