package entity;

/**
 * @Author: zhangying
 * @Date: 2019/1/1 14:46
 * @Version 1.0
 *
 */

/*
* 自定义泛型类,<>中没有强制要求，尽可能是单个大写字母（加数字），
* 泛型不能使用在静态属性上
*
* 使用时通过声明类型来限定类型
* */
public class Student <T1, T2>{
    private String name;
    private  T1 value1;
    private  T2 value2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T1 getValue1() {
        return value1;
    }

    public void setValue1(T1 value1) {
        this.value1 = value1;
    }

    public T2 getValue2() {
        return value2;
    }

    public void setValue2(T2 value2) {
        this.value2 = value2;
    }

    public Student() {
    }

    public Student(String name, T1 value1, T2 value2) {
        this.name = name;
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}

