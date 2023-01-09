import java.util.Scanner;
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        char c=sc.next().charAt(0);
        if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
            System.out.println("Vowels");
        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("Consonants");
        }else{
            System.out.println("Not an Alphabet");
        }
        System.out.println();
    }
}
