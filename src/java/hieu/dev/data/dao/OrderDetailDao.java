package hieu.dev.data.dao;

import java.util.List;

import hieu.dev.data.model.Order;
import hieu.dev.data.model.OrderDetail;

public interface OrderDetailDao {
	public boolean insert(OrderDetailDao orderDetail);
	public boolean update(OrderDetailDao orderOderDetail);
	public boolean delete(int id);
	public OrderDetailDao find(int id);
	public List<OrderDetail> findAll();
}
