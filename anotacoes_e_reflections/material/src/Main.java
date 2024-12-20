import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        var obj = new MinhaClasse();
        new Processor().process(obj);
    }
}

class Processor {
    public void process(Object obj) throws InvocationTargetException, IllegalAccessException {
        var methods = obj.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(PrintHello.class)) {
                System.out.println("Hello");
                method.invoke(obj);
            }
        }

    }
}

class MinhaClasse {
    @PrintHello
    public void meuMetodo() {
        System.out.println("Minha lógica");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface PrintHello {

}