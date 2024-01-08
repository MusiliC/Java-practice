package com.myjavaprojects.annotations;

import java.lang.annotation.Annotation;

public class AnnotationDemo {
    public static void main(String[] args) {
        NokiaSeries a = new NokiaSeries("Aazon",10);
        System.out.println(a.modelling);

        Class c = a.getClass();
        Annotation n = c.getAnnotation(SmartPhone.class);
        SmartPhone s  = (SmartPhone) n;
        System.out.println(s.os());
    }
}
