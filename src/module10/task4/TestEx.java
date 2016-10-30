package module10.task4;

import module10.task2.TestOwnExeption;

import java.io.IOException;

public class TestEx {

    public void f() {
        System.out.println("Method f() calls method g()...");
        try {
            try {
                g();
            } catch (FirstException f) {
                System.err.println(f);
                throw new SecondException("method f() test exception!");
            }
        } catch (SecondException s) {
            System.err.println(s);
       }
    }

    public void g() throws FirstException {
        System.out.println("Method g() is run...");
        throw new FirstException("method g() test exception!");
    }
}


