package com.xworkz.tree.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TreeDto {
	
	private String name;
	private String type;
	private String colorOfLeaves;
	private int costoftree;
	private int noOfBranch;
	private int lifeOfTree;
	private String colorofstem;
	private int length;
	private int width;
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColorOfLeaves() {
		return colorOfLeaves;
	}
	public void setColorOfLeaves(String colorOfLeaves) {
		this.colorOfLeaves = colorOfLeaves;
	}
	public int getCostoftree() {
		return costoftree;
	}
	public void setCostoftree(int costoftree) {
		this.costoftree = costoftree;
	}
	public int getNoOfBranch() {
		return noOfBranch;
	}
	public void setNoOfBranch(int noOfBranch) {
		this.noOfBranch = noOfBranch;
	}
	public int getLifeOfTree() {
		return lifeOfTree;
	}
	public void setLifeOfTree(int lifeOfTree) {
		this.lifeOfTree = lifeOfTree;
	}
	public String getColorofstem() {
		return colorofstem;
	}
	public void setColorofstem(String colorofstem) {
		this.colorofstem = colorofstem;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "TreeDto [name=" + name + ", type=" + type + ", colorOfLeaves=" + colorOfLeaves + ", costoftree="
				+ costoftree + ", noOfBranch=" + noOfBranch + ", lifeOfTree=" + lifeOfTree + ", colorofstem="
				+ colorofstem + ", length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	public TreeDto(String name, String type, String colorOfLeaves, int costoftree, int noOfBranch, int lifeOfTree,
			String colorofstem, int length, int width, int height) {
		super();
		this.name = name;
		this.type = type;
		this.colorOfLeaves = colorOfLeaves;
		this.costoftree = costoftree;
		this.noOfBranch = noOfBranch;
		this.lifeOfTree = lifeOfTree;
		this.colorofstem = colorofstem;
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public TreeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	

}
