package cn.toanyu20.demo02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 配置类 就等于之前的配置文件
 * @author 天宇科技
 *
 */
@Configuration //告诉Spring是一个配置类
@ComponentScan("cn.toanyu20.demo01") //配置扫描范围
@ImportResource("classpath:xxx.xml") //同时加载配置文件
//@ImportResource指定要扫描的包
public class Config {
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
