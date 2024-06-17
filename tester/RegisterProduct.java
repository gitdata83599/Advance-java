package com.sunbeam.tester;

import com.sunbeam.entities.Category;
import java.util.Scanner;
import static com.sunbeam.utils.HibernateUtils.getFactory;
import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;
import com.sunbeam.entities.Product;
public class RegisterProduct {
	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();
				Scanner sc=new Scanner(System.in)
				) {
			//create dao instance
			ProductDao dao=new ProductDaoImpl();
			System.out.println("Enter Product details -Long id, Category category, \r\n"
					+ "			String pName, double price, Long qty\r\n"
					);
			Product newProduct=new Product(Category.valueOf(sc.next().toUpperCase()), sc.next(), sc.nextDouble(), sc.nextLong());
//					Product(Category.valueOf(sc.next().toUpperCase()),sc.next(),sc.nextDouble(),sc.nextLong());

			System.out.println(dao.signUp(newProduct));
		} //JVM : sc.close() , sf.close() -> DBCP will be cleaned up !
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/*
 * Refer - products table - id , category (BAKERY|SHOES|CLOTHES|STATIONAY) ,
 * product name(unique)  ,
 *  price , available quantity
 */