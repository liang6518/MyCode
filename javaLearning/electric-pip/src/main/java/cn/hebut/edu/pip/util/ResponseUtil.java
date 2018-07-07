package cn.hebut.edu.pip.util;

import java.util.HashMap;
import java.util.Map;

/**
 */
public class ResponseUtil {

    /**
     * 定义返回的key值
     */

    public static final String CODE = "code";
    public static final String MESSAGE = "message";
    public static final String DATA = "data";

    public static Map<String, Object> buildMap(String code, String message, Object object) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(CODE, code);
        map.put(MESSAGE, message);
        map.put(DATA, object);
        return map;
    }

    public static Map<String, Object> buildSuccess(Object object) {
        return buildMap("0", "成功", object);
    }

}
