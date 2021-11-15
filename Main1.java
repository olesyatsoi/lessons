/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("vvedite a");
        Scanner in = new Scanner(System.in);
        
        double a = in.nextDouble();
        double j=2/3;
       
        if (a<=-2){
            double k=((-j)*a+j);
            System.out.print("f(a)= ");
            System.out.print(k);
        }
        else if (a>-2 && a<1){
            System.out.print("Funcia ne opredelena");
        }
        else if (a>=1){
            double t=a*a;
            System.out.print("f(a)= ");
            System.out.print(t);
        }
        double mas[]=new double[5];
        int t=0;
        for(int i=0;i<mas.length;i++){
            double b = in.nextDouble();
            if (prost(b)==1){
                mas[t]=b;
                t++;
            } 
        }
        for(int i=0;i<mas.length;i++){
            
        System.out.println(mas[i]);
            }
        double min=mas[0];
        for(int i=0;i<t;i++){
            if (mas[i]<min)
                min=mas[i];
        }
        System.out.println("Minimalnoe prostoe chislo: ");
        System.out.print(min);
        }
      
    
    public static int prost(double a){
    int h=0;
    for(int y=2;y<=(Math.sqrt(a)+1);y++){
                    if (a==2){
                        h=0;
                    }
                    else if (a%y==0){
                        h=h+1;
                        break;
                    }
                    else if (a%y!=0){
                        h=0;
                    }
                }
    if (h==0){
            return 1;
    }
    else{
            return 0;
    }
        }
}
/**1.написать методввод числа вынести в отдельную функцию
 * 2.Написать метод на проверкую простоты числа
 * 3.Найти минимальное число среди массива простых чисел
 * 4.
 **/