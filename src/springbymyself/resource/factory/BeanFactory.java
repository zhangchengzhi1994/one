package springbymyself.resource.factory;

import springbymyself.resource.BeanDefinition;

public interface BeanFactory {

    Object getBean(String name);

    void registerBean(String name, BeanDefinition beanDefinition);
}
