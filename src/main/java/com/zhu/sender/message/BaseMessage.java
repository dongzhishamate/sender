package com.zhu.sender.message;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseMessage implements Serializable {
  //消息接收者
  private String receiver;
  //消息发送方式
  private String messageKind;
  //消息内容
  private String value;
  //消息发送者
  private String sender;
}
