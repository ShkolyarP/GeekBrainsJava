package HomeWork24;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;

public class Task1 {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Units unit = new Units();
        Class<?> unitClass = Class.forName("HomeWork24.Units");
        getAnnotationMethods(unitClass, unit);
    }

    private static void getAnnotationMethods(Class<?> unitClass, Units unit) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = unitClass.getDeclaredMethods();
        Method beforeMethod = null;
        Method afterMethod = null;
        ArrayList<Method> arrayList = new ArrayList<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                arrayList.add(method);
            }
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                if (beforeMethod == null) {
                    beforeMethod = method;
                } else throw new RuntimeException();
            }
            if (method.isAnnotationPresent(AfterSuite.class)) {
                if (afterMethod == null) {
                    afterMethod = method;
                } else throw new RuntimeException();
            }
        }
        arrayList.sort(new Comparator<Method>() {
            @Override
            public int compare(Method method1, Method method2) {
                return method1.getAnnotation(Test.class).priority() - method2.getAnnotation(Test.class).priority();
            }
        });

        if (beforeMethod != null) arrayList.add(0, beforeMethod);
        if (afterMethod != null) arrayList.add(afterMethod);

        for (Method method : arrayList) {

            if (method.isAnnotationPresent(Test.class)) {
                System.out.print(method.getName() + "(priority " + method.getAnnotation(Test.class).priority() + ") : ");
            } 
            method.setAccessible(true);
            method.invoke(unit);

        }
    }

}
