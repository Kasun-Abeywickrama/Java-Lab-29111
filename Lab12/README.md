<h3>Questuion :</h3>

Consider the following scenario: You are tasked with implementing a Java program to simulate a simple traffic light system using multithreading. The traffic light consists of three colors: Red, Yellow, and Green, Each color should be represented by a separate thread. The traffic light should follow the sequence of Red (5 seconds)-> Green (10 seconds) Yellow (2 seconds)- >Red, and so on.

Write a Java program that uses multithreading to implement the traffic light system with the following requirements:

1. Define three classes, RedLightThread. Greenlight Thread, and Yellowght Thread, each representing a thread for the corresponding color.

2. Each thread should run in a loop to simulate the sequence of traffic light colors and use the Thread sleep() method to control the duration of each color. The Thread sleep) method should be called inside a try-catch block to handle the InterruptedException

3. Implement the run() method for each thread to print the name of the color (e.g. "Red Light", "Green Light", or "Yellow Light") when it is active and sleep for the specified duration for that color.

4. Use the Thread.start() method to start each thread and ensure they run concurrently.

5. In the main program, create instances of Redlight Thread, Greenlight Thread, and Yellowlight Thread, and start them using the start() method.

The program should run indefinitely, simulating the traffic light sequence in a loop.