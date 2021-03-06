/*
 * KINGSTAR MEDIA SOLUTIONS Co.,LTD. Copyright c 2005-2013. All rights reserved.
 *
 * This source code is the property of KINGSTAR MEDIA SOLUTIONS LTD. It is intended
 * only for the use of KINGSTAR MEDIA application development. Reengineering, reproduction
 * arose from modification of the original source, or other redistribution of this source
 * is not permitted without written permission of the KINGSTAR MEDIA SOLUTIONS LTD.
 */
package com.jysd.cp.util.json;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.jysd.cp.bean.WxCpDepart;
import com.jysd.weixing.framelib.common.util.json.GsonHelper;

/**
 * @author Daniel Qian
 */
public class WxCpDepartGsonAdapter implements JsonSerializer<WxCpDepart>, JsonDeserializer<WxCpDepart> {

  public JsonElement serialize(WxCpDepart group, Type typeOfSrc, JsonSerializationContext context) {
    JsonObject json = new JsonObject();
    if (group.getId() != null) {
      json.addProperty("id", group.getId());
    }
    if (group.getName() != null) {
      json.addProperty("name", group.getName());
    }
    if (group.getParentId() != null) {
      json.addProperty("parentid", group.getParentId());
    }
    if (group.getOrder() != null) {
      json.addProperty("order", String.valueOf(group.getOrder()));
    }
    return json;
  }

  public WxCpDepart deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    WxCpDepart depart = new WxCpDepart();
    JsonObject departJson = json.getAsJsonObject();
    if (departJson.get("id") != null && !departJson.get("id").isJsonNull()) {
      depart.setId(GsonHelper.getAsInteger(departJson.get("id")));
    }
    if (departJson.get("name") != null && !departJson.get("name").isJsonNull()) {
      depart.setName(GsonHelper.getAsString(departJson.get("name")));
    }
    if (departJson.get("order") != null && !departJson.get("order").isJsonNull()) {
      depart.setOrder(GsonHelper.getAsInteger(departJson.get("order")));
    }
    if (departJson.get("parentid") != null && !departJson.get("parentid").isJsonNull()) {
      depart.setParentId(GsonHelper.getAsInteger(departJson.get("parentid")));
    }
    return depart;
  }

}
