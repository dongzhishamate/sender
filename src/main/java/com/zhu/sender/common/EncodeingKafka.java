package com.zhu.sender.common;


import com.alibaba.fastjson.JSON;
import com.zhu.sender.message.BaseMessage;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class EncodeingKafka implements Serializer<BaseMessage> {
  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {

  }

  @Override
  public byte[] serialize(String topic, BaseMessage data) {
    return JSON.toJSONBytes(data);
  }


  @Override
  public void close() {

  }
}
