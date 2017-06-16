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
