public class HW2 {
    public static void main(String[] args) {
        class A {
            int x = 1;
            int y = 5;
        }
        class B {
            int x = 3;
            int y = 5;
        }
        class C {
            int x = 6;
            int y = 7;
        }
        A a = new A();
        B b = new B();
        C c = new C();
        int S = ((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y)) / 2;
        {
            System.out.println(S);
            {
                if ((S % 2) == 0) {
                    System.out.println(true);
                } else
                    System.out.println(false);
                    }
                }
            }
        }
