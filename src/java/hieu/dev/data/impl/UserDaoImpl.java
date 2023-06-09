package hieu.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hieu.dev.data.dao.UserDao;
import hieu.dev.data.driver.MySQLDriver;
import hieu.dev.data.model.User;

public class UserDaoImpl implements UserDao {
	private Connection conn;
	
	public UserDaoImpl() {
		conn = MySQLDriver.getInstance().getConnection();
	}
	
	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO USERS(ID, EMAIL, PASSWORD, ROLE) VALUES(NULL, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getEmail());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getRole());
			
			return stmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int userId) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM USERS WHERE ID=?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, userId);
			
			return stmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User find(int userId) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM USERS LIMT 1";
        try {
        	PreparedStatement stmt = conn.prepareStatement(sql);
    		ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String role = rs.getString("role");
                
                return new User(id, email, password, role);
            }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<>();
		String sql = "SELECT * FROM USERS";
        try {
        	PreparedStatement stmt = conn.prepareStatement(sql);
    		ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String role = rs.getString("role");
                
                userList.add(new User(id, email, password, role));
            }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return userList;
	}

}
