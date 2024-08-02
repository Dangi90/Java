package shop.db;

public class SQL {

	public static final String INSERT_CUSTOMER="insert into `customer` set "
														+" `custId`=?, "
														+" `name`=?, "
														+" `hp`=?, "
														+" `addr`=?, "
														+" `rdate`= NOW() ";

	public static final String SELECT_CUSTOMER="select * from `customer` where `custId`=?";
	public static final String SELECT_CUSTOMERS="select * from `customer`";
	public static final String UPDATE_CUSTOMER="update `customer` set "
												+" `name`=?, "
												+"`hp`=?, "
												+"`addr`=? "
												+"`rdate`=? "
												+"where `custId`=? ";
												
	public static final String DELETE_CUSTOMER= "delete from `customer` where `custId`=?";;
	
	public static final String SELECT_PRODUCT = "select * from `product`";
	
	public static final String INSERT_ORDER = "insert into `order` set "
											+" `orderNo`=?, "
											+" `orderId`=?, "
											+" `orderProduct`=?, "
											+" `orderCount`=?, "
											+" `orderDate`= NOW() ";
		
	public static final String SELECT_ORDERS= "select * from `orders`";
	
	public static final String SELECT_ORDERS_BY_ORDERID = "select * from `orders` where `orderid`=?";
	
	
}
