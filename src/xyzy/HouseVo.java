package xyzy;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class HouseVo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // 属性
    private String id;
    private String sqlxdm;//申请类型代码
    private String msfmc;//买受方名称
    private String msflx;//买受方类型
    private String msfgj;//买受方国籍
    private String msfxb;//买受方性别
    private String msflxdz;//买受方联系地址
    private String msfsfzhmsbm;//买受方证件号码
    private String msfzjlxdm;//买受方证件类型
    private String msfdh;//买受方电话
    private String kfqymc;//开发企业名称
    private String kfqysbm;//开发企业纳税人识别码
    private String kfslxdh;//开发商联系电话
    private String xzqu;//行政区划
    private String xzjd;//街道乡镇
    private String yszbh;//预售许可证字号
    private String fwbh;//房屋编号
    private String fwzlwz;//房屋坐落位置
    private String ghyt;//规划用途
    private String fwdh;//幢号
    private String fwdyh;//单元号
    private String fwfjh;//房间号
    private String fwlc;//楼层
    private String fwjg;//结构
    private String jyfs;//交易方式
    private String htbh;//合同编号
    private String htqdsj;//合同签订时间
    private String htje;//合同金额
    private String jzmj;//建筑面积
    private String tnmj;//套内面积
    private String ypmjg;//单价
    private String jyjg;//交易价格
    private String sfwyzf;//是否唯一住房
    private String cdsj;//查档时间
    private String szfe;//所占份额
    private String qssl;//契税税率
    private String qsse;//契税税额
    private String yhssl;//印花税税率
    private String yhsse;//印花税税额
    private String qsjmxzdm;//契税减免性质代码
    private String qsjmse;//契税减免税额
    private String yhsjmse;//印花税减免税额
    private String qsyhsl;//契税优惠税率
    private String jsyj;//计税依据
    private List<HouseGyrVo> gyrList;//共有人

}
