import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class stringarraysearch {
    public static void main(String[] args) throws FileNotFoundException {
        String[] str={"iKHHErVbrdqNBmKucAfyBYZaNqaVtj","KduazXnmpcjGncKFtMdpzcPNdaUSVu","xXmzfQzknweaHwUqgYwVMujHqCvbBm","uLtWFJYZDySAZVxjPttAimEvEiXBNL","dNTTFpbgNKbHVwvLnKaPxqUvmAHxXt","zBUtYPqSXqeQWVhWQmFkRrtvzDqYrm","itHrKJDxUnZdfENeVWJDQqzEmTzNQb","fFaCwdJjRBcCWAqBAanbknCYGRwqjc","PxbUnExBKqdJZQJXXcAEzZPjPqiddm","fiBkFMcScfBhAVjdqtkDyBFKuxvgab"};
        File file = new File("Day-7\\String.txt");
        Scanner in=new Scanner(file);
        for (int i = 0; i <str.length; i++) {
            String Stri = in.nextLine();
            System.out.print("Enter your String:"+Stri);
            System.out.println("Your string's index is:"+search(str, Stri)+"\nyour String is:"+str[search(str, Stri)]);
        }
    }
    static int search(String[] str,String Stri){
        int index=-1;
        for (int i = 0; i < str.length; i++) {
            if (Objects.equals(str[i], Stri)){
                index=i;
                break;
            }
        }
        return index;
    }
}
