package com.xworkz.pg.entity.service.impl;

import com.xworkz.pg.entity.PgEntity;
import com.xworkz.pg.entity.dao.PgDAO;
import com.xworkz.pg.entity.dao.impl.PgDAOImpl;
import com.xworkz.pg.entity.service.PgService;

public class PgServiceImpl implements PgService {

	private PgDAO dao = new PgDAOImpl();

	public Boolean validateAndSave(PgEntity entity) {
		if (entity.getName().length() < 20 && entity.getRent() <5000) {

			return dao.save(entity);

		} else {
			System.out.println(" you  entering name is not valid and your trent is too high");
			return false;

		}
	}
	@Override
	public PgEntity validateAngGetById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	@Override
	public void validateAndUpdateById(Integer id,String name,Double rent) {
		// TODO Auto-generated method stub
	dao.updateById(id, name , rent);
	}
	@Override
	public void validateAndDeleteById(Integer id) {
       dao.deleteById(id);
	}

}
