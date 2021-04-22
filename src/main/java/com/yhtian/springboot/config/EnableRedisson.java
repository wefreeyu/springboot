package com.yhtian.springboot.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author yhtian

 * @Description:
 * @date 2019/11/1
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Import(value = {RedisProperties.class})
public @interface EnableRedisson {
}
