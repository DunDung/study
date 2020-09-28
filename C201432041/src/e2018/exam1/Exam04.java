package e2018.exam1;

public class Exam04 {

   public static void doSomething(String s) {
	   StringBuilder a = new StringBuilder();
	   for(int i =0; i<s.length(); i++) {
		   a.append("(");
		   a.append(s.charAt(i));
		   a.append(") ");
	   }
	   System.out.println(a.toString());
   }

   public static void main(String[] args) {
       String[] a = { "hello", "world", "hello world" };
       for (String s : a)
           doSomething(s);
   }
}

