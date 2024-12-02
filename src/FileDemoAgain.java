import javax.swing.*;
import java.io.*;

public class FileDemoAgain {
    public static void main(String[] args) {
        File fl = new File("D:\\FileOne.txt");
        if (!fl.exists()) {
            try{
                fl.createNewFile();
                JOptionPane.showMessageDialog(null,"File Created");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        System.out.println(fl.getAbsolutePath());
        try{
            FileWriter flwr = new FileWriter(fl,true);
            PrintWriter out = new PrintWriter(flwr);
            out.println(1000);
            out.println("Divyansh Malvi");
            out.println(87.5);
            out.println(true);
            out.println('A');
            out.close();
            flwr.close();
            JOptionPane.showMessageDialog(null,"Data written in file");
        } catch (IOException e){
            System.out.println(e);
        }
        try{
            FileReader flr = new FileReader(fl);
            BufferedReader bfr = new BufferedReader(flr);
            String data;
            while ((data = bfr.readLine()) != null) {
                System.out.println(data);
            }
            bfr.close();
            flr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
