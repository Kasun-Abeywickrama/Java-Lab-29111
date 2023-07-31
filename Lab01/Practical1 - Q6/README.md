<h3>Question</h3>

As of java 5 the enhanced for loop was introduced. This is mainly used for Arrays. Below code contains few mistakes. First execute the code. Then identify the errors printed on the console. Rectify all the errors and execute to get the output:

	class TestEnhanceForLoop {
   	public static void mains(String args[]){
     	 int [] numbers = {10, 20, 30, 40, 50};
      		for(int x : numbers ){
        			 System.out.print( x );
         			System.out.print(",")
      		}
	 System.out.print("\n");
      	String [] names ={“James”, "Larry", "Tom", "Lacy"}
      		for( String name : names ) {
        		 	System.out.print( name );
         			System.out.print(",");


<h3>Result</h3>

10,20,30,40,50,
James,Larry,Tom,Lacy,