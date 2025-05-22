package Strings;
/*
Strings are class
arrays are object
Sequence of characters are called strings
once string got created it can't be modified it means it cant be updated, remove or modified
Strings are created in string pool

 */
public class StringBasic {
    public static void main(String[] args) {
        //Creating string in string pool
        String a = "Hello";
        String b = "Hello";
        //Creating string in heap memory
        String aa = new String("Hello");
        String bb = new String("Hello");
        System.out.println(a==b);//true

        System.out.println(aa==bb);//false

        // '==' is use for checking address
        // '.equals()' is use for checking string

        System.out.println(aa.equals(bb));//true

    }
}
/*      SOME STRING METHODS
* length()
* charAt(int index)
* substring(int beginIndex,int endIndex)
* contains(CharSequence s)
* startWith(String prefix) / endsWith(String suffix)
* toUpperCase() / toLowerCase
* trim()
* replace(String old, String new)
* split(Stirng regex)
* equals(String anotherString)
*
*/