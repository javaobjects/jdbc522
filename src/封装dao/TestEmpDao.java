package 封装dao;

import java.util.List;

public class TestEmpDao {

	public static void main(String[] args) {

		//测试删除方法
//		EmpDao dao = new EmpDao(); 
//		int rows = dao.deleteEmpByEmpno(8888);
//		System.out.println(rows);
		//测试批处理删除方法
//		EmpDao dao = new EmpDao();
//		Integer[] empnos = {7,8};
//		dao.deleteEmp(empnos);
		/**
		 * 测试批量删除
		 */
//		EmpDao dao = new EmpDao();
//		Integer[] empnos = {7566,7698};
//		boolean tmp = dao.deleteEmp_ok(empnos);
//		System.out.println(tmp);
		
		EmpDao dao = new EmpDao();
		
//		Emp emp = dao.queryEmpByEmpno(7566);
//		System.out.println(emp);
		
//		List<Emp> emps = dao.queryAllEmp();
//		List<Emp> emps=dao.queryEmpLimitFive();
//		System.out.println(emps.toString());
	}
}
