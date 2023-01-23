package com.xworkz.pg.entity.dao;

import com.xworkz.pg.entity.PgEntity;

public interface PgDAO {
	Boolean save(PgEntity entity);
default	PgEntity getById(Integer id) {
	
	
	return null;
}
default void updateById(Integer id,String name,Double rent) {
	
	
	
}
default void deleteById(Integer id) {
	
	
}

}
