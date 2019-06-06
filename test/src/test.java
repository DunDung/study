import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws IOException {
		for(int i=0; i<3; i++) {
			if(((int)i&1)>0)
				System.out.println(i&1);
		}
	}
}
