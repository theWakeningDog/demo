package com.example.demo.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一的异常处理类
 * Created by zhangwei on 2018/3/27 0027.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, Exception e) {
        // // If the exception is annotated with @ResponseStatus rethrow it and let
        // // the framework handle it - like the OrderNotFoundException example
        // // at the start of this post.
        // // AnnotationUtils is a Spring Framework utility class.
        // if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
        // throw e;
        //
        // // Otherwise setup and send the user to a default error-view.
        // ModelAndView mav = new ModelAndView();
        // mav.addObject("exception", e);
        // mav.addObject("url", req.getRequestURL());
        // mav.setViewName(DEFAULT_ERROR_VIEW);
        // return mav;

        e.printStackTrace();
        System.out.println("-----------------GlobalDefaultExceptionHandler.defaultErrorHandler()-----------------------");

        /**
         * 返回Json数据或String数据
         * 那么需要在方法上加上注解：@ResponseBody
         * 添加ruturn即可
         */

        /**
         *返回一个视图：
         * 定义一个ModelAndView即可
         * 然后return
         * 定义视图文件（比如：error.html,error.ftl,error.jsp）
         */
    }

//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultExceptionHandler(HttpServletRequest req, Exception e) {
//         ModelAndView mav = new ModelAndView();
//         mav.addObject("exception", e);
//         mav.addObject("url", req.getRequestURL());
//         mav.setViewName("1");
//         return mav;
//    }
}
