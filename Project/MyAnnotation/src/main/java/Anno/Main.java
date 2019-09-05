package Anno;

import Utils.ParseObjectToSql;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setAge(18);
		e.setId(1);
		e.setName("tianyu");
		String sql = ParseObjectToSql.getInstance().get(e);
		System.out.println(sql);
	}
}
