package dolphin;

import com.ytx.pay.wechat.service.YtxWechatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Alex
 **/
@Controller
public class WeChatRefundController {

    private final static Logger logger = LoggerFactory.getLogger(WeChatRefundController.class);

    @Autowired
    private YtxWechatService ytxWechatService;

    @RequestMapping("to_refund")
    public String index() {
        return "refund";
    }

    @RequestMapping("refund")
    @ResponseBody
    public Object refund(@RequestParam(value = "totalFee") String totalFee,
                         @RequestParam(value = "refundFee") String refundFee,
                         @RequestParam(value = "outRefundNo") String outRefundNo,
                         @RequestParam(value = "tradeNo") String tradeNo) {
        Map map = ytxWechatService.refund(4, totalFee, refundFee, outRefundNo, tradeNo, null, true);
        logger.info("result:{}", map);
        return map;
    }

}
