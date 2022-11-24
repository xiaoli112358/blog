package com.mszlu.blog.handler;

import com.mszlu.blog.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice//对加了@controller注解的方法进行拦截处理 Aop的实现
public class AllExceptionHandler {
    @ExceptionHandler(Exception.class)//进行异常处理，处理Exception.class的异常
    @ResponseBody //返回json数据如果不加就不会将JSON数据返给前端
    public Result doException(Exception ex) {
        //e.printStackTrace();是打印异常的堆栈信息，指明错误原因，
        // 其实当发生异常时，通常要处理异常，这是编程的好习惯，所以e.printStackTrace()可以方便你调试程序！
        ex.printStackTrace();
        return Result.fail(-999,"系统异常,请联系管理员");
    }
}
