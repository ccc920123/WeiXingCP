package com.jysd.cp.bean;


import java.io.Serializable;

import com.jysd.cp.util.json.WxCpGsonBuilder;

/**
 * Created by Daniel Qian
 */
public class WxCpTag implements Serializable {

  private String id;

  private String name;

  public WxCpTag() {
    super();
  }

  public WxCpTag(String id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public static WxCpTag fromJson(String json) {
    return WxCpGsonBuilder.create().fromJson(json, WxCpTag.class);
  }

  public String toJson() {
    return WxCpGsonBuilder.create().toJson(this);
  }

}
