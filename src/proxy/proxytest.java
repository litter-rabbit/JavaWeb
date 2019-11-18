package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxytest {
    public static void main(String[] args) {

        lenevo lenevo = new lenevo();
        computer computer=(computer) Proxy.newProxyInstance(lenevo.getClass().getClassLoader(), lenevo.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


                System.out.println(args[0]+"sss");

                return null;
            }
        });
        computer.sale(9000);

    }
}
