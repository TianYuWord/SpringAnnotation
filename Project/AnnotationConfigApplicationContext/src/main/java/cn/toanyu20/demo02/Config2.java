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
 * ������ �͵���֮ǰ�������ļ�
 * @author ����Ƽ�
 *
 */
@Configuration //����Spring��һ��������
//@ImportResourceָ��Ҫɨ��İ�
/*
 * excludeFilters : �ų�
 * 
 */
@ComponentScan(value = "cn.toanyu20.demo02",excludeFilters = {
		//�ų�
		/*
		 * type : ����ʲô��ע�� ��ANNOTATION�����ձ����ע��Ľ����ų�
		 * classes : ע�������
		 * 
		 */
		@Filter(type=FilterType.ANNOTATION,classes = Controller.class)
},includeFilters = {
		//ֻ����
		@Filter(type=FilterType.ANNOTATION,classes = Service.class)
//useDefaultFilters ���	 includeFiltersʹ��
},useDefaultFilters = false)

//Java1.8ǰ֮ǰ
@ComponentScans(value = {
		@ComponentScan(value = "cn.toanyu20.demo02",excludeFilters = {
				//�ų�
				/*
				 * type : ����ʲô��ע�� ��ANNOTATION�����ձ����ע��Ľ����ų�
				 * classes : ע�������
				 * 
				 */
		@Filter(type=FilterType.ANNOTATION,classes = Controller.class)
		},includeFilters = {
				//ֻ����
		@Filter(type=FilterType.ANNOTATION,classes = Service.class)
		//useDefaultFilters ���	 includeFiltersʹ��
		},useDefaultFilters = false)
})

//@ComponentScan ָ��Ҫɨ��ĵ�
public class Config2 {
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
