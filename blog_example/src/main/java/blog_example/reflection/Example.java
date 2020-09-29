package blog_example.reflection;

import blog_example.hardcodding.Car;

import java.lang.reflect.Method;

public class Example {

    public static void main(String[] args) throws Exception {
        Object obj = new Car("foo", 0);
        Class carClass = obj.getClass();
        Method move = carClass.getMethod("move");

        // 메서드 실행, invoke(메서드를 실행시킬 객체, 해당 메서드에 넘길 인자)
        move.invoke(obj, null);

        Method getPosition = carClass.getMethod("getPosition");
        int position = (int)getPosition.invoke(obj, null);
        System.out.println(position);
        // 출력 결과: 1
    }
}
