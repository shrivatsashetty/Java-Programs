class NumberAdd {

    static int a, b, c; // now other classes can also acess the variables, since they are static

    void getdata(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        c = a + b;
        System.out.println("sum = " + c);
    }
}

class NumberAddDemo {

    public static void main(String[] args) {

        NumberAdd obj = new NumberAdd();
        obj.getdata(200, 100);
        obj.add();
    }
}