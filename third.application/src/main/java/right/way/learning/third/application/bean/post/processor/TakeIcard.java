package right.way.learning.third.application.bean.post.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TakeIcard implements BeanPostProcessor{

	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	  System.out.println("postProcessBeforeInitialization = "+beanName +">>>>"+bean.getClass().getName());
	  return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization = "+beanName +">>>>"+bean.getClass().getName());
		System.out.println("------------------------------------------");
		return bean;
	}
}
