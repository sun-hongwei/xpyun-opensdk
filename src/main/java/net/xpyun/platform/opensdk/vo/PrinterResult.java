package net.xpyun.platform.opensdk.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 批量添加或删除打印机结果
 *
 * @author RabyGao
 * @date Aug 7, 2019
 */
public class PrinterResult{

    public PrinterResult() {
        success = new ArrayList<>();
        fail = new ArrayList<>();
        failMsg=new ArrayList<>();
    }

    /**
     * 成功的打印机编号集合
     */
    private List<String> success;

    /**
     * 失败的打印机编号集合
     */
    private List<String> fail;
    /**
     * 失败原因集合  设备编号：失败原因
     */
    private List<String> failMsg ;

    public List<String> getSuccess() {
        return success;
    }

    public void setSuccess(List<String> success) {
        this.success = success;
    }

    public List<String> getFail() {
        return fail;
    }

    public void setFail(List<String> fail) {
        this.fail = fail;
    }

    public List<String> getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(List<String> failMsg) {
        this.failMsg = failMsg;
    }
}
