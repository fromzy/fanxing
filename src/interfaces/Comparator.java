package interfaces;

/**
 * @Author: zhangying
 * @Date: 2019/1/1 15:22
 * @Version 1.0
 */

/*
* 接口由2部分组成，全局常量+公用抽象方法；
* */
public interface Comparator<T>{
    //泛型不能用在全局常量上
    public static  final  int MAX_VALUE = 200;//public static  final自动加上，这里可以省略
    public T compare(T t);      //public 自动加上，这里可以省略
}
