package net.xpyun.platform.opensdk.vo;

/**
 * 添加打印机请求项
 *
 * @author RabyGao
 * @date Aug 7, 2019
 */
public class AddPrinterRequestItem {

    /**
     * 打印机编号
     */
    private String sn;
    /**
     * 打印机名称
     */
    private String name;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
