package collections_and_threads_05.taking_input_from_user;

/*
    BufferedReader - used to read text efficiently form input streams like(keyboard, file )
    - reads String only
    - it reads data line by line (can read full lines easily)
    -
 */





import java.io.*;
//import java.io.InputStreamReader;
//import java.io.IOException;

public class BufferReader {

    public static void main(String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name: ");
        String name = br.readLine();
        System.out.println("Hello!" + name);

        System.out.println("Enter your age ");
        int age = Integer.parseInt(br.readLine());                                  // Integer.parseInt - method that converts String containing digits into actual integer value
        System.out.println("Hii " + name + " you are " + age +" years old." );

        br.close();
    }
}
