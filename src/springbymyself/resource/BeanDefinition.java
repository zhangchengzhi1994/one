package springbymyself.resource;

import java.util.HashMap;
import java.util.Map;

public class BeanDefinition {

    private Class beanClass;

    private String className;

    private Map<String, Object> propertyMap = new HashMap<>();

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
        try {
            this.beanClass = Class.forName(className);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, Object> getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(String name, Object value) {
        propertyMap.put(name, value);
    }
}
