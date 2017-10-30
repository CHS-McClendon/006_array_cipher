Julius Caesar (Roman General) is credited with our first "cipher."

This is a shift cipher, where each alpha is shifted by the same number.  For example,

key = 1
A --> B,  B --> C etc

To decipher, reverse the process:

B - 1 --> A,  C-key becomes B
------------------------------------------


---------- CLASS BeginHere ---------------


------------------------------------------

--------------CLASS CaesarCipher ---------

		//System.out.println("test, alpha length = " + alpha.length());
		//System.out.println("test, first char is: " + alpha.charAt(0));
		//System.out.println("test, last char is: " + alpha.charAt(alpha.length()-1));
		
		/*
		for (int i = 0; i < alpha.length(); i++) {
			System.out.println(alpha.charAt(i));
		}
		System.out.println("\n\n");
		
		
		for (int i=0; i < plainText.length()   ; i++) {
			
			System.out.println(plainText.charAt(i));
		}
		*/
		/*
		 * each char that I read from plainText I find the index in alpha
		 * for example, read A look up index for A get 0
		 *              read M look up index for M get 12
		 * then, add key to that index, so A index 0 becomes 0+key,
		 * and 0+key becomes my coded char
		 * let's say key = 1, then A index 0, 0 + 1 = 1, charAt 1 is B
		 * and that is my encoding
		 */
		
		//String checkSpace;
		/*checkSpace = "" + plainText.charAt(i);
			if(checkSpace.equals(" ")) {
				secretText += checkSpace;
			}
			else {
			
			index = alpha.indexOf(plainText.charAt(i));
			//System.out.println("index = " + index);
			*/
			
			
			/** Doug's Method **/
			//keyAdded = (index + key) % alpha.length();
			
			/** Will's Method
			keyAdded = index + key;
			if (keyAdded >= alpha.length()) {
				keyAdded-=alpha.length();
			}
			**/
			/*
			if (keyAdded == 27)
				keyAdded = 26;
			//System.out.println("encoded is " + alpha.charAt(keyAdded));
			 * */
			
			//secretText += alpha.charAt(keyAdded);
			


------------------------------------------
https://www.javatpoint.com/object-class

Object class in Java

The Object class is the parent class of all the classes in java by default. 
In other words, it is the topmost class of java.

The Object class is beneficial if you want to refer any object whose type 
you don't know. Notice that parent class reference variable can refer 
the child class object, know as upcasting.

Let's take an example, there is getObject() method that returns an 
object but it can be of any type like Employee,Student etc, we can use 
Object class reference to refer that object. For example:

    Object obj=getObject();//we don't know what object will be returned 
    from this method  

The Object class provides some common behaviors to all the objects such as 
object can be compared, object can be cloned, object can be notified etc. 
