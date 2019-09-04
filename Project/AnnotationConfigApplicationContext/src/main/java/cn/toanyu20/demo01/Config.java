package cn.toanyu20.demo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * ������ �͵���֮ǰ�������ļ�
 * @author ����Ƽ�
 *
 */
@Configuration //����Spring��һ��������
@ComponentScan("cn.toanyu20.demo01") //����ɨ�跶Χ
@ImportResource("classpath:xxx.xml") //ͬʱ���������ļ�
public class Config {
	/**
	 * Bean ��
	 * Type ����ֵ����
	 * id ������
	 * @return
	 */
	@Bean
	public Person person() {
		return new Person();
	}
}
