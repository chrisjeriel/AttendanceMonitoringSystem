package com.bpi.dao;

import java.util.List;

public interface GenericDAO<T> {
	List<T> getAllRecords();
	List<T> getAllRecordsUsingQuery(String query);
	void saveRecord(T entityToBeSaved);
	void deleteRecord(int id);
	void updateRecord(T entityToBeUpdated);
	T getRecord(int id);
	
}
