package e2018.exam1;

public class Exam06 {

    static String getExtension(String path) {
    	for(int i=0; i<path.length(); i++) {
    		if(path.charAt(i) == '.')
    			return path.substring(i);
    	}
    	return null;
    }

    public static void main(String[] args) {
        String[] a = { "c:/data/student/lecture.docx",
                       "c:/www/mainpage.html",
                       "c:/program files/java/javac.exe" };
        for (String s : a) {
            String ext = getExtension(s);
            System.out.println(ext);
        }
    }

}
