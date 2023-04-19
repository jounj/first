package ooptTest4_18;

import java.util.Objects;

/**
 * className: equals<br>
 * description: 了解equals<br>
 * author: laissez aller<br>
 * date: 2023/4/18 20:00<br>
 * version: 1.0<br>
 */
public class equals {
    public static void main(String[] args){
        equals test1=new equals(13);
        equals test2=new equals(13);
        equals test3=new equals("sb2");
        equals test4=new equals("sb2");
        System.out.println(test2.age);
        System.out.println();
        //自定义类中equals比较的是地址
        System.out.println(test1.equals(test2));
        System.out.println(test3.equals(test4));
        //==中引用数据类型比较的是地址
        System.out.println(test1==test2);
        //String s2= new String("sb")与String s1不同
        //String s1 = new String() 创建了一个新的字符串对象并将其分配给变量 s1，
        //而 String s1 只是声明了一个变量，需要在后面的代码中进行初始化才能使用
        String s1= new String("sb");
        String s2= new String("sb");
        System.out.println(s1==s2);

        int a1=3;
        int a2=3;
        //==比较两个基本数据类型是比较内容
        System.out.println(a1==a2);
        System.out.println("****************");

        //打印的是地址
        System.out.println(test1);
        System.out.println();
        //因此要比较两个对象的属性是否相等，要重写equals方法，如下

    }
     /*
      * description:
      * @param null:
      * @return: null<br>
      * date: 2023/4/18 21:55<br>
      * author: laissezaller<br>
      * version: 1.0
      */
    int age;
    String name;
    /**
     * description:
     * @param age:
     * @return: null<br>
     * date: 2023/4/18 21:55<br>
     * author: laissezaller<br>
     * version: 1.0
     */
    /*
     * description:
     * @param age:
     * @return: null<br>
     * date: 2023/4/18 21:56<br>
     * author: laissezaller<br>
     * version: 1.0
     */
    public equals(int age) {
        this.age = age;
    }

    public equals(String name) {
        this.name = name;
    }
    //如下是重写的equals方法
/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        equals equals = (equals) o;
        return age == equals.age && Objects.equals(name, equals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }*/
}
