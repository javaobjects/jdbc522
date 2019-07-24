package 封装dao;

public class TestEmpDao {

	public static void main(String[] args) {

		//测试删除方法
//		EmpDao dao = new EmpDao(); 
//		int rows = dao.deleteEmpByEmpno(8888);
//		System.out.println(rows);
		//测试批处理删除方法
		EmpDao dao = new EmpDao();
		Integer[] empnos = {7,8};
		dao.deleteEmp(empnos);
	}
}
