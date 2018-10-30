package com.moyu.enum_demo;

public class Invoking {
    /**
     * 代码测试
     * @param args
     */
    public static void main(String[] args) {
        Integer old = Person.getAgeByCode("年轻人");
        System.out.println(old);
        //-----------------
        String code = Person.getCodeByAge(12);
        System.out.println(code);
    }
}
