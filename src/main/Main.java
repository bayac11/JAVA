package main;
import entities.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages) ;
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir le nbr de cage souhaite");
        int nbrCageSaisie = sc.nextInt() ;
        ZooManagement zm1 = new ZooManagement();
        zm1.nbrCages = nbrCageSaisie;
        System.out.println(zm.zooName + " comporte " + zm1.nbrCages);

        System.out.println("------------------------------------------------------------------");

        Animal lion = new Animal();
        Animal cat = new Animal();
        lion.setName("lotfi");
        lion.setAge(4);
        lion.setFamily("azerty");
        lion.setMammal(true);
        Zoo myzoo =new Zoo();
        myzoo.setAnimals(new Animal[nbrCageSaisie]);
        myzoo.setName("ichkil");
        myzoo.setCity("tunis");
        cat.setName("mohsen");
        cat.setAge(2);
        cat.setFamily("qwerty");
        cat.setMammal(true);

// myzoo.nbrCages= 25;
//  myzoo.displayZoo();
//  System.out.println(myzoo);
//System.out.println(myzoo.toString());
//lion.displayAnimal();
// System.out.println(lion);
//System.out.println(lion.toString());
        System.out.println("------------------------------------------------------------------");

        try{
            myzoo.addAnimal(lion);
        }
        catch(ZooFullException E){
            System.out.println(E.getMessage());
        }
        catch(InvalidAgeException Exe){
            System.out.println(Exe.getMessage());
        }
        try{

            myzoo.addAnimal(cat);}
        catch(ZooFullException Ex){
            System.out.println(Ex.getMessage());
        }
        catch(InvalidAgeException Exec){
            System.out.println(Exec.getMessage());
        }
        myzoo.afficherAnimals();
        System.out.println(myzoo.searchAnimal(cat));
        System.out.println(myzoo.searchAnimal(lion));
        System.out.println(myzoo.removeAnimal(lion));

        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");

        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
        Penguin penguin1 = new Penguin("Spheniscidae", "reppper", 3, true, "Ocean", 30.3f);

        dolphin.swim();
        penguin.swim();
        System.out.println("------------------------------------------------------------------");

        System.out.println("donner le nombre des animaux aquatic \n");
        int nbrAquatic = sc.nextInt();
        myzoo.setNbrAquatic(nbrAquatic);
        myzoo.addAquaticAnimals(penguin);
        myzoo.addAquaticAnimals(dolphin);
        myzoo.addAquaticAnimals(penguin1);
        System.out.println(myzoo.maxPenguinSwimmingDepth());
    }

}