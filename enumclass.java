import java.util.Scanner;

public class enumclass {
    public static void main(String[] args) {
        enum Designations {
          CEO, MANAGER, ASMANAGER, WORKER
        }
                                                       
        Designations Masters = Designations.CEO;
        Designations Bachelors = Designations.MANAGER;
        Designations AssociateDegree = Designations.ASMANAGER;
        Designations Inter= Designations.WORKER;
        System.out.println(Masters);

    }
    
}
