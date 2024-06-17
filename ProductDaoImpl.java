package com.sunbeam.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;
import static com.sunbeam.utils.HibernateUtils.getFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class ProductDaoImpl implements ProductDao {

	@Override
	public String signUp(Product product) {
String mesg="product registration failed!!!";
		
		// 1.get session from sessionFactory
		Session session=getFactory().getCurrentSession();
		
		//2.Begin a transaction
		
		Transaction tx =session.beginTransaction();
		try {
			
			Serializable productId = session.save(product);
			tx.commit();
			mesg="product registered successfully, with ID"+productId;
			}
		catch(RuntimeException e) {
			//rollback tx
			if(tx!= null)
				tx.rollback();
			throw e;
		}

		return mesg;

	}

	@Override
	public Product getProductDetailsbyId(Long productId) {
     Product product=null;
		
		//1.get session from session factory
		Session session=getFactory().getCurrentSession();
		
		//Begin tx
		
		Transaction tx=session.beginTransaction();
		
		try {
			product=session.get(Product.class, productId);
			product=session.get(Product.class, productId);
			product=session.get(Product.class, productId);
			product=session.get(Product.class, productId);
			tx.commit();
		}catch (RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		String jpql = "select p from Product p";
		List<Product> products = null;
		
		//get session from sessionFactory
		Session session = getFactory().getCurrentSession();
		
		//tx begin
		Transaction tx = session.beginTransaction();
		
		try {
			products = session.createQuery(jpql , Product.class).getResultList();
			tx.commit();
		}catch(RuntimeException e) {
			if(tx!= null)
				tx.rollback();
			throw e;
		}
				return products;
	}

	@Override
	public String applyDiscount(Category category, double discount) {
		String messege = "Applying product  discount for" + category + "failed";
		Session session = getFactory().getCurrentSession();
		String jpql = "update Product p set p.price=p.price - :discount where p.category =:categ";
		Transaction tx = session.beginTransaction();
		try {
			int rows = session.createQuery(jpql).setParameter("discount", discount).setParameter("categ", category)
					.executeUpdate();
			tx.commit();
			messege = "Discount Applied for" + category + "success";
		} catch (RuntimeException e) {

			if (tx != null)
				tx.rollback();

			throw e;
		}
		return messege;
	}	}


