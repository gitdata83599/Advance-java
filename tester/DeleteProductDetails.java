package com.sunbeam.tester;
import static com.sunbeam.utils.HibernateUtils.getFactory;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;

public class DeleteProductDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); 
				Scanner sc = new Scanner(System.in)) {
			// create dao instance
			ProductDao dao = new ProductDaoImpl();
			System.out.println("Enter product id for deleting the use details");
			System.out.println(dao.deleteUserDetails(sc.nextLong()));
	}

	}
}
