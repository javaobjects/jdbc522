package 封装dao;

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
		return rows;
	}

//	7.批量删除
	public boolean deleteEmp(Integer[] empnos) {
		boolean result = false;
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
