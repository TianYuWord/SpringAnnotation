package Utils;

import java.lang.reflect.Field;

import Anno.Anno;

public class ParseObjectToSql {
	
	private static ParseObjectToSql instance = null;
	
	public static String get(Object obj) {
		String sql = "SELECT ";
		Class clazz = obj.getClass();
		Field[] ls = clazz.getDeclaredFields();
		for(Field f:ls) {
			System.out.println(f.getName());
			sql += f.getName();
		}
		if(clazz.isAnnotationPresent(Anno.class)) {
			Anno annno = (Anno) clazz.getAnnotation(Anno.class);
			sql += " FROM " + annno.value();
		}
		return sql;
	}
	
	public static ParseObjectToSql getInstance() {
		if(instance == null) {
			instance = new ParseObjectToSql();
		}
		return new ParseObjectToSql();
	}
}
