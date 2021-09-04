import java.util.Scanner;

class MenuBased {
    public static void main(String[] args) {
        
        System.out.println("Enter menu command:");
        Scanner in=new Scanner(System.in);
        Integer num=in.nextInt();
        if(num==1)
        {
            notepad();
        }
        else if(num==2)
        {
            calc();
        }
        else if(num==3)
        {
            chrome();
        }
    }

    static void notepad(){
        Runtime app = Runtime.getRuntime();
         try{
             app.exec("notepad");
             
         }
         catch (Exception Ex){
             System.out.println("Error: " + Ex.toString());
         }
        }
        static void calc(){
            Runtime app = Runtime.getRuntime();
            try{
                app.exec("calc");
                
            }
            catch (Exception Ex){
                System.out.println("Error: " + Ex.toString());
            }
        }

        static void chrome(){
            Runtime app = Runtime.getRuntime();
            try{
                app.exec("chrome");
                
            }
            catch (Exception Ex){
                System.out.println("Error: " + Ex.toString());
            }
}
    }