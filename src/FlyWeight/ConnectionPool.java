package FlyWeight;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {
	
	private Vector<Connection> pool;
	
	/*公有属性*/
	private String url="jdbc:mysql://localhost:3306/test";
	
	private String userName="root";
	
	private String password="root";
	
	private String driverClassName="com.mysql.jdbc.Driver";
	
	private int poolSize=100;
	
	private static ConnectionPool instance=null;
	
	/*构造方法，做一些初始化方法*/
	
	private ConnectionPool(){
		pool=new Vector<Connection>();
		
		for(int i=0;i<poolSize;i++){
			
			
				try {
					Class.forName(driverClassName);
					conn = DriverManager.getConnection(url, userName, password);
					pool.add(conn);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					// TODO: handle exception
				}catch(SQLException e){
					e.printStackTrace();
				}
		}
	}
	
	
	/* 返回连接到连接池*/
	public Synchronized void release(){
		pool.add(conn);
	}
	
	
	
	/*返回连接池的一个线性连接*/
	public Synchronized Connection getConnection(){
		if(pool.size()>0){
			Connection conn=pool.get(0);
			pool.remove(conn);
			return conn;
		}else{
			return null;
		}
	}
	
	
}
