import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created By Arjun Gautam
 * Date :30/12/2021
 * Time :11:03 PM
 * Project Name :ChatApp
 */

public class Client {
    public static void main(String[] args) throws IOException {
        Socket cs = new Socket("localhost", 1254);
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
        Scanner ink = new Scanner(System.in);

        String rmsg, sms;
        do {
            rmsg = ins.nextLine();
            System.out.println("\tPuja: " + rmsg);
            System.out.println("Arjun:");
            sms = ink.nextLine();
            outs.println(sms);
        } while (rmsg.equals("bye") != true);
        ins.close();
        outs.close();
        cs.close();

    }
}
