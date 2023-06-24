<h4>Question</h4>
Declare an interface called “MyFirstInterface”. Decalre integer type variable called “x”.  Declare an abstract method called “display()”.
<ol>
<li>Try to declare the variable with/without public static final keywords. Is there any difference between these two approaches? Why?</li>
<li>Declare the abstract method with/without abstract keyword. Is there any difference between these two approaches? Why?</li>
<li>Implement this into a class called “IntefaceImplemented” . Override all the abstract methods. Try to change the value of x inside this method and print the value of x. Is it possible for you to change x? why?</li>
</ol>

<h4>Answer</h4>
<ol>
      <li>When declaring a variable in an interface, it is by default public static final, so whether you explicitly mention these keywords or not, the variable is treated as public static final. there is no difference between the two approaches. </li>
    <li>When declaring a method in an interface, it is by default public abstract. So, whether you explicitly mention the abstract keyword or not method is treated as public abstract. There is no difference between the two approaches.</li>
    <li>In the interfaceimplemented class you cannot change the value of x because it is declared as final in the interface. the final keyword makes a variable constant. meaning its value cannot be modified once assigned. If you try to modify the variable x it will result in a compilation error.</li>
</ol>

