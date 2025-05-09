public class B extends A{
    @Override
    void f(A o) {
        System.out.println("f(A) dans B");
    }

    void f(B o) {
        System.out.println("f(B) dans B");
    }
}
