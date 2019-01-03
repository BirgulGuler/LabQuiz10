/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xox;
import java.util.Scanner;
/**
 *
 * @author Technopc
 */
public class XOX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { Scanner in=new Scanner(System.in);
        int x,y;
      
        Oyun xox=new Oyun();
        char a='S';
        
        do
            {   xox.tahtaCiz();
                System.out.println(a+" Sırası");
                System.out.println("x koordinatı=");
                x=in.nextInt();
                System.out.println("y koordinatı=");
                y=in.nextInt();
                
                if (xox.tasKoy(a, x, y)) 
                {
                  if(xox.bittiMi()) System.out.println(a+" oyunu kazandı.");
                if (a=='S') a='O';
                else a='S'; 
                }
                               
            }while(!xox.bittiMi());
    }
    
}
