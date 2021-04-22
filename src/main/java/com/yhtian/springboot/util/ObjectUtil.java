package com.yhtian.springboot.util;

import org.springframework.lang.Nullable;

/**
 * @author hehanpeng

 * @date 2020/1/10
 * @Description: 对象工具类
 */
public class ObjectUtil extends org.springframework.util.ObjectUtils {

    /**
     * 判断元素不为空
     * @param obj object
     * @return boolean
     */
    public static boolean isNotEmpty(@Nullable Object obj) {
        return !ObjectUtil.isEmpty(obj);
    }

}
