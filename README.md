# SE8ProgrammerI

This repository is a compilation of notes and problems that I found useful on my journey to taking the Java SE 8 Programmer I certification. It is in no way thorough but contains brief explanations and quick bullets that I found to be important. I follow the OCA: Java SE 8 Programmer I Study Guide by Jeanne Boyarsky and Scott Selikoff. 

### Chapter 1 : Building Blocks 
* Java class structure:
    - fields and methods within a class are called members
    - you can put more than one class in the same file but
    one of the classes MUST be public and the public class MUST match the name of the file

* main() method:
    - javac NameOfClass.java ==> compiles java code to bytecode (NameOfClass.class)
    - NameOfClass.class is interpreted by the JVM
    - static: binds a method to its class; main method MUST be static
    - String[] args == String... args == String args[] (Space separated string of arguments)

* Package declaration and imports:
    - wildcard(*) imports all classes in a package
    - package.package.class.* is INVALID
    - package.package.* is VALID
    - import package.package.BLUE; import package.BLUE; ==> CONFLICTS/INVALID
    - import package.*; package.package.BLUE; ==> VALID; explicit class name takes precedence over wildcard
    - redundant imports: java.lang.*; java.util.*

* Objects:
    - Objects are a runtime instance of a class in memory.
    - Constructors have NO return type and match the name of the class
    - For MOST classes you don't need to code a constructor.

* Default initializing:
    - When creating a new object, fields and instance initializer blocks
     (code blocks {} outside of methods) are run in the order they appear
    - Constructors run after
    - Local variables are variables inside methods and they MUST be initialized
    - Instance/Class variables are variables inside Classes and they DO NOT need to be initialized
        although you may choose to do so
    - variables sent through parameters of a method are ALSO considered local variables

* Primitives:

   | keyword    |        type        |       default    |
   | ---------- |   ---------------- |   -------------- |
   | -boolean   |    true/false      |         false    |
   | -byte      |    8bit integral   |         0        |
   | -short     |    16bit integral  |         0        |
   | -int       |    32bit integral  |         0        |  
   | -long      |    64bit integral  |         0        |
   | -float     |    32bit floating  |        0.0f      |   
   | -double    |    64bit floating  |        0.0       |
   | -char      |    16bit unicode   |       '/000x'    | 

NOTE: byte x = 2; byte y = 4; int z = x + y;
essentially you can go from a lower bit primitive type to a higher
bit primitive type. However, if you go from a higher bit primitive type
(e.g. int x=2; int y=4; byte z = (byte)) you MUST
cast it to the appropriate type.

when you explicity assign values to numerical primitives, Java calls this
a literal and assumes that you are assigning an int. If you are assigning a
type that is LARGER than an int (e.g. long, float, double) you should
identify it with the appropriate type (e.g. 12345678L, 12345678f, 12345678.0)

add special numerical literals by this convention...
    - octal : add 0 as prefix (e.g. 017)
    - hexadecimal : add 0x as prefix (e.g. 0xFF)
    - binary: add 0b or 0B as prefix (e.g. 0b101)

 NOTE: java 7 and up lets you add underscore as long as one underscore
 is between two digits (e.g. 1_000 NOT 1000_) essentially used to replace commas -- improve readability

* Identifiers:
    - identifier name MUST begin with letter/symbol (e.g. $ or _)
    - subsequent characters MAY be numbers
    - cannot use reserve words

* Elements in Class
    1. package declaration (package abc;)
    2. import statements
    3. class declaration
    4. field declarations
    5. methods

    (NOTE: orders of 4 and 5 are interchangeable)

* Garbage Collection:
    - java collects garbage when references are no longer pointing to an object
    - OR all references are outside the scope of the object
    - finalize() gets called when garbage collector tries to collect the object: It might get
    called but WONT be called twice

* Benefits of Java:
    - Object oriented
    - Encapsulation
    - Platform Independent
    - Memory Management
    
### Chapter 2 : Operators and Statements 

* Java Operators:
    - Operators listed by decreasing precedence: 
    
            |   Operators   |       Type        |
            |---------------|-------------------| 
            |   (), []. .   |   Paranthetical   |
            |   i++,i--     |   Postfix Unary   |
            |   ++i, --i    |   Prefix Unary    |
            |   * ,/ ,%     |   Multiplicative  |
            |   +,-         |   Additive        | 
            |   <<, >>      |   Shift           |
            |   <,<=,>,>=   |   Relational      |
            |   ==, !=      |   Equity          |
            |   &           |   Bit AND         |
            |   ^           |   Bit XOR         |
            |               |   Bit OR          |
            |   &&          |   Logical AND     |
            |               |   Logical OR      |
            |   ?:          |   Ternary         |
            |   =           |   Assignment      |

    - Numeric Promotion Rules:
     1. if two values have different types ==> java will promote one of the values
        to the larger of the two types
        (e.g. int x=1; long y = 33; x+y //result type is long)

     2. if one value is an integral and the other is a float ==> java will
        promote integrals to floats
        (e.g. double x = 29.1, float y = 2.1; x+y //result type is float)

     3. when byte, short, and char are used with a binary arithmetic operator (e.g. +, -, * ,..)
        ==> java promotes them to type int
        (e.g. short x = 10, y =3; x + y //type of int)
       

* Unary Operators:
    - postfix: i = i++ (return value then increment)
    - prefix: i = ++i (increment then return value)

* Casting:
    - NOTE: shorts are automatically promoted to ints when used with a binary operator
    short x = 10
    short y = 3
    short z = x * y <-- int // compilation error
    short z = (short) (x * y);

* Logic Operators:
    boolean x; boolean y;
    x & y == x && y (for booleans ONLY!)
    x | y == x || y

* Equality:
    int x = 4;
    double y = 5.00;
    - (x == y //true) because x is promoted to a double
    - equality does not work on different types

* Java Statements: For the purposes of the exam, you will need to know the proper syntax of these statements.
    NOTE: Curly braces required for multi-line statements, optional for single lined statement! (Applies to if, if else, 
    while, do-while, for, for each) 
    
    - Switch statement:
    ```java
        switch(variableToTest) { //<-- required!
            case final variable:
                //branch
                break; //<-- optional!
            default: //<-- can appear anywhere within statement
                //branch
            case "string literal":
                //branch
        }
        //NOTE: all cases must match the type of the variableToTest!
    ```

    - Do-While statement: statement block done first, then boolean is checked!
    ```java
        do {
            //does stuff
        } while (booleanExpression);
    ```

    - For statement:
    ```java
        for(initializer; booleanExpression; updateStatement) {
            //body
        }
        //NOTE: all components of For statement (initializer, boolean expression and update statements)
        //are ALL optional!
    ```

    - For each statement:
    ```java
        for(dataTYpe instance : collection) {
            //does stuff! 
        }
        //NOTE: collection must either be an array or a java Iterable object!
    ```


