package com.xworkz.tubelight.repo;

import java.util.List;

import com.xworkz.tubelight.dto.TubelightDTO;

public interface TubelightRepo {

	public boolean create(TubelightDTO dto);

	public List<TubelightDTO> readAll();

	public TubelightDTO findByName(String name);

}
