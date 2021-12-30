import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created By Arjun Gautam
 * Date :30/12/2021
 * Time :11:03 PM
 * Project Name :ChatApp
 */

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1254);
        Socket cs = ss.accept();
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
        Scanner ink = new Scanner(System.in);

        String rmsg, smsg;

        do {
            System.out.println("Puja:");
            smsg = ink.nextLine();
            outs.println(smsg);
            rmsg = ins.nextLine();
            System.out.println("\tArjun: " + rmsg);


        } while (rmsg.equals("bye") != true);
        outs.close();
        ins.close();
        cs.close();
        ss.close();
    }
}
