package com.sopa.dao;

import java.util.List;

public interface DAO<T>{
	
	T get(int id) throws Exception;

    List<T> getAll() throws Exception;

    void save(T t) throws Exception;

    void update(T t) throws Exception;

    void delete(T t) throws Exception;

}
