package com.xworkz.pg.runner;

import com.xworkz.pg.entity.PgEntity;
import com.xworkz.pg.entity.service.PgService;
import com.xworkz.pg.entity.service.impl.PgServiceImpl;

public class PgTest {
	public static void main(String[] args) {

		PgEntity entity = new PgEntity(2, "pgkrishna", 4000.00);

		PgService impl = new PgServiceImpl();

//		impl.validateAndSave(entity);
//		PgEntity validateAngGetById = impl.validateAngGetById(1);
//		System.out.println(validateAngGetById);
		impl.validateAndUpdateById(1,"chidu",2500.00);
		impl.validateAndDeleteById(2);

	}

}
