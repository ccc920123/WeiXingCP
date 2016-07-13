package com.jysd.cp.bean;

import com.jysd.weixing.framelib.common.api.WxConsts;
import com.jysd.weixing.framelib.common.util.xml.XStreamMediaIdConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

@XStreamAlias("xml")
public class WxCpXmlOutImageMessage extends WxCpXmlOutMessage {
  
  @XStreamAlias("Image")
  @XStreamConverter(value=XStreamMediaIdConverter.class)
  private String mediaId;

  public WxCpXmlOutImageMessage() {
    this.msgType = WxConsts.XML_MSG_IMAGE;
  }
  
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }
  
}
