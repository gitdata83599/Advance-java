package com.sunbeam.tester;

import org.hibernate.SessionFactory;
import org.hibernate.internal.build.AllowSysOut;

import static com.sunbeam.utils.HibernateUtils.getFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;

public class DisplayProduct {

	public static void main(String[] args) {
		try(SessionFactory sf = getFactory()){
			ProductDao dao = new ProductDaoImpl();
			dao.getAllProducts()
			.forEach(System.out::println);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
