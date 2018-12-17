import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Exam13 {

    static class Data {
        private int i;
        private String s;
        public Data(int i, String s) {
            this.i = i;
            this.s = s;
        }
		
		@Override
        public String toString() {
        	return "Data("+i+", "+s+")";
        }
		@Override
	    public int hashCode() {
	    	return Objects.hash(i, s);
	    }
		
        @Override
        public boolean equals(Object obj) {
        	if(obj instanceof Data) {
        		Data p = (Data)obj;
        		return i==p.i&& Objects.equals(this.s, p.s); 
        	}
        	return false;
        }
    }

    public static void solution(Data[] a) {
    	  Map<Data, Integer> map = new HashMap<>();
          for (Data value : a) {
              Integer count = map.get(value);
              map.put(value, count == null ? 1 : count + 1);
          }
          for (Data value : map.keySet())
              System.out.println(value+" = "+ map.get(value)+"ȸ");    	
    }

    public static void main(String[] args) {
        Data[] a = new Data[] {
            new Data(1, "a"), new Data(2, "b"), new Data(1, "a"), new Data(1, "a"),
            new Data(2, "b"), new Data(1, "c"), new Data(2, "b"), new Data(2, "a"),
            new Data(1, "c"), new Data(2, "a"), new Data(1, "a"), new Data(1, "b")
        };
        solution(a);
    }
}

