package com.xworkz.pg.entity.service;

import com.xworkz.pg.entity.PgEntity;

public interface PgService {

	Boolean validateAndSave(PgEntity entity);

	default PgEntity validateAngGetById(Integer id) {

		return null;
	}
	default void validateAndUpdateById(Integer id,String name,Double rent) {
		
		
		
	}
	default void validateAndDeleteById(Integer id) {
		
		
	}

}
