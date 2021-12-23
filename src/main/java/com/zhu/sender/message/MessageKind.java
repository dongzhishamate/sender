package com.zhu.sender.message;

public enum MessageKind {

  MAIL("1", "mail"),
  TEXTMESSAGE("2", "TEST MESSAGE");

  //消息发送方式对应的代码
  private String methodCode;
  //具体的消息发送方式
  private String method;

  MessageKind(String methodCode, String method) {
    this.methodCode = methodCode;
    this.method = method;
  }

  public String getMethodCode() {
    return methodCode;
  }

  public String getMethod() {
    return method;
  }

  public static MessageKind getByMethodCode(String methodCode) {
    for(MessageKind messageKind: MessageKind.values()) {
      if(messageKind.getMethodCode().equals(methodCode)) {
        return messageKind;
      }
    }
    return null;
  }

}
