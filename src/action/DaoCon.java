package action;
import java.sql.*;
/**
 * 建立数据库连接返回connection
 * @author Administrator
 *
 */
public class DaoCon {
	public Connection GetConn() throws Exception{
		//数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_ddliu1993";
		String user = "02z0x333nn";
		String password = "wllikjmiz2m41k5xxy4hjk05lj4klyij1wyzz411";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
