import java.io.IOException;
import java.util.Scanner;

public class Main
    {

    public static void main(String[] args) throws IOException
        {


        Scanner scanner = new Scanner(System.in);

        System.out.println("1.generate new password");
        System.out.println("2.read previous");
        int input = scanner.nextInt();

        switch (input)
            {
            case 1:

                System.out.print("password length :");
                int length = scanner.nextInt();
                PasswordGenerator.PasswordGenerator(length);
                System.out.println("your password is " + PasswordGenerator.finalPassword);
                System.out.println("do you want to save your password?");
                System.out.println("1.yes");
                System.out.println("2.No");
                input = scanner.nextInt();
                switch (input)
                    {
                    case 1 -> Save.Save();
                    case 2 -> System.out.println("exiting");
                    default -> System.out.println("Wrong input");
                    }
                break;
            case 2:

                break;
            default:
                System.out.println("Wrong input");
                break;
            }
        }
    }