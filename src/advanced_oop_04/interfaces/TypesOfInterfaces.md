Normal Interfaces - having multiple Abstract methods

interface Animal {
void eat();
void sleep();
}


Functional Interfaces - having only one abstract method
                        - also called SAM(single abstract method )

@FunctionalInterface
interface Calculator {
int add(int a, int b);
}



Marker interface - having no methods(empty interface)

import java.io.Serializable;

class Student implements Serializable {
}

Here, 'Serializable' is a marker.

