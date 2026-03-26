package advanced_oop_04.abstract_classes.inner_class;

// Anonymous inner class -- used when need to create one-time, short-lived class implementation

class Ab {
    public void show(){
        System.out.println("in show ");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Ab obj = new Ab(){                                  // Anonymous class - naming as 'AnonymousInnerClass$1'
            public void show(){
                System.out.println(" in Anonymous ");
            }
        };
        obj.show();

    }
}
