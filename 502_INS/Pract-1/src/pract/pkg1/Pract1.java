/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pract.pkg1;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Pract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int key;
        char ch;
        String message, encryptedMessage="";
        
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Plain Text");
        message=sc.nextLine();
        System.out.println("Enter Key");
        key=sc.nextInt();
        key=-key;
        for(int i=0; i<message.length();i++){
            ch=message.charAt(i);
            if(Character.isLowerCase(ch)){
                encryptedMessage+=(char)(((ch-'a'+key+(key<0?26:0))%26)+'a');
            }else if(Character.isUpperCase(ch)){
                encryptedMessage+=(char)(((ch-'A'+key+(key<0?26:0))%26)+'A');
            }else{
                encryptedMessage+=ch;
            }
        }
        System.out.println(encryptedMessage);
    }
}
