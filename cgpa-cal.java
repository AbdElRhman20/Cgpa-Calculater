package cgpacalculater;
import java.util.Scanner;
public class CgpaCalculater {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
       int x,y,t_h=0,p,T,n=0;
       int b,f_s_h=0,o,y1=0;
       //t_hh= total number of hours in term
       //p=previous total hours
       //T=all hours you studied
       
 
       //f_s_h is the sum of hours you passed whish you had failed befor
       System.out.println("Entre Your Previous Total Hours");
       p=read.nextInt();
       double gpa,sum=0,c,G,cgpa;
       double f_g;
       //c is equal subject*it creadit hour
       //G=your previous gpa
       //gpa=this term gpa
       
       
       System.out.println("Entre your previous cgpa");
       G=read.nextDouble();
        System.out.println("Have You Failed In Any Subject...!?");
       System.out.println("Please Entre '1' For Yes Or '0' No");
       b=read.nextInt();
       
       
            switch(b){
                case 1:
                    System.out.println("Entre how many total Subjects you had failed...");
                     y=read.nextInt();
                    System.out.println("Entre its total hours...!");
                     y1=read.nextInt();
                    System.out.println("Entre '1' if you take faild subject or '0' if not");
                     n=read.nextInt();
                    System.out.println("Entre how many of them that you had passed in this term");
                     o=read.nextInt();
                    int f_s_p[]=new int[o];
                    //f_s_p passed subject that you have fail befor
                    for(int k=0;k<f_s_p.length;k++){
                            System.out.println("The"+"  "+(k+1)+"  "+"Hours");
                            f_s_p[k]=read.nextInt();
                            f_s_h+=f_s_p[k];    
                        }
                    break;
                    
                    
                case 0:
                    break;       
            }
       System.out.println("Entre number of subjects");
       x=read.nextInt();
       double a[]=new double[x];
       int h[]=new int[x];
       for(int i=0;i<a.length;i++){
           System.out.println("Entre the"+" "+(i+1)+" "+"Subject's grade ");
           a[i]=read.nextDouble();
             if(a[i]<0 || a[i]>4){
               System.out.println("Invalid");
               break;
             }
             for(int j=0;j<1 ;j++){
               System.out.println("Entre Its Hours");
                      h[j]=read.nextInt();
                      t_h+=h[j];  
                      c=a[i]*h[j];
                      sum+=c;
            }
       }
       //calculation cgpa
       gpa=sum/t_h;
       T=((t_h)+p);
                    cgpa=((G*(p+(y1))+gpa*(t_h))/(T));
                    
                    
       //about gpa in this term
       System.out.println("Total Hour You Studied In This Term="+t_h);
       System.out.println("Your Gpa In This Term Is="+gpa);
       if(gpa>=0 && gpa<2)
           System.out.println("Your Grade In This Term is F");
       if(gpa>=2 && gpa<2.5)
           System.out.println("Your Grade In This Term Is D");
       if(gpa>=2.5 && gpa<3)
           System.out.println("Your Grade In This Term  Is C");
       if(gpa>=3 && gpa<3.5)
           System.out.println("Your Grade In This Term Is B");
       if(gpa>=3.5 && gpa<=4)
           System.out.println("Your Grade In This Term Is A");
       
       
       //About cgpa in all terms
       System.out.println("all hours you studied="+T);
       System.out.println("your cgpa="+cgpa);
        if(cgpa>=0 && cgpa<2)
           System.out.println("Your Grade In All Terms Is F");
       if(cgpa>=2 && cgpa<2.5)
           System.out.println("Your Grade In All Terms Is D");
       if(cgpa>=2.5 && cgpa<3)
           System.out.println("Your Grade In All Terms  Is C");
       if(cgpa>=3 && cgpa<3.5)
           System.out.println("Your Grade In All Terms Is B");
       if(cgpa>=3.5 && cgpa<=4) {
           System.out.println("Your Grade In All Terms Is A");
       } 
    }
    }