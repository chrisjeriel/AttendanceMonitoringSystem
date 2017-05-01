package com.bpi.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bpi.dao.GenericDAO;
import com.bpi.utils.HibernateUtils;

public class GenericDAOImpl<T> implements GenericDAO<T>{
	Class<T> clazz;
	
	public GenericDAOImpl(Class<T> clazz) {
		this.clazz = clazz;
	}
	public List<T> getAllRecords() {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = null;
		List<T> tableList = null;
		try {
			transaction = session.beginTransaction();
			tableList = session.createQuery("from " + clazz.getName()).list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return tableList;
	}
	
	public List<T> getAllRecordsUsingQuery(String query) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = null;
		List<T> tableList = null;
		try {
			transaction = session.beginTransaction();
			tableList = session.createQuery(query).list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return tableList;
	}

	public void saveRecord(T entityToBeSaved) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(entityToBeSaved);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteRecord(int gUserId) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			T entity = session.get(clazz, gUserId);
			session.delete(entity);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateRecord(T entityToBeUpdated) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(entityToBeUpdated);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public T getRecord(int gUserId) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = null;
		T entity = null;
		try {
			transaction = session.beginTransaction();
			entity = session.get(clazz, gUserId);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return entity;
	}
}
