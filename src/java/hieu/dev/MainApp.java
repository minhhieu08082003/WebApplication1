package hieu.dev;

import hieu.dev.data.Database;
import hieu.dev.data.DatabaseDao;
import hieu.dev.data.dao.CategoryDao;
import hieu.dev.data.dao.OrderDao;
import hieu.dev.data.dao.ProductDao;
import hieu.dev.data.dao.UserDao;
import hieu.dev.data.model.Category;
import hieu.dev.data.model.Order;
import hieu.dev.data.model.Product;
import hieu.dev.data.model.User;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseDao.init(new Database());
		
		//User
		UserDao userDao = DatabaseDao.getInstance().getUserDao();
		User us =  new User("A","","");
		userDao.insert(us);
//		userDao.delete(2);
                CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
		Category cate = new Category("Iphone", "c4.jpg");
                categoryDao.insert(cate);
		categoryDao.delete(2);
	}
} 
