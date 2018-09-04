package ModulAsigurariCuClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti durata asigurarii ca numar de luni: ");
        int numberOfMounths = sc.nextInt();
        System.out.print("Cate riscuri are aceasta asigurare? ");
        int nrOfRisks = sc.nextInt();
        double[] risk = new double[nrOfRisks];
        for (int i = 0; i < risk.length; i++) {
            System.out.print("Introduceti valorile riscurilor din asigurare in RON: ");
            risk[i] = sc.nextDouble();
        }
        System.out.print("Cate luni au mai ramas din asigurare? ");
        int remainingNumberOfMounths = sc.nextInt();
        System.out.print("Cate persoane sunt in asigurare in aceasta luna? ");
        int newNrOfPersons = sc.nextInt();
        sc.close();
        Risks risks = new Risks(risk,numberOfMounths,remainingNumberOfMounths);
        risks.calculatesSumOfNewRisks();
        InsurancePremiums ins = new InsurancePremiums(risks, remainingNumberOfMounths);
        System.out.print("Noile riscuri calculate in functie de perioada ramasa sunt: \n"+risks.toString());
        System.out.println("Prima calculata pentru fiecare persoana in functie de perioada ramasa este: "+ins.calculateMounthlyPersonPrime());
        System.out.println("Prima totala in functie de perioada ramasa si numarul total de persoane este: "+ins.calculateMounthlyTotaPrime(newNrOfPersons));
    }
}
