package com.ly.demo.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T, PK extends Serializable> {
	
	public void save(T entity);
	
	public void delete(T entity);
	
	public void deleteById(PK id);
	
	public boolean update(T entity);
	
	public boolean upodateById(PK id);
	
	public T get();
		
	public T getById();
	
	public List<T> getAll();
	
	/*
	 * ¿¡º”‘ÿ
	 */
	public T load();
	
	public T loadById(PK id);

}
