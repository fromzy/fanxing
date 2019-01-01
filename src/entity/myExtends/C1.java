package entity.myExtends;

/**
 * @Author: zhangying
 * @Date: 2019/1/1 16:19
 * @Version 1.0
 */
public class C1 extends Father{
private int age;

    public C1(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "C1{" +
                "age=" + age +
                '}';
    }
}
