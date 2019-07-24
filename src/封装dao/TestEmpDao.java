package 封装dao;

public class TestEmpDao {

	public static void main(String[] args) {

		//测试删除方法
		EmpDao dao = new EmpDao(); 
		int rows = dao.deleteEmpByEmpno(8888);
		System.out.println(rows);
	}

}
