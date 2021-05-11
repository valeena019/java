import java. util.Scanner;
public  class grade {
    public static void main(String[] args){
        int i;
        float t=0;
        float avg=0;
        System.out.println("enter the marks");



        Scanner s=new Scanner(System.in);
        int marks[]=new int[6];
            for(i=0;i<6;i++) {
                marks[i] = s.nextInt();
                t = t + marks[i];
            }
            avg=t/6;



       if(avg>=80) {
           System.out.println("grade A");
       }
       else if(avg<80 && avg>=60)
       {
           System.out.println("grade B");
       }
       else if(avg<60 && avg>=40){
           System.out.println("grade c");

       }
       else{
           System.out.println("d");
       }

    }
}
