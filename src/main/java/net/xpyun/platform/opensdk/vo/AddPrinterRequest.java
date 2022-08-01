package net.xpyun.platform.opensdk.vo;

/**
 * 添加打印机请求参数
 *
 * @author RabyGao
 * @date Aug 7, 2019
 */
public class AddPrinterRequest extends RestRequest {

    public net.xpyun.platform.opensdk.vo.AddPrinterRequestItem[] getItems() {
        return items;
    }

    public void setItems(net.xpyun.platform.opensdk.vo.AddPrinterRequestItem[] items) {
        this.items = items;
    }

    /**
     * 请求项集合
     */
    private AddPrinterRequestItem[] items;

}
