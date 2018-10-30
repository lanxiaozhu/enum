package com.moyu.enum_demo;

/**
 * 1.人类的枚举类
 * 这个枚举实际上是由java.lang.Enum这个类实现的，
 * 在程序中定义的枚举类型，都会隐式继承此类。
 * 并且，由于java中的继承是单继承，所以我们定义的枚举就无法在继承其他类了。
 * <p>
 * -----------------
 * 2.在我们编写自定义的enum时，其中是不含values()方法的，再编译java文件时，java编译器会自动帮助我们生成这个方法。
 */
public enum Person {
    KID(12, "小孩子"), YOUTH(25, "年轻人"), OLD(60, "老年人");
    // 成员变量：枚举KID(12,"小孩子")括号中的属性来定义;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 年轮
     */
    private String code;

    // 1.通过年龄得到 年轮
    public static String getCodeByAge(Integer age) {
        for (Person p : Person.values()) {
            if (p.getAge() == age) {
                return p.getCode();
            }
        }
        return "";
    }

    // 2.通过年龄得到编码
    public static Integer getAgeByCode(String code) {
        for (Person p : Person.values()) {
            if (p.getCode() == code) {
                return p.getAge();
            }
        }
        return 0;
    }


    Person(Integer age, String code) {
        this.age = age;
        this.code = code;
    }

    Person() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
