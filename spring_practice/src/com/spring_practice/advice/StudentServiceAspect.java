package com.spring_practice.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class StudentServiceAspect {

    public void doBefore(JoinPoint jp) {
        jp.getTarget().getClass().getName();
        System.out.println("开始添加学生");
    }

    public void doAfter(JoinPoint jp) {
        jp.getTarget().getClass().getName();
        System.out.println("添加学生完成");
    }

    /**
     * 环绕通知
     *
     * 前置 -> 环绕 -> 返回 -> 后置
     *
     */
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("添加学生前");
        Object retVal = pjp.proceed();
        System.out.println("添加学生后");
        return retVal;
    }

    public void doAfterReturning(JoinPoint jp) {
        System.out.println("返回通知");
    }

    public void doAfterThrowing(JoinPoint jp, Throwable ex) {
        System.out.println("异常通知");
        System.out.println(ex.getMessage());
    }

}
