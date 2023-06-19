<h3>Question</h3>

Try following code. What is the outcome? Why?

Class 01: 	 
<br>final class Student {  	 	 
	<br>final int marks = 100;
	<br>final void display();
<br>}

<br>Class 02:
<br>class Undergraduate extends Student{<br>

<br>}

<h3>Answer</h3>

The reason for the error is that the final keyword is used with the void display() method, which means the method cannot be overridden in any subclass. However, no implementation of the display() method is provided in the code.<br>

The Student class is marked as final, which means it cannot be subclassed. So, the Undergraduate class cannot inherit from the Student class, and the code will result in a compilation error.

