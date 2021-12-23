package com.zhu.sender.common;

import com.alibaba.fastjson.JSON;
import com.zhu.sender.message.BaseMessage;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class DencodeingKafka implements Deserializer<BaseMessage> {
  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {

  }

  @Override
  public BaseMessage deserialize(String topic, byte[] data) {
    return JSON.parseObject(data, BaseMessage.class);
  }
}
