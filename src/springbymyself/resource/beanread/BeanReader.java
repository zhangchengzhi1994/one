package springbymyself.resource.beanread;

import springbymyself.resource.re.Resource;

import javax.xml.parsers.ParserConfigurationException;

public interface BeanReader {

    void loadBean(Resource resource) throws Exception;
}
