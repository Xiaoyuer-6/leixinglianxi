/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-03-29
 * Time: 08:39
 */
public class LeiXing {
    public static void main(String[] args) {
        int a = 10;
         a = a++;
        System.out.println(a);
    }

    public static void main7(String[] args) {
        String a = "119";
        int b = Integer.valueOf(a);
        System.out.println(b+1);//此时已拿到整型；
        int c =Integer.parseInt(a);
        System.out.println(c);

    }
    public static void main6(String[] args) {
        {
            int a = 10;
            System.out.println(a);
        }
        System.out.println();//不能找A,局部变量找不到；
    }
    public static void main5(String[] args) {
        //String a ="hello";
        //String b = "world";
        int a = 10;
        int b = 10;
        String ret = "result = ";
        System.out.println(ret+a+b);
        /*
        String a ="hello";
        String b = "world";
        System.out.println("a="+a+",b=" +b);

         */
    }
    public static void main4(String[] args) {//short短整型，Short
        short sh =1234;
        System.out.println(sh);
    }

    public static void main3(String[] args) {//布尔类型。Boolean
        boolean value = false;
        System.out.println(value);

    }
    public static void main2(String[] args) {//字节类型，Byte
        byte by = 127;
        System.out.println(by);
    }
    public static void main1(String[] args) {

        /*字符类型,包装类型为Character
        char ch = '胡';
        System.out.println(ch);

        char ch2 =7658;
        System.out.println(ch2);
        /*数值类型
        long b =10;
        System.out.println(b);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        /*
        int a = 10;
        System.out.println(a);Integer包装类型；
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
         */
    }
}
