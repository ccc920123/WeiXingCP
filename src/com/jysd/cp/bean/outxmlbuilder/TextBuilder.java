package com.jysd.cp.bean.outxmlbuilder;

import com.jysd.cp.bean.WxCpXmlOutTextMessage;

/**
 * 文本消息builder
 * @author Daniel Qian
 *
 */
public final class TextBuilder extends BaseBuilder<TextBuilder, WxCpXmlOutTextMessage> {
  private String content;

  public TextBuilder content(String content) {
    this.content = content;
    return this;
  }

  public WxCpXmlOutTextMessage build() {
    WxCpXmlOutTextMessage m = new WxCpXmlOutTextMessage();
    setCommon(m);
    m.setContent(this.content);
    return m;
  }
}
