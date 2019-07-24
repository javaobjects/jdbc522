package 需求实现;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
* <p>Title: Test1</p>  
* <p>
*	Description: 
*	根据id查询某个员工的工资
* </p> 
* @author xianxian 
* @date 2019年7月23日
 */
public class Test1 {

	public static void main(String[] args) {

		/**
		 * 套路：
		 * 1. 创建连接对象
		 * 2. 创建执行sql语句的命令对象
		 * 3. 执行sql语句
		 * 4. 如果是查询获取结果集，如果是更新获取影响的行数
		 * 5. 如果是查询，需要从结果集获取数据
		 * 6. 关闭所有资源
		 */
		//1.创建连接对象
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","scott123");
			//2. 创建执行sql语句的命令对象
			stmt = conn.createStatement();
			//3. 执行sql语句
			String query_sal_by_empno = "select sal from emp where empno = " + 7369;
			//4. 执行sql语句、如果是查询获取结果集
			ResultSet rs = stmt.executeQuery(query_sal_by_empno);
			//5. 如果是查询，需要从结果集获取数据
			if(rs.next()) {
				Double sal = rs.getDouble("sal");
				System.out.println(sal);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}
