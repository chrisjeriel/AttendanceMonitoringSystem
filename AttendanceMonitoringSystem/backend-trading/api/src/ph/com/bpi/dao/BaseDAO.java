package ph.com.bpi.dao;

import java.util.List;

public interface BaseDAO<T>{

	List<T> getAllRecords();

	List<T> getAllRecords(String query);

	T getRecord(int id);

	void saveRecord(T entity);

	void updateRecord(T entity);

	void deleteRecord(int id);

	void deleteAllRecords();
}
