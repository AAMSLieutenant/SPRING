package ru.javabegin.training.spring.impls.robot;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ActionReplacer implements MethodReplacer {

    public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("new action!");
        return null;
    }

}
