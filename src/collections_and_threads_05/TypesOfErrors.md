1. Compile-time Error (Syntax Errors)
- it happens when we break the rules of programming language. Like bad grammar or english.
- ex System.out.Println() - here 'p' in print is capital - it will give syntax error.

2. Run-time Errors (Exceptions)
- it occurs during the execution of code even if the code looks corrects 
- x = 10;
- y = 0;
- z= x/y ;
- it will give run-time error
- Generally happens when - divided by zero, accessing invalid syntax, file not found.
- Exceptions - Are runtime errors that can be handled or manage to avoid that program doesn't crash

3. Logical Errors
- these are the trickiest errors. The program runs without crashing but the result is incorrect.
- Ex - area of rectangle
- int a = 3;
- int b = 5;
- int area = a+b;
- System.out.println(area);
- output : 8 (incorrect output because of logical error)
- fix - area = a*b;
- then output : 15;(correct)