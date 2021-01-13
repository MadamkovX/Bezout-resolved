

import java.util.Scanner;
public class Bezout
{
    private int a;
	private int b;
	 
	 public Bezout()
	 {
	 	
	 }
	 public Bezout(int a,int b)
	 {
	 	this.a=a;
		this.b=b;
	 }
	/*public Bezout(int a,int b)
	{
	
		this.a=a;
		this.b=b;
	}
	public int pgcd()
	{
		int d=0;
		
		
		d=a%b;
		while(d!=0)
		{
			this.a=this.b;
			this.b=d;
			d=this.a%this.b;
			
	    }
		return b;
	}
	*/
	public void resolved()
	{
		
	int z = 1; int u = 0; int t = 0; int v = 1;
    int q; int r = 1;
    int w; int s;
 
    int a2 = this.a;
    int b2 = this.b;
 
    while(r != 0)
    {
        q = a2/b2;
        r = a2 - (b2*q);
 
        if(r == 0)
        {
            System.out.println("le PGCD de a et b vaut: "+b2);
            System.out.println("les coeficients de BEZOUT sont: "+u+","+v);
        }
 
        else
        {
            w = u;
            s = v;
            u = z - (q*u);
            v = t - (q*v);
            z = w;
            t = s;
            a2 = b2;
            b2 = r;
        }
 
    }
 }
	
    public static void main(String[] args)
	{
       int a=17,b=15;
	   Bezout be=new Bezout(a,b);
	   System.out.println("******PROGRAMEUR FRITZ JOINVIL******");
	   be.resolved();
        
    }
}





