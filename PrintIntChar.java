// Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
// For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).



public class PrintIntChar {
    
    public static void printNC(int n, char c){
        System.out.print(n);
        System.out.println(c);
    }

    public static void printNC(char c, int n){
        System.out.print(n);
        System.out.println(c);
    }
    public static void main(String[] args){
        printNC(28,'a');
        printNC('c',6);
    }
}
