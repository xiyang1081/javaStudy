/*

   最基本的输出
   int类型相加
   int类型转换为String类型
   double类型转换为String类型

*/

class t1 {
   private static String getIntToString(int num1, int num2) {
      return String.valueOf(num1 + num2);
   }

   private static String getDoubleToString(double num1, double num2) {
      return String.valueOf(num1 + num2);
   }

   public static void main(String[] args) {
      System.out.println("This is my first java application, "
         + "I feel I will like to it!");
      System.out.println("getIntToString:" + getIntToString(11, 12));
      System.out.println("getDoubleToString:" 
         + getDoubleToString(1.02323, 1.2444));

   }
}
