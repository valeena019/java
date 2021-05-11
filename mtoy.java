import java.util.Scanner;
public class mtoy {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the no of minutes:");
        int minutes= input.nextInt();
         int year=minutes/(365*24*60);


          int rem= minutes%(365*24*60);
        int day=rem/(24*60);
          System.out.println(minutes +"minutes is approximatelly"+year+"years and "+day+"days");
    }

}
