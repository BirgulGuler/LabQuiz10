/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xox;

/**
 *
 * @author Technopc
 */
public class Oyun {
    char[][] oyun=new char[3][3];
    
    Oyun()
    {for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
            oyun[i][j]='_';
    }
    public void tahtaCiz()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(oyun[i][j]+" ");
            System.out.println("");
        }
    }
    public boolean tasKoy(char c,int x,int y)
    { 
        if(((x>-1) && (x<3)) && ((y>-1) && (y<3)))
        {}
        else {System.out.println("Koordinat hatalı");return false;}
        
        if(oyun[x][y]!='_') {System.out.println("Koordinat hatalı");return false;}
        else
        {oyun[x][y]=c;return true;}
    }
    
    public boolean bittiMi()
    {
        for(int i=0;i<3;i++)  
            { 
                if (((oyun[i][0]==oyun[i][1]) && (oyun[i][1]==oyun[i][2]))&& (oyun[i][0]!='_'))
                
                    return true;
                if (((oyun[0][i]==oyun[1][i]) && (oyun[1][i]==oyun[2][i]))&& (oyun[0][i]!='_'))
                   
                    return true;   
            }
    if (((oyun[0][0]==oyun[1][1]) && (oyun[1][1]==oyun[2][2]))&& (oyun[0][0]!='_'))
      return true;
    
    if (((oyun[0][2]==oyun[1][1]) && (oyun[1][1]==oyun[2][0]))&& (oyun[0][2]!='_'))
                return true;
    
    return false;
    }
}
