package advanced_oop_04.access_modifier;

import advanced_oop_04.access_modifier.classes.*;

/*
        public -- accessible anywhere (Class, outside package etc. )
        private -- accessible only within same class
        default -- within same package
        protected -- within same package and subclass
 */


class A extends Protected{
    public void show(){
        System.out.println(password);
    }
}

public class Demo {
    public static void main(String []args){




        Public obj = new Public();
        System.out.println(obj.marks);              // 'obj.marks' ---- accessible (because - public int marks = 6;) access modifier


        Default obj2 = new Default();
        System.out.println(obj2.marks);              //'obj2.marks' --- accessible even it's not public (because in same package )

        A obj3 = new A();
        obj3.show();


    }
}
