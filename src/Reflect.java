import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Man m = new Man("LiBai", 20);
        Class c = Man.class;

        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        String name = (String) f.get(m);
        String field = f.getName();
        System.out.println(name + field);
        Method[] methods = c.getDeclaredMethods();
        Constructor[] constructors = c.getConstructors();
        for (Method method : methods) {
            if (method.getName() == "getName") {
                System.out.println(method.invoke(m));
            }
        }
        for (Constructor constructor : constructors) {
            Man n = (Man) constructor.newInstance("w", 20);
            System.out.println(n.getName());
        }


    }
}

class Man {
    String name;
    int age;

    public Man(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
