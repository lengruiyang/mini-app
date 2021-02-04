package cn.huiounet.miniapp.activemq;

import cn.huiounet.miniapp.pojo.SendMessage;
import cn.huiounet.miniapp.utils.send_message.SendMessageUtil;
import com.alibaba.fastjson.JSONArray;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/3 12:41
 */
@Component
public class QueueConsumerListener {
    //queue模式的消费者 点对点
    @JmsListener(destination="${spring.activemq.queue-name}", containerFactory="queueListener")
    public void readActiveQueue(String message) {
        System.out.println("queue接受到：" + message);
        SendMessage sendMessage = JSONArray.parseObject(message,SendMessage.class);
        try {
            SendMessageUtil.getMess(sendMessage.getPhone(),sendMessage.getCode(),"5");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
