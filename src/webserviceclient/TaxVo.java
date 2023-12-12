package webserviceclient;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

@Data
@XmlRootElement(name = "Csbdc001Response")
public class TaxVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String code;       //返回代码
    private String msg;        //返回消息
    private ArrayList<JkxxVo> jkxxGridlb;//缴款信息

}
