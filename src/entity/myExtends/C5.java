package entity.myExtends;

/**
 * @Author: zhangying
 * @Date: 2019/1/1 16:39
 * @Version 1.0
 */
public class C5<T1,T2,T3> extends Father<T1, T2> {
    private T3 t3;

    public C5(T3 t3) {
        this.t3 = t3;
    }

    public C5(T1 t1, T2 t2, T3 t3) {
        super(t1, t2);
        this.t3 = t3;
    }
}
