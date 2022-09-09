import java.io.*;

public class Save
    {
    static File pass = new File("Password.txt");


    public static void Save() throws IOException
        {
        FileWriter fw = new FileWriter(pass);
        if (!pass.exists())
            {
            pass.createNewFile();
            }
        fw.write("for security reasons,you can only storage one password at a time\n");
        fw.append(PasswordGenerator.finalPassword);

        fw.close();

        }
    }

