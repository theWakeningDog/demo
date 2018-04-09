package com.example.demo2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 外部类普通类调用Spring bean对象，不在同包或子包下
 *
 * 说明：此类需要放到App.java同包或子包下才能被扫描
 * Created by zhangwei on 2018/4/6 0006.
 */
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringUtil.applicationContext == null) {
            SpringUtil.applicationContext = applicationContext;
        }
        System.out.println("------------------------------------------------");
        System.out.println("demo2中ApplicationContext配置成功,在普通类可以通过调用SpringUtils.getAppContext()获取" +
                "applicationContext对象,applicationContext="+SpringUtil.applicationContext);
        System.out.println("------------------------------------------------");
    }

    /*
     * 获取applicationContext
     * */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /*
     * 通过name获取bean
     * */
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    /*
     * 通过clazz获取Bean
     * */
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    /*
     * 通过name及clazz返回制定的Bean
     * */
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }
}
