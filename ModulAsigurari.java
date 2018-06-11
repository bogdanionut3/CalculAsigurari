import java.util.Scanner;

public class ModulAsigurari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti durata asigurarii ca numar de luni: ");
        int nrLuni = sc.nextInt();
        System.out.print("Cate riscuri are aceasta asigurare? ");
        int nrRiscuri = sc.nextInt();
        double[] riscuri = new double[nrRiscuri];
        int i;
        for (i = 0; i < riscuri.length; i++) {
            System.out.print("Introduceti valorile riscurilor din asigurare in RON");
            riscuri[i] = sc.nextDouble();
        }
        System.out.print("Cate luni au mai ramas din asigurare? ");
        int nrLuniRamase = sc.nextInt();
        System.out.print("Cate persoane sunt in asigurare in aceasta luna? ");
        int nrPersoaneNoi = sc.nextInt();
        double riscuriPeOm;
        double sumaRiscuriNoi = 0;
        for (i = 0; i < riscuri.length; i++) {
            riscuriPeOm = riscuri[i] / nrLuni;
            riscuri[i] = riscuriPeOm * nrLuniRamase;
            System.out.println("Noile riscuri sunt: " + riscuri[i] + " RON ");
            sumaRiscuriNoi = sumaRiscuriNoi + riscuri[i];
        }
        double primaLunaraPeOm = sumaRiscuriNoi / nrLuniRamase;
        System.out.println("Prima lunara ramasa pe om este = " + primaLunaraPeOm + " RON");
        double primaLunara = nrPersoaneNoi * primaLunaraPeOm;
        System.out.println("Prima noua pentru toate persoanele din asigurare este: " + primaLunara + " RON");
    }
}


