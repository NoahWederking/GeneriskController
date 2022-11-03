import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);


    public void println(String msg){
        System.out.println(msg);
    }
    public void print(String msg){
        System.out.println(msg);
    }
    public String readString(){
        return sc.nextLine();
    }

    public String readString(String msg){
        print(msg);
        return readString();
    }





}
