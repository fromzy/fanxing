package test;

import entity.Method;
import entity.Person;
import entity.Student;
import entity.myExtends.C1;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangying
 * @Date: 2019/1/1 16:49
 * @Version 1.0
 *
 */

/*
* 自定义泛型类的使用，
* 在声明时指定类型时，指定的类型只能是引用类型，不能是基本数据类型，即使用Integer而不能使用int；
* */
public class MyTest {

    //自定义泛型类的使用，
    @Test
    public void t1(){
        /*
        * Student <T1, T2>
        * 定义几个泛型就必须声明几个类型,如果Student <Integer> stu则报错
        * */

        Student <Integer,String>stu = new Student("wangwu",20,"1班");//Student <int> stu,报错
        System.out.println(stu.toString());

        Student <String,String> stu2 = new Student("lisi","美国","纽约");
        System.out.println(stu2.toString());

        Student <String,String> stu3 = new Student("zhangsan","优秀","3班");
        System.out.println(stu3.toString());
    }

    @Test//泛型方法
    public void t2(){
        Method.say("张三你好");
        Method m = new Method();//非泛型类的泛型方法，不能声明为泛型类，直接使用其方法

        Integer a = m.test(12);
        System.out.println(a);
    }

    @Test//泛型继承
    public void t3(){
        C1 c =new C1(1);
        System.out.println(c.toString());
    }

    @Test//通配符?（英文?）
    public  void  t4(){
        List<?> list = new ArrayList<Integer>();
        list = new ArrayList<String>();
        list = new ArrayList<Person>();
        add(list);


    }
    public void  add(List<?> list){

    }
}
