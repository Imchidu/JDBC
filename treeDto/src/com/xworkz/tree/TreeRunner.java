package com.xworkz.tree;

import com.xworkz.tree.Dto.TreeDto;
import com.xworkz.tree.Repo.TreeRepoImpl;

public class TreeRunner {

	public static void main(String[] args) {

		TreeDto dto = new TreeDto("neem", "big", "green", 1000, 20, 100, "brown", 50, 3, 20);

		TreeRepoImpl treeRepoImpl = new TreeRepoImpl();
		boolean save = treeRepoImpl.save(dto);
		System.out.println(save);

	}

}
