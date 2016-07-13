package com.jysd.cp.util.xml;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.jysd.cp.bean.WxCpXmlMessage;
import com.jysd.cp.bean.WxCpXmlOutImageMessage;
import com.jysd.cp.bean.WxCpXmlOutMessage;
import com.jysd.cp.bean.WxCpXmlOutNewsMessage;
import com.jysd.cp.bean.WxCpXmlOutTextMessage;
import com.jysd.cp.bean.WxCpXmlOutVideoMessage;
import com.jysd.cp.bean.WxCpXmlOutVoiceMessage;
import com.jysd.weixing.framelib.common.util.xml.XStreamInitializer;
import com.thoughtworks.xstream.XStream;

public class XStreamTransformer {

  protected static final Map<Class, XStream> CLASS_2_XSTREAM_INSTANCE = configXStreamInstance();

  /**
   * xml -> pojo
   *
   * @param clazz
   * @param xml
   * @return
   */
  @SuppressWarnings("unchecked")
  public static <T> T fromXml(Class<T> clazz, String xml) {
    T object = (T) CLASS_2_XSTREAM_INSTANCE.get(clazz).fromXML(xml);
    return object;
  }

  @SuppressWarnings("unchecked")
  public static <T> T fromXml(Class<T> clazz, InputStream is) {
    T object = (T) CLASS_2_XSTREAM_INSTANCE.get(clazz).fromXML(is);
    return object;
  }

  /**
   * pojo -> xml
   *
   * @param clazz
   * @param object
   * @return
   */
  public static <T> String toXml(Class<T> clazz, T object) {
    return CLASS_2_XSTREAM_INSTANCE.get(clazz).toXML(object);
  }

  private static Map<Class, XStream> configXStreamInstance() {
    Map<Class, XStream> map = new HashMap<Class, XStream>();
    map.put(WxCpXmlMessage.class, config_WxCpXmlMessage());
    map.put(WxCpXmlOutNewsMessage.class, config_WxCpXmlOutNewsMessage());
    map.put(WxCpXmlOutTextMessage.class, config_WxCpXmlOutTextMessage());
    map.put(WxCpXmlOutImageMessage.class, config_WxCpXmlOutImageMessage());
    map.put(WxCpXmlOutVideoMessage.class, config_WxCpXmlOutVideoMessage());
    map.put(WxCpXmlOutVoiceMessage.class, config_WxCpXmlOutVoiceMessage());
    return map;
  }

  private static XStream config_WxCpXmlMessage() {
    XStream xstream = XStreamInitializer.getInstance();
    xstream.processAnnotations(WxCpXmlMessage.class);
    xstream.processAnnotations(WxCpXmlMessage.ScanCodeInfo.class);
    xstream.processAnnotations(WxCpXmlMessage.SendPicsInfo.class);
    xstream.processAnnotations(WxCpXmlMessage.SendPicsInfo.Item.class);
    xstream.processAnnotations(WxCpXmlMessage.SendLocationInfo.class);
    return xstream;
  }

  private static XStream config_WxCpXmlOutImageMessage() {
    XStream xstream = XStreamInitializer.getInstance();
    xstream.processAnnotations(WxCpXmlOutMessage.class);
    xstream.processAnnotations(WxCpXmlOutImageMessage.class);
    return xstream;
  }

  private static XStream config_WxCpXmlOutNewsMessage() {
    XStream xstream = XStreamInitializer.getInstance();
    xstream.processAnnotations(WxCpXmlOutMessage.class);
    xstream.processAnnotations(WxCpXmlOutNewsMessage.class);
    xstream.processAnnotations(WxCpXmlOutNewsMessage.Item.class);
    return xstream;
  }

  private static XStream config_WxCpXmlOutTextMessage() {
    XStream xstream = XStreamInitializer.getInstance();
    xstream.processAnnotations(WxCpXmlOutMessage.class);
    xstream.processAnnotations(WxCpXmlOutTextMessage.class);
    return xstream;
  }

  private static XStream config_WxCpXmlOutVideoMessage() {
    XStream xstream = XStreamInitializer.getInstance();
    xstream.processAnnotations(WxCpXmlOutMessage.class);
    xstream.processAnnotations(WxCpXmlOutVideoMessage.class);
    xstream.processAnnotations(WxCpXmlOutVideoMessage.Video.class);
    return xstream;
  }

  private static XStream config_WxCpXmlOutVoiceMessage() {
    XStream xstream = XStreamInitializer.getInstance();
    xstream.processAnnotations(WxCpXmlOutMessage.class);
    xstream.processAnnotations(WxCpXmlOutVoiceMessage.class);
    return xstream;
  }

}
