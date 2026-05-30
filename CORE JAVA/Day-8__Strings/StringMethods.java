

class StringMethods {
    public static void main(String[] args) 
    {
        String s1 ="Hi dear...";
        String s2 = "Hi helloo........";
        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println("Length of the string-> "+s1.length());        //10
        System.out.println("Length of the string-> "+s2.length());        //14
        System.out.println("Character at string-> "+s1.charAt(0));       //H
        System.out.println("Character at string-> "+s1.charAt(1));       //i
        System.out.println("Character at string-> "+s1.charAt(2));       // 
        System.out.println("Character at string-> "+s2.charAt(0));       //H
        System.out.println("Character at string-> "+s2.charAt(1));       //i
        System.out.println("Character at string-> "+s1.charAt(8));       // .
        System.out.println("equals at string-> "+s1.equals(s2));      //false
        String s3 = "Hello";
        String s4 = "hello";
        
        System.out.println("Equals at string-> "+s3.equals(s4));      //false
        System.out.println("EqualsIgnoreCase at string-> "+s3.equalsIgnoreCase(s4));    //true
        System.out.println("contains at string-> "+s2.contains(s1));    //false
        System.out.println("Contains at string-> "+s1.contains(s2));    //false
        System.out.println("Index value at string-> "+s3.indexOf('l'));    //2
        System.out.println("Index value at string-> "+s3.indexOf('e'));    //1
        System.out.println("Index value at string-> "+s3.indexOf('H'));    //0
        System.out.println("Index value at string-> "+s4.indexOf('h'));    //0
        System.out.println("Last Index value at string-> "+s3.lastIndexOf('o'));    //4
        System.out.println("Last Index value at string-> "+s4.lastIndexOf('o'));    //4
        System.out.println(s1.startsWith("H"));     //true
        System.out.println(s1.startsWith("Hi"));    //true
        System.out.println(s1.endsWith("i"));       //false
        System.out.println("Lower case of the String_> "+s1.toLowerCase());       //hi dear...
        System.out.println("Upper case of the String-> "+s1.toUpperCase());       //HI DEAR...
        System.out.println("Lower case of the String ->"+s3.toLowerCase());       //hello
        System.out.println("Lower case of the String ->"+s3.toUpperCase());       //HELLO
        System.out.println(s1 +" "+s2);             //Hi dear... Hi helloo........
        
        String s5 ="  Hi hello";
        System.out.println("Before trim:-> "+s5);
        
        System.out.println("After Trim:->  "+s5.trim());
        String s6 ="";
        System.out.println(s6);
        System.out.println("String s6 :-> "+s6.isEmpty());
        System.out.println("String s5 :-> "+s5.isEmpty());
        System.out.println("s6 is blank or not -> "+s6.isBlank());
        System.out.println("Compareto string case-> "+s3.compareTo(s4));
        System.out.println("ComparetoIgnorecase String-> "+s3.compareToIgnoreCase(s4));
        
        String s7 = "Hi hel";
        System.out.println(s7);
        System.out.println("Replace the Char -> "+s7.replace('i','e' ));
        System.out.println("Replace the String -> "+s7.replace("Hi" , "Hello"));
        System.out.println("SubString of -> "+s7.substring(1,4));
        System.out.println("SubString of -> "+s7.substring(0,4));
        
    }
}


/*

OUTPUT
Hi dear...
Hi helloo........
Length of the string-> 10
Length of the string-> 17
Character at string-> H
Character at string-> i
Character at string->  
Character at string-> H
Character at string-> i
Character at string-> .
equals at string-> false
Equals at string-> false
EqualsIgnoreCase at string-> true
contains at string-> false
Contains at string-> false
Index value at string-> 2
Index value at string-> 1
Index value at string-> 0
Index value at string-> 0
Last Index value at string-> 4
Last Index value at string-> 4
true
true
false
Lower case of the String_> hi dear...
Upper case of the String-> HI DEAR...
Lower case of the String ->hello
Lower case of the String ->HELLO
Hi dear... Hi helloo........
Before trim:->   Hi hello
After Trim:->  Hi hello

String s6 :-> true
String s5 :-> false
s6 is blank or not -> true
Compareto string case-> -32
ComparetoIgnorecase String-> 0
Hi hel
Replace the Char -> He hel
Replace the String -> Hello hel
SubString of -> i h
SubString of -> Hi h

=== Code Execution Successful ===
  */
