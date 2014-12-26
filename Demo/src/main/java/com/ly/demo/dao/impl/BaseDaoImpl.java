package com.ly.demo.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import com.ly.demo.dao.BaseDao;

public class BaseDaoImpl<T, PK extends Serializable> implements BaseDao<T, PK> {

	private Class<T> entity;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type type = this.getClass().getGenericSuperclass();
		if(type instanceof ParameterizedType){
			entity = (Class<T>)(((ParameterizedType)type).getActualTypeArguments()[0]);
		}
	}

	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(PK id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean update(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upodateById(PK id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T load() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T loadById(PK id) {
		// TODO Auto-generated method stub
		return null;
	}

}
