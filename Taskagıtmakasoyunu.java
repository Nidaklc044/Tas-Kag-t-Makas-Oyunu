

package taskagıtmakasoyunu;
import java.util.Scanner;
public class Taskagıtmakasoyunu {


    public static void main(String[] args) {
        int x=(int)(Math.random()*3);
        Scanner scan=new Scanner(System.in);
        System.out.println("secimini yap tas=0 kagıt =1 makas=2");
        int number=scan.nextInt();
        if(number>2){
            System.out.println("yanliş scein ");
        }
            else if(number==0 && x==1 ||number==1 && x==2||number==2&& x==0 ){
            System.out.println("Kaybettin");
        }
        else if(number==x){
            System.out.println("berabere");
        } 
      else
            System.out.println("kazandınız");
    }
    
        }
