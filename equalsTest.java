package ooptTest4_18;

/**
 * className: equalsTest<br>
 * description: 测试equals<br>
 * author: laissez aller<br>
 * date: 2023/4/18 20:00<br>
 * version: 1.0<br>
 */
public class equalsTest {
    public static void main(String[] args){
        equals test1=new equals(12);
        equals test2=new equals(13);
        equals test3=new equals("sb2");
        equals test4=new equals("sb2");
        System.out.println(test1.equals(test2));
        System.out.println(test3.equals(test4));
        System.out.println(test1);

    }

}
