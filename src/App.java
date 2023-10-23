import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
/*     int litetTal=10;
    int stortTal=1000;
    if(litetTal<1000)
{
        System.out.println(litetTal +"är mindre än"+stortTal);
}
    else
{
    System.out.println(litetTal +"är mindre än"+stortTal);
}
    System.out.println("litetTal="+litetTal+"stortTal="+stortTal);


int tal1=10;
int tal2=20;
if(tal2>=tal1){
    System.out.println(tal2+" är större än "+tal1);
}
else{
    System.out.println(tal2+"är inte större än "+tal1);
}
    Scanner tb = new Scanner(System.in);
    int clock=tb.nextInt();
    if(clock>=6){
        System.out.println("God Natt");
    }
    else if(clock>=10){
        System.out.println("God förmiddag");
    }
    else if(clock>=15){
        System.out.println("God eftermiddag");
    }
    else if(clock>=19){
        System.out.println("God kväll");
    }
    else if(clock>=23){
    System.out.println("God natt");
    }
    else if(clock>=24){
        System.out.println("?????");
    }
    
    Scanner klubb = new Scanner(System.in);
    System.out.println("Över 18?");
    boolean ålder = klubb.nextBoolean();
    System.out.println("Medlem?");
    boolean medlem = klubb.nextBoolean();
    if(ålder==true){
        System.out.println("Kom in ;)");
    }
    else if(medlem==true){
        System.out.println("Kom in ;)");
    }
    else{
        System.out.println("Stick och brinn");
    }
    */
    Scanner tb = new Scanner(System.in);
    System.out.println("Pls ge mig användernamn"); 
    String use = tb.nextLine();
    System.out.println("Pls ge mig lösenord");
    String pass = tb.nextLine();

    if(use.equals("root") && pass.equals("passwd")){
        System.out.println("Du bor på 43.296671, 4.581379");
    }
    else{
        System.out.println("Ritard du kan inte lösa ord eller använda namn");
    }
    

}
}



