package ph.com.bpi.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ph.com.bpi.dao.BaseDAO;
import ph.com.bpi.model.TModelBase;

public class BaseDAOImpl<T> implements BaseDAO<T>{

	private SessionFactory sessionFactory;

	private Class<T> clazz;

	private Logger logger = Logger.getLogger(BaseDAOImpl.class.getName());

	public BaseDAOImpl(){
		// TODO Auto-generated constructor stub
	}

	public BaseDAOImpl(SessionFactory mSessionFactory, Class<T> mClazz){
		// TODO Auto-generated constructor stub
		this.clazz = mClazz;
		this.sessionFactory = mSessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAllRecords(){
		// TODO Auto-generated method stub
		List<T> records = null;

		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try{
			transaction = session.beginTransaction();
			records = session.createQuery("from " + this.clazz.getName()).list();
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
			logger.info(String.format("[%s]: Error getting all records!", this.clazz.getName()));
			e.printStackTrace();
		}finally{
			session.close();
		}

		return records;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAllRecords(String query){
		// TODO Auto-generated method stub
		List<T> records = null;

		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try{
			transaction = session.beginTransaction();
			records = session.createQuery(query).list();
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
			logger.info(String.format("[%s]: Error getting all records using query! Query: %s", this.clazz.getName(),
					query));
			e.printStackTrace();
		}finally{
			session.close();
		}

		return records;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getRecord(int id){
		// TODO Auto-generated method stub
		T entity = null;

		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try{
			transaction = session.beginTransaction();
			entity = (T) session.get(this.clazz, id);
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
			logger.info(String.format("[%s]: Error getting record!", this.clazz.getName()));
			e.printStackTrace();
		}finally{
			session.close();
		}

		return entity;
	}

	@Override
	public void saveRecord(T entity){
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try{
			transaction = session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
			logger.info(String.format("[%s]: Error saving record!", this.clazz.getName()));
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void updateRecord(T entity){
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try{
			transaction = session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
			logger.info(String.format("[%s]: Error updating record!", this.clazz.getName()));
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void deleteRecord(int id){
		// TODO Auto-generated method stub
		T entity = null;

		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try{
			transaction = session.beginTransaction();
			entity = (T) session.get(this.clazz, id);
			session.delete(entity);
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
			logger.info(String.format("[%s]: Error deleting record!", this.clazz.getName()));
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteAllRecords(){
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try{
			transaction = session.beginTransaction();
			session.createQuery("DELETE FROM " + this.clazz.getName()).executeUpdate();
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
			logger.info(String.format("[%s]: Error deleting all records!", this.clazz.getName()));
			e.printStackTrace();
		}finally{
			session.close();
		}

	}

}
