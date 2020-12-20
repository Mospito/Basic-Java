import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Input
        Scanner myObjName = new Scanner(System.in);  
        System.out.println("Enter username:");
        String userName = myObjName.nextLine();  

        Scanner myObjAge = new Scanner(System.in);  
        System.out.println("Enter Age:");
        String Age = myObjAge.nextLine();  

        Scanner myObjTel = new Scanner(System.in);  
        System.out.println("Enter PhoneNumber:");
        String Tel = myObjTel.nextLine(); 

        //Split
        String[] arrOfname = userName.split(" ");
        String FirstName = arrOfname[0];
        String LastName = arrOfname[1];

        //Str to int
        int AGE = Integer.parseInt(Age);


        // write your code here
        Contact myObj = new Contact(FirstName,LastName,AGE,Tel);
        System.out.println(myObj.toString());
    
    }
}
