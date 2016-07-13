package com.jysd.cp.bean;

import com.jysd.weixing.framelib.common.api.WxConsts;
import com.jysd.weixing.framelib.common.util.xml.XStreamMediaIdConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

@XStreamAlias("xml")
public class WxCpXmlOutVoiceMessage extends WxCpXmlOutMessage {
  
  @XStreamAlias("Voice")
  @XStreamConverter(value=XStreamMediaIdConverter.class)
  private String mediaId;

  public WxCpXmlOutVoiceMessage() {
    this.msgType = WxConsts.XML_MSG_VOICE;
  }
  
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }
  
}
