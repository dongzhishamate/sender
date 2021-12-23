package com.zhu.sender.sender;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhu.sender.channel.email.MailSender;
import com.zhu.sender.entity.EmailConfig;
import com.zhu.sender.message.BaseMessage;
import com.zhu.sender.message.MessageKind;
import com.zhu.sender.service.EmailConfigService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class KafkaComsumer {

  @Resource
  private EmailConfigService emailConfigService;

  @KafkaListener(topics = {"test"})
  public void onMessage(ConsumerRecord<?,?> record) {
    BaseMessage message = (BaseMessage) record.value();
    //消息发送种类
    String messageKind = message.getMessageKind();
    MessageKind kind = MessageKind.getByMethodCode(messageKind);
    //消息发送者
    String sender = message.getSender();
    String messageValue = message.getValue();
    switch (kind) {
      case MAIL:
        QueryWrapper<EmailConfig> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("senderAddress", sender);
        EmailConfig emailConfig = emailConfigService.getOne(queryWrapper);
        MailSender mailSender = new MailSender(emailConfig, sender);
        try {
          mailSender.sendMessage(messageValue);
        } catch (Exception e) {
          e.printStackTrace();
        }
        break;
      case TEXTMESSAGE:
        break;
    }
  }
}
