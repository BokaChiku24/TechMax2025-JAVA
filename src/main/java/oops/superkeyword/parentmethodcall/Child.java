    package oops.superkeyword.parentmethodcall;

    class Parent {
        protected int x;
        public Parent(int x) {
            this.x = x;
        }
        void display() {
            System.out.println("Parent's display method: x = " + x);
        }
    }

    public class Child extends Parent {
        int y;
        public Child(int x, int y) {
            super(x);
            this.y = y;
        }
        @Override
        void display() {
            super.display();
            System.out.println("Child's display method: x = " + x + ", y = " + y);
        }
        public static void main(String[] args) {
            Child child = new Child(10, 5);
            child.display();
        }
    }
