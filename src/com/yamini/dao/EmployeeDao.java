package com.yamini.dao;

import java.sql.SQLException;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.type.IntegerType;

import com.yamini.bean.Employee;

public class EmployeeDao {
	
	private Configuration cfg;
	private SessionFactory factory;
	private Session session;

	public EmployeeDao() {
		cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();

	}
	
	
	Employee employee=null;
	
	public Employee insertEmployee(Employee emplopyee) throws SQLException {
		session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createSQLQuery("SELECT MAX(EID) as value FROM EmployeeTable").addScalar("value",
					new IntegerType());
			int maxEmployeeId = (int) query.uniqueResult();
			System.out.println("empID="+maxEmployeeId);
			emplopyee.setId(maxEmployeeId+1);
			System.out.println(emplopyee);
			session.save(emplopyee);
			tx.commit();
			return emplopyee;

		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();
		}
		return null;
	}
	
	public boolean DeleteEmployee(int id)
	{
		session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
//			Query query=session.createQuery("delete from employee where id=?");
//			query.setInteger(0,id);
//			
		employee = (Employee) session.get(Employee.class, id);
		session.delete(employee);
		tx.commit();
		return true;
			}
		catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();
		}
		return false;
	
		}
	public Employee SearchEmployee(int id)
	{
		session = factory.openSession();
		Transaction tx=null;
		try
		{
			tx=session.beginTransaction();
			employee = (Employee) session.get(Employee.class, id);
			tx.commit();
			
		}
		catch (Exception ex) {
			tx.rollback();
		}
		finally
		{
			session.close();
		}	
		return employee;
		
	}
}
