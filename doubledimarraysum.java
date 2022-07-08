import java.util.*;
class doubledimarraysum
   {

       public static void main(String args[])
       {
            
        Scanner x = new Scanner(System.in);

        int [][]  a = new int [3][3];
         int [][] b= new int  [3][3];
         int  [][]c =new int  [3][3];
          int row , col;
           System.out.print("enter element for matrix a");
           for(row=0; row<3; row++)
                {
              for(col=0; col<2; col++)
              a[row][col]=x.nextInt();

                 }
                  System.out.print("enter element b");
           for(row=0; row<3; row++)
                {
              for(col=0; col<2; col++)
              b[row][col]=x.nextInt();

                 }
            System.out.print("the addition of matrix is=>");
            for(row=0;row<3;row++)
               {
              for(col=0;col<3;col++)
                {
               
               c[row][col]=a[row][col]+b[row][col];
               System.out.print(+c[row][col]+" ");
                 System.out.println();
                 }
             System.out.println("Printing In Matrix Form=");     
             for(row=0; row<3; row++)
             {
              for(col=0; col<2; col++)
             System.out.print(c[row][col]+" ");

            System.out.println();
             }
}
        }


  }
     
    