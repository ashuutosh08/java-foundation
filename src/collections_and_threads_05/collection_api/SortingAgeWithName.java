package collections_and_threads_05.collection_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
    int age;
    String name;

    public Students(int age, String name ) {
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SortingAgeWithName {
    public static void main(String[] args) {


        Comparator<Students> com = new Comparator<Students>() {

            public int compare(Students i, Students j) {
                if(i.age> j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Students> stud = new ArrayList<>();
        stud.add(new Students(23,"Sachin"));
        stud.add(new Students(12,"John"));
        stud.add(new Students(34,"Michael"));
        stud.add(new Students(45,"Striver"));

        Collections.sort(stud,com);                                 // sort based on the age

        for(Students s: stud){
            System.out.println(s);
        }

    }
}
