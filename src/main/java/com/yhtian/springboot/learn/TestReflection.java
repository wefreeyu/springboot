package com.yhtian.springboot.learn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: yhtian
 * @date: 2020/12/01
 * @description:
 */
//请实现createObject方法，执行main函数达到注释中想要输出的效果
interface IA {
    String getHelloName();
    String getHelloId();
}

/**
 * 简化版
 * */
//class ShowMeBug {
//    public static void main(String[] args) throws Exception {
//        IA ia = (IA) createObject(IA.class.getName() + "$getHelloName=Abc");
//        System.out.println(ia.getHelloName()); //方法名匹配的时候，输出“Abc”
//        ia = (IA) createObject(IA.class.getName() + "$getTest=Bcd");
//        System.out.println(ia.getHelloName()); //方法名不匹配的时候，输出null
//    }
//
//    //请实现方法createObject，接口中"getName()"方法名仅仅是个示例，不能写死判断
//    public static Object createObject(String str) throws Exception {
//        String[] arr = str.split("\\$");
//        Class<?> classObject = Class.forName(arr[0]);
//        Method[] methods = classObject.getMethods();
//        String[] arr1 = arr[1].split("=");
//
//        IA ia = new IA() {
//            @Override
//            public String getHelloName() {
//                for (int i = 0; i < methods.length; i++) {
//                    if (arr1[0].equals(methods[i].getName())) {
//                        return arr1[1];
//                    }
//                }
//                return null;
//            }
//        };
//
//        return ia;
//    }
//}


    /**
     * 版本2
     * */
class ShowMeBug {
    public static void main(String[] args) throws Exception {
        IA ia = (IA) createObject(IA.class.getName() + "$getHelloName=Abc");
        System.out.println(ia.getHelloName()); //方法名匹配的时候，输出“Abc”
        ia = (IA) createObject(IA.class.getName() + "$getHelloId=Bcd");
        System.out.println(ia.getHelloName()); //方法名不匹配的时候，输出null
    }

    //请实现方法createObject，接口中"getName()"方法名仅仅是个示例，不能写死判断
    public static Object createObject(String str) throws Exception {
        String[] arr = str.split("\\$");
//        Class<?> classObject = Class.forName(arr[0]);
//        Method[] methods = classObject.getMethods();
        String[] arr1 = arr[1].split("=");
        String methodName = arr1[0];
        String result = arr1[1];

        return Proxy.newProxyInstance(IA.class.getClassLoader(), new Class[]{IA.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (methodName.equals(method.getName())) {
                    return result;
                }
                return null;
            }
        });
    }
}



//public class TestHH {
//
//    public static void main(String[] args) throws Throwable {
//        IA ia = (IA) createObject(IA.class.getName() + "$getHelloName=Abc");
//        System.out.println(ia.getHelloName());
//        ia = (IA) createObject(IA.class.getName() + "$getTest=Bcd");
//        System.out.println(ia.getHelloName());
//    }
//
//    private static Object createObject(String str) throws Throwable {
//        String[] params = str.split("\\$");
//        Class<?> clazz = Class.forName(params[0]);
//        String[] invokeParams = params[1].split("=");
//        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvokeHandler(invokeParams[0], invokeParams[1]));
//    }
//}
//
//class InvokeHandler implements InvocationHandler {
//
//    final String filterMethod;
//    final String returnValue;
//
//    InvokeHandler(String filterMethod, String returnValue) {
//        this.filterMethod = filterMethod;
//        this.returnValue = returnValue;
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        // object的公用方法直接调用当前invoke对象的。
//        if (Object.class.equals(method.getDeclaringClass())) {
//            return method.invoke(this, args);
//            // 针对接口的不同方法书写我们具体的实现
//        } else if (filterMethod.equals(method.getName())) {
//            return returnValue;
//        }
//        return null;
//    }
//}
