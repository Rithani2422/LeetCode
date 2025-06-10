import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
    //     long a=Integer.parseInt(num1);
    //     long b=Integer.parseInt(num2);
    // long sum=a*b;
    // return Long.toString(sum);
    BigInteger a=new BigInteger(num1);
     BigInteger b=new BigInteger(num2);
     BigInteger result=a.multiply(b);
    return result.toString();
    }
}