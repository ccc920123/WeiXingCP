package com.jysd.cp.util.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jysd.cp.bean.WxCpDepart;
import com.jysd.cp.bean.WxCpMessage;
import com.jysd.cp.bean.WxCpTag;
import com.jysd.cp.bean.WxCpUser;
import com.jysd.weixing.framelib.common.bean.result.WxError;
import com.jysd.weixing.framelib.common.util.json.WxErrorAdapter;

public class WxCpGsonBuilder {

  public static final GsonBuilder INSTANCE = new GsonBuilder();

  static {
    INSTANCE.disableHtmlEscaping();
    INSTANCE.registerTypeAdapter(WxCpMessage.class, new WxCpMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(WxCpDepart.class, new WxCpDepartGsonAdapter());
    INSTANCE.registerTypeAdapter(WxCpUser.class, new WxCpUserGsonAdapter());
    INSTANCE.registerTypeAdapter(WxError.class, new WxErrorAdapter());
    INSTANCE.registerTypeAdapter(WxCpTag.class, new WxCpTagGsonAdapter());
  }

  public static Gson create() {
    return INSTANCE.create();
  }

}
