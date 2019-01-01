package entity.myExtends;

/**
 * @Author: zhangying
 * @Date: 2019/1/1 16:29
 * @Version 1.0
 *
 */

/*
* 自己是泛型，部分保留父类泛型
* */
public class C2<T2> extends Father<String,T2>{
    public C2() {
    }

    public C2(String s, T2 t2) {
        super(s, t2);
    }
}
