/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prgrm1;
import java.util.Scanner;
/**
 *
 * @author POOJHA KEERTHI
 */
public class sortinginascendingorder {
    public static void main(String[] args){
        int a[]=new int[20];
        int n,temp,i,j;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter length of array");
        n=obj.nextInt();
        System.out.println("enter elements of array");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("sorted array\n");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
