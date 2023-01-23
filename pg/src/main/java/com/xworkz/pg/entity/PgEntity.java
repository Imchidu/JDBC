package com.xworkz.pg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "pg_det")
public class PgEntity implements Serializable, Cloneable {

	@Id
	@Column(name = "pg_id")
	private Integer id;
	@Column(name = "pg_name")
	private String name;
	private Double rent;

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

	public Double getRent() {
		return rent;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "PgEntity [id=" + id + ", name=" + name + ", rent=" + rent + "]";
	}

	public PgEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PgEntity(Integer id, String name, Double rent) {
		super();
		this.id = id;
		this.name = name;
		this.rent = rent;
	}
	// @entity

}
