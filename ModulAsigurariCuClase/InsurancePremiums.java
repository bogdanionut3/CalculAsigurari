package ModulAsigurariCuClase;

public class InsurancePremiums {
    private double[] risks;
    private int numberOfMounths;
    private int remainingNumberOfMounths;

    public InsurancePremiums(double risks[], int numberOfMounths, int remainingNumberOfMounths) {
        this.risks = risks;
        this.numberOfMounths = numberOfMounths;
        this.remainingNumberOfMounths = remainingNumberOfMounths;
    }

    public double calculateMounthlyPersonPrime(){
        Risks risk = new Risks(risks, numberOfMounths,remainingNumberOfMounths);
        double mounthlyPersonPrime = risk.calculatesSumOfNewRisks(risks,numberOfMounths,remainingNumberOfMounths)
                /remainingNumberOfMounths;
        return mounthlyPersonPrime;
    }
    public double calculateMounthlyTotaPrime(int nrOfNewPersons){
       double mounthlyTotalPrime = calculateMounthlyPersonPrime()*nrOfNewPersons;
       return mounthlyTotalPrime;
    }

}


