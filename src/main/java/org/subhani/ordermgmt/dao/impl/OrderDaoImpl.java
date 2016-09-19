package org.subhani.ordermgmt.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.subhani.ordermgmt.dao.OrderDao;
import org.subhani.ordermgmt.domain.data.Order;

@Repository
public class OrderDaoImpl implements OrderDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Order> getOrders() {
		Query query = entityManager.createQuery("SELECT a FROM Order a");
		return query.getResultList();
	}

	
}
