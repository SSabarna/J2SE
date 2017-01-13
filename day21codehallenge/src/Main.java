import java.util.StringTokenizer;
class try1 {
public static void main(String a[]){
String msg = "http://10.123.43.67:80/";
StringTokenizer st = new StringTokenizer(msg,"://.");
System.out.println(st.countTokens());
}
}