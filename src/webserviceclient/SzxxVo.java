package webserviceclient;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@XmlRootElement(name = "szxxGrid")
public class SzxxVo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;            //id
    private String pid;           //关联码
    private String spuuid;        //税票UUID
    private String zsuuid;        //征收UUID
    private String dzsphm;        //电子税票号码
    private String dzspmxxh;      //电子税票明细号码
    private String gldzspmxxh;    //关联电子税票明细序号
    private String pzzlDm;        //票证种类代码
    private String pzzgDm;        //票证字轨代码
    private String pzhm;          //票证号码
    private String hzjksbz;       //汇总缴款书标志
    private String djxh;          //登记序号
    private String skssqq;        //税款所属期起
    private String skssqz;        //税款所属期止
    private String zsxmDm;        //征收项目代码
    private String zspmDm;        //征收品目代码
    private String zszmDm;        //征收子目代码
    private String djzclxDm;      //登记注册类型代码
    private String hyDm;          //行业代码
    private String sbfsDm;        //申报方式代码
    private String zsfsDm;        //征收方式代码
    private String czlxDm;        //操作类型代码
    private String skzlDm;        //税款种类代码
    private String sksxDm;        //税款属性代码
    private String zsdlfsDm;      //征收代理方式代码
    private String kssl;          //课税数量
    private String jsyj;          //计税依据
    private String yjse;          //已缴税额
    private String sl1;           //税率
    private String sjje;          //实缴金额
    private String kjrq;          //开具日期
    private String skjnfsDm;      //税款缴纳方式代码
    private String yskmDm;        //预算科目代码
    private String ysfpblDm;      //预算分配比例代码
    private String skgkDm;        //收款国库代码
    private String ckzhzhuuid;    //存款账户账号UUID
    private String yhhbDm;        //银行行别代码
    private String yhyywdDm;      //银行营业网点代码
    private String yhzh;          //银行账号
    private String jdxzDm;        //街道乡镇代码
    private String tzlxDm;        //调账类型代码
    private String jkqx;          //缴款期限
    private String yjkqx;         //原缴款期限
    private String sjrq1;         //上解日期
    private String sjxhrq;        //上解销号日期
    private String sjxhrDm;       //上解销号人代码
    private String sjjzrq1;       //上解记账日期
    private String rkrq;          //入库日期
    private String rkxhrq;        //入库销号日期
    private String rkxhrDm;       //入库销号人代码
    private String rkjzrq;        //入库记账日期
    private String ssglyDm;       //税收管理员代码
    private String zgswskfjDm;    //主管税务所（科、分局）代码
    private String skssswjgDm;    //税款所属税务机构代码
    private String zsswjgDm;      //征收税务机关代码
    private String kjdjxh;        //扣缴登记序号
    private String sybh1;         //税源编号
}
