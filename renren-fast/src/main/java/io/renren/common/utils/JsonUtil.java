package io.renren.common.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import io.renren.common.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Json 工具类封装
 * 主要作用是 屏蔽底层实现
 *
 * @author zjt
 * @date 2021-04-02
 */
@Slf4j
public class JsonUtil {

    private final static Gson GSON = new Gson();

    /**
     * Object to JsonString
     */
    public static String obj2JsonStr(Object obj) {
        return GSON.toJson(obj).trim();
    }

    /**
     * JsonString to Object
     */
    public static <T> T jsonStr2Obj(String json, Class<T> tClass) {
        try {
            return GSON.fromJson(json, tClass);
        } catch (JsonSyntaxException e) {
            log.error("jsonStr2Obj err - json:{} -> ", json, e);
            throw new BusinessException("jsonStr2Obj err - json:{} ; class:-{} ", json, tClass.getTypeName());
        }
    }

    public static <T> List<T> jsonArrayStr2List(String json, Type typeOfT) {
        return GSON.fromJson(json, typeOfT);
    }

    public static <T> List<T> jsonArrayStr2List(String json, TypeToken<?> typeToken) {
        return GSON.fromJson(json, typeToken.getType());
    }

    /**
     * Object to JsonArray Don't Forget catch the Exception
     *
     * @param obj the src
     * @return JsonArray or err
     */
    public static JsonArray obj2JsonArray(Object obj) {
        return GSON.toJsonTree(obj).getAsJsonArray();
    }

    /**
     * Object to JsonObject Don't Forget catch the Exception
     *
     * @param obj the src
     * @return JsonObject or null if type is not JsonObject
     */
    public static JsonObject obj2JsonObject(Object obj) {
        return GSON.toJsonTree(obj).getAsJsonObject();
    }

}
