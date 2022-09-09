
import java.util.Random;


import static java.lang.System.currentTimeMillis;

public class PasswordGenerator
    {
    public static String finalPassword;

    public static String PasswordGenerator(int input)
        {
        char[] uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] special = "!@#$%^&*()_+".toCharArray();
        char[] numbers = "1234567890".toCharArray();

        int alLength = uppercase.length;


        Random rnd = new Random(currentTimeMillis());
        char[] password = new char[input];

        for (int i = 0; i < input; i++)
            {

            int randomChar = rnd.nextInt(alLength);
            int randomNumber = rnd.nextInt(10);
            if (randomChar % 3 == 0)
                password[i] += uppercase[randomChar];
            else if (randomChar % 4 == 0)
                password[i] += special[randomNumber];
            else if (randomChar % 2 == 0)
                password[i] += numbers[randomNumber];
            else
                password[i] += lowercase[randomChar];


            }
        final String string = new String(password);
        finalPassword = string;
        return string;

        }


    }
