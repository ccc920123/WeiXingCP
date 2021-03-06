package com.jysd.cp.api;

import java.util.Map;

import com.jysd.cp.bean.WxCpXmlMessage;
import com.jysd.weixing.framelib.common.exception.WxErrorException;
import com.jysd.weixing.framelib.common.session.WxSessionManager;

/**
 * 微信消息拦截器，可以用来做验证
 *
 * @author Daniel Qian
 */
public interface WxCpMessageInterceptor {

  /**
   * 拦截微信消息
   *
   * @param wxMessage
   * @param context        上下文，如果handler或interceptor之间有信息要传递，可以用这个
   * @param wxCpService
   * @param sessionManager
   * @return true代表OK，false代表不OK
   */
  public boolean intercept(WxCpXmlMessage wxMessage,
                          Map<String, Object> context,
                          WxCpService wxCpService,
                          WxSessionManager sessionManager) throws WxErrorException;

}
