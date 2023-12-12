package webserviceclient;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
public class JkxxVo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;         //id
    private String pid;        //关联码
    private String swjgDm;     //税务机关代码
    private String dzsphm;     //电子税票号码
    private String yjse;       //应缴金额
    private String jkqx;       //缴款期限
    private ArrayList<SzxxVo> szxxGridlb;//税票信息
}
