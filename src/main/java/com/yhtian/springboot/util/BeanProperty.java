package com.yhtian.springboot.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author hehanpeng

 * @date 2020/1/10
 * @Description:
 */
@Getter
@AllArgsConstructor
public class BeanProperty {
    private final String name;
    private final Class<?> type;
}
