import java.io.*; // import java.io.*; for use of BufferedReader

class even
{
  public static void main(String args[]) throws Exception //throws Exception because BufferedReader create an exception
  {
    int num;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //this is used to enter value from user
	
    System.out.println("Enter an Integer number:");
	num=Integer.parseInt(br.readLine());//br.readLine stored only string values so convert it to integer by using Integer.parseInt
	
    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
