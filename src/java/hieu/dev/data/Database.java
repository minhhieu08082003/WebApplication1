package hieu.dev.data;

import hieu.dev.data.dao.CategoryDao;
import hieu.dev.data.dao.OrderDao;
import hieu.dev.data.dao.OrderDetailDao;
import hieu.dev.data.dao.ProductDao;
import hieu.dev.data.dao.UserDao;
import hieu.dev.data.impl.CategoryDaoImpl;
import hieu.dev.data.impl.OrderDaoImpl;
import hieu.dev.data.impl.OrderDetailDaoImpl;
import hieu.dev.data.impl.ProductDaoImpl;
import hieu.dev.data.impl.UserDaoImpl;

public class Database extends DatabaseDao {

	
	public UserDao getUserDao() {
		// TODO Auto-generated method stub
		return new UserDaoImpl();
	}

	
	public CategoryDao getCategoryDao() {
		// TODO Auto-generated method stub
		return new CategoryDaoImpl();
	}

	
	public ProductDao getProductDao() {
		// TODO Auto-generated method stub
		return new ProductDaoImpl();
	}

	
	public OrderDao getOrderDao() {
		// TODO Auto-generated method stub
		return new OrderDaoImpl();
	}

	
	public OrderDetailDao getOrderDetailDao() {
		// TODO Auto-generated method stub
		return new OrderDetailDaoImpl();
	}

}
