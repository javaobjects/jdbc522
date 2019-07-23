package jdbc522;

public class TestConnection {

	public static void main(String[] args) {


		try {
			//第一步：加载驱动类
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
