class For4
{
	public static void main(String [] args){
		int i=0;
		for(i=1;i<=10;i++,++i){ //i=i+2 or i+=2.this statment is valid so for loop is running. i+2 is not a valid statement inside for loop otherwise it will be run in print statement 
		System.out.println("Hello : " +i); 
	    }
		System.out.println("Hello : " +i);
	}
}
