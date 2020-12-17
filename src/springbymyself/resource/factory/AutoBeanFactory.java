package springbymyself.resource.factory;

import springbymyself.resource.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

public class AutoBeanFactory implements BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();


    @Override
    public Object getBean(String name) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        Class beanClass = beanDefinition.getBeanClass();

        if (null != beanDefinition) {

        }


        return null;
    }

    @Override
    public void registerBean(String name, BeanDefinition beanDefinition) {

    }
}
