# Intro to (Core) Java

* Object-oriented Language (OOP) - instead of writing code as linear instructions, you write code as in discrete units of related code and leverage the relationships between the units of code.
* Platform independent - you only have to write your code once and it can work on any system (PC, Mac, Unix)
* JVM - Java Virtual Machine - translator between the code and the machine
* (OOP) Class - is the blueprint and an instance is the actual object. From a single instance you can create many objects
  
* Java is a HIGH-LEVEL programming language that utilizes Object Orientation that easily allows us to reuse code throughout our application.
<table>
<tr>
<th>High-Level Language</th> <th>Low-Level Language</th>
</tr>
<tr>
<td style="color: green; font-size: larger;">Easy for humans to read, write and modify</td>
<td style="color: red; font-size: larger;">Hard for humans to read, write and modify</td>
</tr>
<tr>
    <td style="color: red; ">Slower performance </td>
    <td style="color: green; font-size: larger;">Greater performance </td>
</tr>
<tr>
    <td style="color: green; font-size: larger;">Flexible Syntax and easier to rea</td>
    <td style="color: red; font-size: larger;">Harder to read and write as it is in binary</td>
</tr>
<tr>
    <td style="color: red; font-size: larger;">Programs run slower as they make worse use of the CPU and are not very memory efficient.</td>
    <td style="color: green; font-size: larger;">Direct control over the CPU means memory use is more efficient, and programs run faster.</td>
</tr>
<tr>
    <td style="color: green; font-size: larger;">You do not have to have an understanding of how hardware components work.</td>
    <td style="color: red; font-size: larger;">Less support and hard to learn.</td>
</tr>
</table>

* Java is object-oriented meaning that it has the constructs of classes and objects built into the language. It also allows us to use various principles of object-oriented programming.
* Java is a strongly typed language meaning that our variables and method types must be declared in advance.  
* To run our code, it has something called the Just-In-Time Compiler (JIT). The JIT turns your bytecode into machine code pretty much line by line.
* <p style="font-weight:bolder;"><span style="color: gold;">Compile Time</span> - when source code is converted at one time to bytecode. So as I type the source code  it is being compiled.</p> 
* <p style="font-weight:bolder;"><span style=" color: gold;">Runtime</span> - this is when Java uses the JIT, the bytecode that the developer wrote is then turned into instructions for the machine to execute.</p> 

## <h2 style=" font-weight: bolder; color: blue">Java: Why Use It?</h2>

<table>
    <tr style="font-weight: bolder; font-size: larger;">
        <th style="color: green; font-weight">Pros</th>
        <th style="color: red;">Cons</th>
    </tr>
    <tr>
        <td><span style="color: green; font-weight: bolder;">Automatic Memory Management</span> - This means that Java uses less memory space and stored memory when it is not being used. It has automated garbage collection, meaning that the developer does not have to remove objects from memory that are not being used.</td>
        <td><span style="color: red; font-weight: bolder;">Automatic Memory Management</span> - It would be helpful if, as the developer, we could control where memory was being stored or be able to call the garbage collector. Unfortunately, this is both a blessing and a curse.</td>
    </tr>
    <tr>
        <td><span style="color: green; font-weight: bolder;">Write Once Run Anywhere</span> - Java can be run literally on any system that has a Java Runtime Environment. So ultimately any system that has Java installed on it. These include Macs, Windows, Linux, etc. Most computers have Java installed on them. If not you can install it.</td>
        <td><span style="color: red; font-weight: bolder;">Compile Time</span> - It takes time to build your project due to the steps required to build the project.</td></th>
    </tr>
    <tr>
        <td><span style="color: green; font-weight: bolder;">Widely Used</span>   - it is accessible through many different systems, programs, and applications, so it is easier to find resources to help solve problems.</td>
        <td><span style="color: red; font-weight: bolder;">Forces Object Orientation</span> - Why would this be a disadvantage, you may be wondering since we know that Java is an Object-Oriented language? Well, the answer is: There is an overhead for procedural code. For instance, we must have a main method in our code. Also, multiple static method implementation can create that overhead.</td>
    </tr>
    <tr>
        <td><span style="color: green; font-weight: bolder;">Extensive Resources Available</span> - Java is open source. This means there is a large community of people and websites out there to help learn the language. It has extensive API and Libraries at your fingertips. These APIs and libraries allow for easy data manipulation and are super helpful.</td>
        <td><span style="color: red; font-weight: bolder;">Strongly Typed</span> - Unlike some languages where you can change the type of data throughout your code, in Java, you have to declare your type explicitly, and it is not as easy to change as in some other languages.</td>
    </tr>
    <tr>
        <td><span style="color: green; font-weight: bolder;">Easy to Learn</span> - Java was designed to be easy to use and is, therefore, easier to write, compile, debug, and learn than other programming languages. It is a C-based language.</td>
        <td><span style="color: red; font-weight: bolder;">Forces Object Orientation</span> - Why would this be a disadvantage, you may be wondering since we know that Java is an Object-Oriented language? Well, the answer is: There is an overhead for procedural code. For instance, we must have a main method in our code. Also, multiple static method implementation can create that overhead.</td>
    </tr>
    <tr>
        <td><span style="color: green; font-weight: bolder;">Object-Oriented</span> - Java allows you to write code that can be reused??throughout your application.</td>
        <td><span style="color: red; font-weight: bolder;">Learning Curve</span> - While Java is easy to understand,??it requires retraining your mind to think objectively, which can take some people time to adjust. Also, the process of different Object-Oriented Concepts can take a bit of time to grasp fully.</td>
    </tr>
</table>

* <p><span style="color: gold; font-weight: bolder;">Platform Independence</span> - has automatice Memory Management and Write Once Run Anywhere</p>
  



## <span style="color: blue; font-weight: bolder;">Package Declaration:</span>
* <span style="color: gold; font-weight: bolder;">Packages</span> are folders in Java.
* Java packages must correspond to folders in your file system. When working in most IDEs (Integrated Development Environment), the folders will be automatically generated when you create a new package.
#### <span style="color: gold; font-weight: bolder;">User-Defined Packages</span>
<code>com.revature.mypackage</code>
* Packages follow a naming convention of <span style="color: gold; font-weight: bolder;">lowercase characters separated by periods in the reverse way you would specify a web domain</span>
* every  <span style="color: gold; font-weight: bolder;">(period or dot) .</span> included in my package name corresponds to a new nested folder.
* Whenever you create a Java class outside of any package and do not specify a package declaration, the class is automatically in the default package.
  

* Whenever you create a Java class outside of any package and do not specify a package declaration, the class is automatically in the default package.
* The package declaration must ALWAYS be the <span style="color: gold; font-weight: bolder;">first (non-commented) line</span> in a .java file.

### <span style="color: brown; font-weight: bolder;">Terminology</span>
* <span style="color: gold; font-weight: bolder;">Package</span> ??? a name for a grouping of classes and interfaces in a namespace
* <span style="color: gold; font-weight: bolder;">Class</span> ??? the core type in Java that defines the implementation of a particular kind of object; it defines instance and class variables and methods, as well as specifies the interfaces it implements and the immediate superclass of the class, by default Object: (blueprint of our??objects)

<code>
    public class Foo{

    }
</code>

*  <span style="color: gold; font-weight: bolder;">Namespace</span> ??? an area of the program defined by packages, with established certain visibility rules



## <span style="color: lightblue; font-weight: bolder;">Imports</span>
* By default, you have access to everything in the <span style="color: gold; font-weight: bolder;">java.lang</span> package and the package within which your class resides from any class in Java.
* If you are importing a specific class from a package, you can do this by using the fully-qualified name.
* The <span style="color: gold; font-weight: bolder;">fully-qualified name</span> for a class or interface is the package name followed by the class/interface name, separated by a period. It helps to differentiate similarly named classes from one another.
<pre>
//This is a package declaration
<code style="color: green;">
package com.revature;
</code>
//imports a Class from a particular package
<code style="color: green;">
import com.revature.mypackage.HelloWorld; 
</code>

public class Main {

public static void main(String[] args) {
  System.out.println( <code style="color: green;">HelloWorld</code>.hello("What is your name"));

  }

}
</pre>

## <span style="color: lightblue; font-weight: bolder;">Print Statements</span>

### <span style="color: brown; font-weight: bolder;">Terminology</span>

* <span style="color: gold; font-weight: bolder;">debugging Statement</span> - typically a method or function, allowing text to be printed to the Developer Console.
* <span style="color: gold; font-weight: bolder;">Command-line tool</span> - typically a method or function, allowing text to be printed to the Developer Console.
* <span style="color: gold; font-weight: bolder;">System.out.print()</span> - prints the text on the current line without moving to a new line.
* <span style="color: gold; font-weight: bolder;">System.out.println()</span> - prints the text on the current line and adds a "newline" character at the end of the printed statements.

## <span style="color: lightblue; font-weight: bolder;">Data Types</span>

* <span style="color: gold; font-weight: bolder;">Data Type</span> - a special label for how the program will store data.
* <span style="color: gold; font-weight: bolder;">String</span> - a alphanumerical sequence.
* <span style="color: gold; font-weight: bolder;">Integer</span> - a numerical sequence.
* <span style="color: gold; font-weight: bolder;">Double / Float</span> - a fractional or decimal number sequence.

<table>
    <tr>
        <th>Primitive Type</th>
        <th>Size</th>
        <th>Description</th>
        <th>Example Values</th>
    </tr>
    <tr>
        <td>Boolean</td>
        <td>Not specified, but thought of as 1 bit.
        Technically depends on the JVM.</td>
        <td>represents true and false values</td>
        <td>True <br> False</td>
    </tr>
    <tr>
        <td>byte</td>
        <td>8-bit</td>
        <td>numerical, integral value - a whole number</td>
        <td>1 <br> 4</td>
    </tr>
    <tr>
        <td>short</td>
        <td>16 bit</td>
        <td>signed numerical, integral value - a whole number</td>
        <td>-10<br> 0 <br> 1</td>
    </tr>
    <tr>
        <td>char</td>
        <td>16 bit</td>
        <td>unsigned numerical, Unicode character</td>
        <td>'3'<br>'d'<br>'!'</td>
    </tr>
    <tr>
        <td>int</td>
        <td>32 bit</td>
        <td>This is the default datatype of any negative or positive whole number given directly (as a literal).</td>
        <td>-45909<br>230<br>4_000</td>
    </tr>
    <tr>
        <td>long</td>
        <td>64 bit</td>
        <td>Note that is the | is an L not a 1.</td>
        <td>-45909L<br>230l</td>
    </tr>
    <tr>
        <td>float</td>
        <td>32 bit</td>
        <td>floating-point value a decimal number</td>
        <td>1.0f<br>-4.5f</td>
    </tr>
    <tr>
        <td>double</td>
        <td>64 bit</td>
        <td>floating-point value- a decimal number; this is the default datatype of any decimal number given directly (as a literal)</td>
        <td>1.0 <br>-4.5</td>
    </tr>
    <tr>
        <td>They are all stored in a fixed amount of memory, and that memory size will influence their range of values. The values of these data types are called literals.</td>
    </tr>
</table>

### <span style="color: brown; font-weight: bolder;">Terminology</span>
* <span style="color: gold; font-weight: bolder;">literal</span> - a source code representation of a fixed value.
* <span style="color: gold; font-weight: bolder;">method</span> - a particular function implemented in a Java class
  
  <code>

    public int returnInt(){<br>
        return 5; // Will always return the value 5
    }
  </code>
* <span style="color: gold; font-weight: bolder;">primitive type</span> - one of the following non-class variable type: boolean, byte, char, double, float, int, long or short
* <span style="color: gold; font-weight: bolder;">variable</span> - an item of data associated with a specific type

<code>

    int x = 5;
    byte b = 2;
    short s = 45;
    long 1 = 342342342;
    float f = 546.324f;
    double d = 34.5;
    char val = 'A';
    String dip = 'Salsa';

</code>

## <span style="color: lightblue; font-weight: bolder;">Variables</span>

* <span style="color: gold; font-weight: bolder;">Variable</span> - essentially named containers for some piece of information.
* A variable has a <span style="color: gold; font-weight: bolder;">name</span>, <span style="color: gold; font-weight: bolder;">value</span>, and a <span style="color: gold; font-weight: bolder;">type</span> or <span style="color: gold; font-weight: bolder;">datatype</span>.

<code>
    String myFavoriteColor = "Orange";<br>
    myFavoriteColor = "Orange";
</code>


### <span style="color: brown; font-weight: bolder;">Terminology</span>
* <span style="color: gold; font-weight: bolder;">assign</span> - to give a value (Symbol <span style="color: gold; font-weight: bolder;">=</span> is the assignment operator)
* <span style="color: gold; font-weight: bolder;">Variable</span> -  an item of data associated with a specific type

## <span style="color: lightblue; font-weight: bolder;">Creating Variables</span>

<pre>
    datatype variableName;
</pre>

## <span style="color: lightblue; font-weight: bolder;">Storing a Value in a Variable</span>

<pre>
    int myVariable;
    myVariable = 8;
</pre>


## <span style="color: lightblue; font-weight: bolder;">Accessing the Value of a Variable</span>

<code>
    int anotherVariable = 5;
    System.out.println(anotherVariable); //console logs 5;
</code>

## <span style="color: lightblue; font-weight: bolder;">Updating the Value of a Variable</span>

<code>
    anotherVariable = 80;
</code>


## <span style="color: lightblue; font-weight: bolder;">Variable Naming Rules:</span>
1. We do not use java keywords or reserved words for variable names.
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
2. We do not begin our variable names with digits.
3. Our variable names contain only letters, digits, $, and _.
4. They cannot include any white space.


## <span style="color: lightblue; font-weight: bolder;">Terminology</span>
* <span style="color: gold; font-weight: bolder;">Declaration</span> -  a statement that establishes an identifier and associates attributes with it, without necessarily reserving its storage or providing the implementation. We can give it a value later in our code by assigning a value to the declared variable.

    <code>
        int x;
        x = 5;
    </code>

* <span style="color: gold; font-weight: bolder;">Initialize</span> - set to the value or put in the condition appropriate to the start of an operation. So this is the starting point of our variable when we give it a value. We initialize the variable to a value.

    <code>
        int name;
    </code>

* <span style="color: gold; font-weight: bolder;">Main Method</span> - a starting point for Java applications there should only be one method that looks like this in your code:
  
  <code>
    public static void main(String[] args){<br>
        //body of code.<br>
    }
  </code>

* <span style="color: gold; font-weight: bolder;">Initialize</span> - set to the value or put in the condition appropriate to the start of an operation. So this is the starting point of our variable when we give it a value. We initialize the variable to a value.

## <span style="color: lightblue; font-weight: bolder;">Gathering User Input</span>

* <span style="color: gold; font-weight: bolder;">Scanner</span> - class is imported from the java.util package allowing us to get user input from our keyboard and store it into a variable. It can accept almost all primitive type values.

#### <span style="color: lightblue; font-weight: bolder;">How to use the Scanner class</span>
`https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html`

<pre>

    <span style="color: orange;font-weight: bolder;">import</span> java.util.<span style="color: green;font-weight: bolder;">Scanner</span>;

    class Main {
        public static void main(String[] args) {
            // syntax for creating a Scanner object
            <span style="color: green;font-weight: bolder;">Scanner sc = new Scanner(System.in);</span>

            // give the user directions in the console
            System.out.println("Enter a number: ");
        }
    }

</pre>

#### <span style="color: lightblue; font-weight: bolder;">Scanner Methods</span>
* Use the <span>.hasNext()</span> method to check if there are more tokens(information to process).
* Use the <span style="color: green;font-weight: bolder;">.next()</span> method to retrieve the subsequent tokens(data point).
* Use the <span style="color: green;font-weight: bolder;">.nextInt()</span> method to get an integer value from the keyboard.
* Use the <span style="color: green;font-weight: bolder;">.nextLine()</span> to get a String from the keyboard.
* Use the <span style="color: green;font-weight: bolder;">.nextDouble()</span> to get a double value from the keyboard.

##### <p style="color: lightblue;font-weight: bolder;">To use <span style="color: green;font-weight: bolder;">Scanner</span> to get user's input</p>

* To use the Scanner class, we need to create a Scanner object. Objects are complex data types. Unlike primitive values representing a singular value, objects typically hold properties and methods. Properties are values that the objects store and methods are the functionality that the objects can use. Therefore, we need to create a Scanner object to use its methods.
  

<pre>
    <span style="color: orange;font-weight: bolder;">import </span>java.util.Scanner;

    class Main {
        <span style="color: red;font-weight: bolder;">public static void</span> <span style="color: yellow">main</span>(String[] args){
            
            Scanner sc = new Scanner(System.ini);

            //give the user directions in the console
            System.out.println("<span style="color: orange;">Enter a number: </span>");
            
            // get the user's input
            int num = sc.nextInt();
            System.out.println("User's number is: " + num);

        }
    }

</pre>

##### <p style="color: lightblue;font-weight: bolder;">Closing <span style="color: green;font-weight: bolder;">Scanner</span> object</p>
* Scanner objects take in an input stream. Input streams are streams of data that are taken from a source and given to a destination. In our case, Scanner is using System.in as its input stream. This means the scanner object is continuously waiting for and receiving data from the console and giving our program that data to work with. Because this is a continuous process, it doesn???t end until we explicitly say so.
  
<pre>
  import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // syntax for creating a Scanner object
    Scanner sc = new Scanner(System.in);

    // give the user directions in the console
    System.out.println("Enter a number: ");
    // get the user's input
    int num = sc.nextInt();
    System.out.println("User's number is: " + num);

    // close scanner object
        <span style="color: green; font-weight: bolder;"> sc.close(); </span>
  }
}
</pre>

## <p style="color: lightblue;font-weight: bolder;">Terminology</p>
* <span style="color: gold;font-weight: bolder;">object</span> - an instance of a particular class; also the core concept of the OOP.
* <span style="color: gold;font-weight: bolder;">package</span> - a name for a grouping of classes and interfaces in a namespace.
* <span style="color: gold;font-weight: bolder;">primitive type</span> - one of the following non-class variable type: boolean, byte, char, double, float, int, long or short.
* <span style="color: gold;font-weight: bolder;">variable</span> - an item of data associated with a specific type. 
* <span style="color: gold;font-weight: bolder;">Input Streams (System.in)</span> - streams of data that are taken from a source and given to a destination. The Scanner object is continuously waiting for and receiving data from the console and giving our program that data to work with.
* <span style="color: gold;font-weight: bolder;">sc.close()</span> - an method to close or stop the Scanner object. 
   

## <p style="color: lightblue;font-weight: bolder;">Switch Scan Method</p>
<pre>

class SwitchScan {
  public void scannerSwitchExample() {
    Scanner scan = new Scanner(System.ini);
    System.out.println("What is the time of Day?");

    String input = scan.next();
    switch (input.toLowerCase()) {
      case "morning":
        System.out.println("Time for breakfast!");
        // Other logic can go here...
        break;
      case "afternoon":
        System.out.println("A nice day for a walk!");
        // Other logic can go here...
        break;
      case " evening":
        System.out.println("Its about bed time!");
        // Other logic can go here...
        break;
      default;
        System.out.println("Sorry, I didn't understand that, but have a nice day anyway!");
    }
  }
}
</pre>

## <p style="color: lightblue;font-weight: bolder;">Loop Scan Method</p>
<code>
import java.util.Random;
import java.util.Scanner;

class LoopScan {
  public void scannerLoopExample() {
    Random r = new Random();
    int randNum = r.nextInt(11);
    Scanner scan = new Scanner(System.in);
    System.out.println("Guess a number between 0 and 10");
    int guess = scan.nextInt();

    while(guess != randNum) {
      if(guess > randNum) {
        System.out.println("Too High");
      }
      if(guess < randNum) {
        System.out.println("Too Low");
      }

      System.out.println("Guess Again!");
      guess = scan.nextInt();
    }

    System.out.println("Nice job!");
  }
}
</code>

# <p style="color: lightblue;font-weight: bolder;">Mutating Information</p>

## <p style="color: lightblue;font-weight: bolder;">What is an operator?</p>
* Operators - special symbols applied to a set operands to return a result.
* 

## <p style="color: lightblue;font-weight: bolder;">Categories of Operators</p>

#### <p style="color: lightblue;font-weight: bolder;">Mathematical Operators</p>

<table>
    <tr>
        <th>
            <td style="color: gold; font-weight: bolder">Name</td>
            <td style="color: gold; font-weight: bolder">Symbol</td>
            <td style="color: gold; font-weight: bolder">Description</td>
            <td style="color: gold; font-weight: bolder">Example</td>
            <td style="color: gold; font-weight: bolder">Result</td>
        </th>
    </tr>
    <tr>
        <td>Addition</td>
        <td>+</td>
        <td>returns the sum of two operands</td>
        <td>1 + 2</td>
        <td>3</td>
    </tr>
    <tr>
        <td>Subtraction</td>
        <td>-</td>
        <td>returns the sum of two operands</td>
        <td>2 - 1</td>
        <td>1</td>
    </tr>
    <tr>
        <td>Division</td>
        <td>/</td>
        <td>returns the quotient of two operands</td>
        <td>15 / 3</td>
        <td>5</td>
    </tr>
    <tr>
        <td>Multiplication</td>
        <td>*</td>
        <td>returns the product of two operands</td>
        <td>1 * 2</td>
        <td>2</td>
    </tr>
    <tr>
        <td>Modulo</td>
        <td>%</td>
        <td>returns the remainder of two operands</td>
        <td>5 % 4</td>
        <td>1</td>
    </tr>

</table>


#### <p style="color: lightblue;font-weight: bolder;">Logical Operators</p>

<table>
    <tr>
        <th>
            <td style="color: gold; font-weight: bolder">Name</td>
            <td style="color: gold; font-weight: bolder">Symbol</td>
            <td style="color: gold; font-weight: bolder">Description</td>
            <td style="color: gold; font-weight: bolder">Example</td>
            <td style="color: gold; font-weight: bolder">Result</td>
        </th>
    </tr>
    <tr>
        <td>Logical NOT</td>
        <td>!</td>
        <td>returns the opposite boolean value of an operand</td>
        <td>!true</td>
        <td>false</td>
    </tr>
    <tr>
        <td>Logical AND</td>
        <td>&&</td>
        <td>returns true only if both operands are true</td>
        <td>true && true</td>
        <td>true</td>
    </tr>
    <tr>
        <td>Logical OR</td>
        <td>||</td>
        <td>returns true if one of two operands is true</td>
        <td>false || true</td>
        <td>true</td>
    </tr>
</table>


#### <p style="color: lightblue;font-weight: bolder;">Other Operators</p>

<table>
    <tr>
        <th>
            <td style="color: gold; font-weight: bolder">Name</td>
            <td style="color: gold; font-weight: bolder">Symbol</td>
            <td style="color: gold; font-weight: bolder">Description</td>
            <td style="color: gold; font-weight: bolder">Example</td>
            <td style="color: gold; font-weight: bolder">Result</td>
        </th>
    </tr>
    <tr>
        <td>Pre-Increment</td>
        <td>++x</td>
        <td>Increases an operands value by 1 and assigns the new value to the operand in the current statement.</td>
        <td>x =5 <br>System.out.println(++x);</td>
        <td>6</td>
    </tr>
    <tr>
        <td>Post-Increment</td>
        <td>x++</td>
        <td>Increases an operands value by 1 and assigns the new value to the operand in the next statement.</td>
        <td>x = 5;<br> System.out.println(x++);</td>
        <td>5 <br>6</td>
    </tr>
    <tr>
        <td>Pre-Decrement</td>
        <td>--x</td>
        <td>Decreases an operands value by 1 and assigns the value to the operand in the current statement.</td>
        <td>x = 5; <br> System.out.println(--x);</td>
        <td>4</td>
    </tr>
    <tr>
        <td>Post-Decrement</td>
        <td>x--</td>
        <td>Decrease an operands value by 1 and assigns the new value to the operand in the next statement.</td>
        <td>x = 5; <br>
            System.out.println(x--);<br>
            System.out.println(x);</td>
        <td>5 <br> 4</td>
    </tr>
    <tr>
        <td>Shorthand</td>
        <td> +=, -=, /=, *= </td>
        <td>Uses the current value of the first operand to perform a mathematical operation with the second operand. The result is assigned to the first operand.</td>
        <td>x = 2; <br>x += 3; <br>System.out.println(x);</td>
        <td>5</td>
    </tr>
    <tr>
        <td>Not Equal To</td>
        <td> != </td>
        <td>returns true if both operands have different values</td>
        <td>1 != 2</td>
        <td>true</td>
    </tr>
</table>


#### <p style="color: lightblue;font-weight: bolder;">Relational Operators</p>

<table>
    <tr>
        <th>
            <td style="color: gold; font-weight: bolder">Name</td>
            <td style="color: gold; font-weight: bolder">Symbol</td>
            <td style="color: gold; font-weight: bolder">Description</td>
            <td style="color: gold; font-weight: bolder">Example</td>
            <td style="color: gold; font-weight: bolder">Result</td>
        </th>
    </tr>
    <tr>
        <td>Greater Than</td>
        <td>></td>
        <td>returns true if the first operand is greater than the second operand</td>
        <td>5 > 10</td>
        <td>false</td>
    </tr>
    <tr>
        <td>Less Than</td>
        <td><</td>
        <td>returns true if the first operand is less than the second operand</td>
        <td>5 < 10</td>
        <td>true</td>
    </tr>
    <tr>
        <td>Greater Than or Less Than</td>
        <td>>=</td>
        <td>returns true if the first operand is greater than or equal to the second operand</td>
        <td>2 >= 2</td>
        <td>true</td>
    </tr>
    <tr>
        <td>Less Than or Equal To </td>
        <td><=</td>
        <td>returns true if the first operand is less than or equal to the second operand</td>
        <td>2 <= 2</td>
        <td>true</td>
    </tr>
    <tr>
        <td>Equal To</td>
        <td> == </td>
        <td>returns true if both operands have the same value</td>
        <td>1 == 2</td>
        <td>false</td>
    </tr>
    <tr>
        <td>Not Equal To</td>
        <td> != </td>
        <td>returns true if both operands have different values</td>
        <td>1 != 2</td>
        <td>true</td>
    </tr>
</table>


## <span style="color: brown;font-weight: bolder;">Terminology</span>
* <span style="color: gold;font-weight: bolder;">operand</span> - an expression to which an operator applies logic.
* <span style="color: gold;font-weight: bolder;">operator</span> - in computer programming, it is something that behaves like a function, but we know them more like our normal math symbols of +, -, =, %, &&, ||, etc.
* <span style="color: gold;font-weight: bolder;">product</span> - a quantity obtained by multiplying quantities together.
* <span style="color: gold;font-weight: bolder;">quotient</span> - a result obtained by dividing one quantity by another.
* <span style="color: gold;font-weight: bolder;">return</span> - a Java keyword used to finish the execution of the method and return data to the caller.
* <span style="color: gold;font-weight: bolder;">sum</span> - the total amount resulting from the addition of two or more numbers.

## <p style="color: lightblue;font-weight: bolder;">Type Casting Variables</p>

* <span style="color: gold;font-weight: bolder;">Casting</span> - the process of converting data of one type to another.
* <span style="color: gold;font-weight: bolder;">byte</span>, <span style="color: gold;font-weight: bolder;">short</span>, <span style="color: gold;font-weight: bolder;">int</span>, and <span style="color: gold;font-weight: bolder;">long</span> represent whole number values.

<table>
    <tr>
        <caption style="color: gold; font-weight: bolder;font-size: 2em">Java's primitive Types</caption>
    </tr>
    <tr>
        <th style="font-weight: bolder;">Categorization</th>
        <th style="font-weight: bolder;">Name</th>
        <th style="font-weight: bolder;">Upper Range</th>
        <th style="font-weight: bolder;">Lower Range</th>
        <th style="font-weight: bolder;">Bits</th>
    </tr>
    <tr style=" background: darkgreen;">
        <td style="font-weight: bold;">Floating Point</td>
        <td style="color: black;">double</td>
        <td style="color: black;">Really huge positive</td>
        <td style="color: black;">Really Huge negative</td>
        <td style="color: black;">64</td>
    </tr>
    <tr style=" background: green;">
        <td style="font-weight: bold;"></td>
        <td style="color: black;"> float</td>
        <td style="color: black;">Huge positive</td>
        <td style="color: black;"> Huge negative</td>
        <td style="color: black;">32</td>
    </tr>
    <tr style=" background: brown; border-bottom: none;">
        <th style="font-weight: bold;">Integral</th>
        <td>long</td>
        <td>9,223,372,036,854,775,807</td>
        <td>-9,223,372,036,854,775,808</td>
        <td>64</td>
    </tr>
    <tr style=" background: brown;">
        <th style="font-weight: bold;border: none;"></th>
        <td>int</td>
        <td>2,147,483,647</td>
        <td>-2,147,483,648</td>
        <td>32</td>
    </tr>
    <tr style=" background: brown; ">
        <th style="font-weight: bold; border: none;"></th>
        <td>char</td>
        <td>65,535</td>
        <td>0</td>
        <td>16</td>
    </tr>
    <tr style=" background: brown;">
        <th style="font-weight: bold; border: none;"></th>
        <td>short</td>
        <td>32,767</td>
        <td>-32,768</td>
        <td>16</td>
    </tr>
    <tr style=" background: brown;">
        <th style="font-weight: bold; border: none;"></th>
        <td>byte</td>
        <td>127</td>
        <td>-128</td>
        <td>8</td>
    </tr>
    <tr style="background: darkblue;">
        <th style="font-weight: bold;">Boolean</th>
        <td>boolean</td>
        <td>No numeric equivalent</td>
        <td>true or false</td>
        <td>1</td>
    </tr>


</table>


#### <p style="color: lightblue;font-weight: bolder;">Downcasting</p>

<pre>

public class Main{

    public static void main(String args[]){
        byte a = 6;
        short b = 7;
        byte c = (byte) (a + b);

        System.out.println(c);
    }
}

</pre>

#### <p style="color: lightblue;font-weight: bolder;">Upcasting</p>

<pre>

public class Main{
    public static void main(String args[]){

    int value = 10;
    double value2 = 13.5;

    //Upcast to a double
    double sum = value + value2; //23.5
    System.out.println(sum);

    //downcast to a int
    int sum2 = value + <span style="color: gold">(int)</span>value2; //23.5
    System.out.println(sum2);
    
    byte aByte = 20;
    short aShort = 50;

    //cast the whole sum to a byte
    byte sum3 = (byte)(aByte + aShort);
    System.out.println(sum3); //70

    //cast the whole sum to a short
    short sum4 = (short)(aByte + aShort);
    System.out.println(sum4);

    }
}

</pre>



## <p style="color: brown;font-weight: bolder;">Terminology</p>

* <span style="color: gold; font-weight: bolder;">downcast</span> - a process of changing the data type from Object to the particular type, i.e., Integer: Or a datatype from something larger to something smaller.<span style="color: lightgreen; font-weight: bold;">( Reducing the variable datatype based on the value)</span> - Tell the compiler that datalose is ok.
* <span style="color: gold; font-weight: bolder;">upcasting</span> - a process of casting subtype to super type - for example from String to Object<span style="color: lightgreen; font-weight: bold;">( Increasing the variable datatype based on the value)</span>
* <span style="color: gold; font-weight: bolder;">explicit</span> - functionality done by the programmer not the JVM or language.
* <span style="color: gold; font-weight: bolder;">implicit</span> - a functionality or you can say the feature that provided by the language itself. This is done by the JVM or the tool, not the Programmer.


# <p style="color: lightblue;font-weight: bolder;">Flow Control Logic</p>
* <span style="color: gold; font-weight: bolder;">Flow Control</span> - the act of determining and manipulating the order in which your program executes written statements through special keywords and statements.

## <p style="color: lightblue;font-weight: bolder;">3 Ways a program can flow and express</p>

1. Sequences
2. Branches
3. Loops

* <span style="color: gold;font-weight: bolder;">Sequential / Procedural Flow</span> - A flow that executes statements from top to bottom, left to right, as they appear in your program.

* <span style="color: gold;font-weight: bolder;">Branches / Conditional Flow</span> - A flow that allows different pathways that your code can execute by keywords or conditions.

* <span style="color: gold;font-weight: bolder;">Looping / Repetitive Flow</span> - A flow looping or repeating structures in our programs using various keywords and statements in Java.