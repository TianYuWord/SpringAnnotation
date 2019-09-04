package cn.toanyu20.demo02;

import java.security.Provider.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

/**
 * 配置类 就等于之前的配置文件
 * @author 天宇科技
 *
 */
@Configuration //告诉Spring是一个配置类
//@ImportResource指定要扫描的包
/*
 * excludeFilters : 排除
 * 
 */
@ComponentScan(value = "cn.toanyu20.demo02",excludeFilters = {
		//排除
		/*
		 * type : 按照什么来注解 【ANNOTATION】按照标记了注解的进行排除
		 * classes : 注解的类型
		 * 
		 */
		@Filter(type=FilterType.ANNOTATION,classes = Controller.class)
},includeFilters = {
		//只包含
		@Filter(type=FilterType.ANNOTATION,classes = Service.class)
//useDefaultFilters 配合	 includeFilters使用
},useDefaultFilters = false)

//Java1.8前之前
@ComponentScans(value = {
		@ComponentScan(value = "cn.toanyu20.demo02",excludeFilters = {
				//排除
				/*
				 * type : 按照什么来注解 【ANNOTATION】按照标记了注解的进行排除
				 * classes : 注解的类型
				 * 
				 */
		@Filter(type=FilterType.ANNOTATION,classes = Controller.class)
		},includeFilters = {
				//只包含
		@Filter(type=FilterType.ANNOTATION,classes = Service.class)
		//useDefaultFilters 配合	 includeFilters使用
		},useDefaultFilters = false)
})

//@ComponentScan 指定要扫描的到
public class Config2 {
	/**
	 * Bean 的
	 * Type 返回值类型
	 * id 方法名
	 * @return
	 */
	@Bean
	public Person person() {
		return new Person();
	}
}
