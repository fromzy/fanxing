package entity;

import java.util.List;

/**
 * @Author: zhangying
 * @Date: 2019/1/1 15:33
 * @Version 1.0
 */
public class Method {
    //泛型方法，是在返回类型前面加上<>
    public  static  <T> void say(T t){
        System.out.println(t);
    }
    public <T> T test(T x){//有返回值的泛型方法
        return  x;
    }

    //泛型的继承
    //T则只能是Person及Person的子类，同时t还能使用Person的方法；
    public  static  <T extends Person> void test2(T t){
        System.out.print(t.toString());

    }



}
