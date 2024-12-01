import javax.swing.*;
import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("D:\\Test1.txt");
        if (!f.exists()){
            try
            {
                f.createNewFile();
                JOptionPane.showMessageDialog(null,"File Created");

            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        System.out.println(f.getAbsolutePath());
        try {
            FileWriter fw = new FileWriter(f,true);
            PrintWriter out = new PrintWriter(fw);
            out.println("Hello User");
            out.println("I am student");
            out.println(4000);
            out.println(true);
            out.close();
            fw.close();
            JOptionPane.showMessageDialog(null,"Data written in file");

        }catch(IOException e)
        {
            System.out.println(e);
        }
try{
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    String data;
    while((data=br.readLine())!=null)
    {
        System.out.println(data);
    }
    br.close();
    fr.close();
}
catch(Exception ex)
{
    System.out.println(ex);
}

    }
}
