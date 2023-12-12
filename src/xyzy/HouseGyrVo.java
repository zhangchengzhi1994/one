package xyzy;

import lombok.Data;

import java.io.Serializable;

@Data
public class HouseGyrVo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String msfgyxm;//买受方共有人姓名
    private String msfgyzjzl;//买受方共有人证件种类
    private String msfgyzjhm;//买受方共有人证件号码
    private String msfgygj;//买受方共有人国籍
    private String msfgydz;//买受方共有人地址
    private String msfgylxdh;//买受方共有人联系电话
    private String msfgyszfe;//买受方共有人所占份额
    private String msfgyqssl;//契税税率
    private String msfgyqsse;//契税税额
    private String msfgyyhssl;//印花税税率
    private String msfgyyhsse;//印花税税额
    private String qsjmxzdm;//契税减免性质代码
    private String qsjmse;//契税减免税额
    private String msfgryhsjmse;//印花税减免税额
    private String qsyhsl;//契税优惠税率


    public String getMsfgyxm() {
        return msfgyxm;
    }

    public void setMsfgyxm(String msfgyxm) {
        this.msfgyxm = msfgyxm;
    }

    public String getMsfgyzjzl() {
        return msfgyzjzl;
    }

    public void setMsfgyzjzl(String msfgyzjzl) {
        this.msfgyzjzl = msfgyzjzl;
    }

    public String getMsfgyzjhm() {
        return msfgyzjhm;
    }

    public void setMsfgyzjhm(String msfgyzjhm) {
        this.msfgyzjhm = msfgyzjhm;
    }

    public String getMsfgygj() {
        return msfgygj;
    }

    public void setMsfgygj(String msfgygj) {
        this.msfgygj = msfgygj;
    }

    public String getMsfgydz() {
        return msfgydz;
    }

    public void setMsfgydz(String msfgydz) {
        this.msfgydz = msfgydz;
    }

    public String getMsfgylxdh() {
        return msfgylxdh;
    }

    public void setMsfgylxdh(String msfgylxdh) {
        this.msfgylxdh = msfgylxdh;
    }

    public String getMsfgyszfe() {
        return msfgyszfe;
    }

    public void setMsfgyszfe(String msfgyszfe) {
        this.msfgyszfe = msfgyszfe;
    }

    public String getMsfgyqssl() {
        return msfgyqssl;
    }

    public void setMsfgyqssl(String msfgyqssl) {
        this.msfgyqssl = msfgyqssl;
    }

    public String getMsfgyqsse() {
        return msfgyqsse;
    }

    public void setMsfgyqsse(String msfgyqsse) {
        this.msfgyqsse = msfgyqsse;
    }

    public String getMsfgyyhssl() {
        return msfgyyhssl;
    }

    public void setMsfgyyhssl(String msfgyyhssl) {
        this.msfgyyhssl = msfgyyhssl;
    }

    public String getMsfgyyhsse() {
        return msfgyyhsse;
    }

    public void setMsfgyyhsse(String msfgyyhsse) {
        this.msfgyyhsse = msfgyyhsse;
    }

    public String getQsjmxzdm() {
        return qsjmxzdm;
    }

    public void setQsjmxzdm(String qsjmxzdm) {
        this.qsjmxzdm = qsjmxzdm;
    }

    public String getQsjmse() {
        return qsjmse;
    }

    public void setQsjmse(String qsjmse) {
        this.qsjmse = qsjmse;
    }

    public String getMsfgryhsjmse() {
        return msfgryhsjmse;
    }

    public void setMsfgryhsjmse(String msfgryhsjmse) {
        this.msfgryhsjmse = msfgryhsjmse;
    }

    public String getQsyhsl() {
        return qsyhsl;
    }

    public void setQsyhsl(String qsyhsl) {
        this.qsyhsl = qsyhsl;
    }
}
