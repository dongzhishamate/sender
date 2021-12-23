package com.zhu.sender.controller;

import com.zhu.sender.message.BaseMessage;
import com.zhu.sender.service.EmailConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class KafkaProducerController {

  @Autowired
  private KafkaTemplate<String, BaseMessage> kafkaTemplate;

  @Resource
  private EmailConfigService emailConfigService;

  @PostMapping("/kafka/send/")
  public void sendMessage(@RequestBody BaseMessage message) {
    kafkaTemplate.send("test", message);
  }
}
