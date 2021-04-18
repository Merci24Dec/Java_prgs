import java.net.*;
import java.io.*;
public class MyClient
{
   public static void main(String args[])throws Exception
    {
        Socket s=new Socket("localhost",9090);
        DataInputStream din= new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1="",str2="";
        while(!str1.equals("bye"))
        {
            str1=br.readLine();
            dout.writeUTF(str1);
            dout.flush();
            str2=din.readUTF();
            System.out.println("server says"+str2);
        }
        dout.close();
    }
}