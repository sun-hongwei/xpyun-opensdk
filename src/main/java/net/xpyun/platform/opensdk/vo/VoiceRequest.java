package net.xpyun.platform.opensdk.vo;


/**
 * 云喇叭播放语音请求参数
 *
 * @author RabyGao
 * @date Aug 5, 2020
 */
public class VoiceRequest extends RestRequest {

    /**
     * 打印机编号
     */
    private String sn;

    /**
     * 支付方式41~55：支付宝 微信 ...
     */
    private Integer payType;
    /**
     * 支付与否59~61：退款 到账 消费
     */
    private Integer payMode;
    /**
     * 支付金额
     */
    private Double money;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getPayMode() {
        return payMode;
    }

    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
