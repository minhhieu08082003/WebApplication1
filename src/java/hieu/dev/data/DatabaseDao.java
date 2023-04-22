package hieu.dev.data;

import hieu.dev.data.dao.CategoryDao;
import hieu.dev.data.dao.OrderDao;
import hieu.dev.data.dao.OrderDetailDao;
import hieu.dev.data.dao.ProductDao;
import hieu.dev.data.dao.UserDao;

public abstract class DatabaseDao {
	private static DatabaseDao _instance;
	
	public static void init(DatabaseDao instance) {
		_instance = instance;
	}
	
	public static DatabaseDao getInstance() {
		return _instance;
	}
	public abstract UserDao getUserDao();
	public abstract CategoryDao getCategoryDao();
	public abstract ProductDao getProductDao();
	public abstract OrderDao getOrderDao();
	public abstract OrderDetailDao getOrderDetailDao();
}
