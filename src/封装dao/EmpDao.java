package 封装dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

/**
 * 
* <p>Title: EmpDao</p>  
* <p>
*	Description: 
*	对emp表进行增删改查的数据访问对象
* </p> 
* @author xianxian 
* @date 2019年7月24日
 */
public class EmpDao {
//	1.根据id查询某个员工信息
	public Emp queryEmpByEmpno(Integer empno) {
		Emp emp = null;
		return emp;
	}
//	2.根据id查询某个员工的工资  √
	public Double querySalByEmpno(Integer empno) {
		Double sal = null;
		return sal;
	}

	
//	3.查询所有员工的总工资 √
	public Double querySumSal() {
		Double sal = null;
		return sal;
	}

	
//	4.根据所有员工信息
	public List<Emp> queryAllEmp(){
		List<Emp> list = null;
		return list;
	}

//	5.查询工资前五名的员工信息
	/**
	 * 查询工资前五名的员工信息
	 * select * from emp e where(select count(1) from emp where sal > e.sal) <= 4;
	 */
	public List<Emp> queryEmpLimitFive(){
		List<Emp> list = null;
		return list;
	}

//	6.根据id删除某个员工
	public int deleteEmpByEmpno(Integer empno) {
		int rows = 0;
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			String delete_emp_by_empno = "delete from emp where empno = " + empno;
			rows = stmt.executeUpdate(delete_emp_by_empno);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.release(conn, stmt, null);
		}
		return rows;
	}

	public boolean deleteEmp_ok(Integer[] empnos) {
		boolean tmp = false;
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			//设置事务提交为手动
			conn.setAutoCommit(false);
			
			stmt = conn.prepareStatement("delete from emp where empno = ?");
			int rows = 0;
			for (int i = 0; i < empnos.length; i++) {
				stmt.setInt(1,empnos[i]);
				rows += stmt.executeUpdate();
				/*if(rows==1)
				{
					int a=10/0;
				}*/
			}
			if(rows == empnos.length) {
				tmp = true;
				//如果删除影响的行数等于数组长度，表示每个删除都有执行，所以事务是成功的，所以事务提交
				conn.commit();
			}else {
				conn.rollback();
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			try {
				//如果代码抛出异常，有的删除执行有的没有执行，那么事务回滚
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			DBUtil.release(conn, stmt, null);
		}
		return tmp;
	}
	// 7.批量删除(executeBatch方法是提交批处理的命令，
	//返回一个整形数组int[]，数组中的每个数字对应一条命令的影响行数，
	//在Oracle的驱动中没有实现该功能，即提交成功后不能返回影响行数，所以返回-2
	public boolean deleteEmp(Integer[] empnos) {
		boolean result = false;
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		String sql = "delete from emp where empno = ?";
//		try {
//			conn = DBUtil.getConnection();
//			stmt = conn.prepareStatement(sql);
//			
//			for (Integer id:empnos) {
//				stmt.setInt(1, id);//给sql语句中的问号（占位符）赋值，1表示索引，id是值
//				stmt.addBatch();//批处理的意思，因为sql语句要执行多次，那么一次执行完
//			}
//			
//			int[] a = stmt.executeBatch();
//			System.out.println(Arrays.toString(a));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return result;
	}

//	8.更新某个员工的信息
	public int updateEmp(Emp emp) {
		int rows = 0;
		return rows;
	}

//	9.添加一个员工信息
	public int addEmp(Emp emp) {
		int rows = 0;
		return rows;
	}
}
