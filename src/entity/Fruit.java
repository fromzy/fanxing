package entity;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangying
 * @Date: 2019/1/1 20:20
 * @Version 1.0
 */
public class Fruit {
    class Apple extends Fruit{

    }
    class FujiApple extends Apple{

    }
    public  void mytest(List<? extends  Fruit> list){//向下兼容，list只能存Fruit及其子类
       /*
       这里不能添加其以及子类，因为要保证向下兼容，如果mytest(l),l为apple类型，则list.add(new Fruit())是错的，故均不允许的
       list.add(new Apple());
        list.add(new Fruit());
        */
       list.add(null);

    }

    //>=
    public  void mytest2(List <? super Apple>  list){//向上兼容，只能存放Apple及其父类以上
        /*
        同理
        list.add(new Apple());
        */
        list.add(new FujiApple());//这里可以向上存放Apple以上的
    }




    @Test
    public void t(){
        List<? extends  Fruit> l =new ArrayList<Fruit>();
        mytest(l);

        l = new ArrayList<Apple>();
        mytest(l);

        //单纯一个<?>等同于<? extends Object>
        List<?> l2 = new ArrayList<Fruit>();
     //   mytest(l2);//错误，mytst只能存Fruit及其子类类型，而这里l2 <? extends Object>，超过了其范围



        List<? super Fruit> l3 = new ArrayList<Object>();
        mytest2(l3);
        /*
        向上兼容
        l3 =new ArrayList<Apple>()//错误;*/
    }
}
