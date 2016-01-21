/*
@author 夕阳
各个进制展示以及转换
*/

class demo {
   public static void main(String[] args) {
      System.out.println(0x10);  //16进制
      System.out.println(010);  //8进制

      System.out.println("十进制转二进制:" 
         + Integer.toBinaryString(10)); //十进制转二进制

      byte b = 1;
      System.out.println(b);

      // byte b1 = 128;   //越线 -128 ~ 127
      // System.out.println(b1);
      float f = 1.23f;
      double d = 12.23d;

      System.out.println("f:" + f + "\td:" + d);
      char a = '1';
      System.out.println(a);
      boolean bl = true;
      System.out.println(bl);

      int x = 10;
      x += 12;
      System.out.println("x:" + x);

      byte bx1 = 3;
      // bx1 = bx1 + 2;   //会挂掉，Java是强类型语言
      bx1 += 2;   //这就不会报错
      System.out.println(bx1);
   }
}