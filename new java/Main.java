interface Inter1 {
    void method1();
}

interface Inter2 {
    void method2();
}

interface CombinedInter extends Inter1, Inter2 {
    void concretemethod();
}

class Yourclass implements CombinedInter {
    public void method1() {
        System.out.println("This is a method from interface 1");
    }

    public void method2() {
        System.out.println("This is a method from interface 2");
    }

    public void concretemethod() {
        System.out.println("This is a method in class");
    }

    public void m1(Inter1 obj) {
        obj.method1();
    }

    public void m2(Inter2 obj) {
        obj.method2();
    }

    public void m3(CombinedInter obj) {
        obj.concretemethod();
    }
}

class Main {
    public static void main(String args[]) {
        Yourclass obj = new Yourclass();
        obj.m1(obj);
        obj.m2(obj);
        obj.m3(obj);
    }
}
