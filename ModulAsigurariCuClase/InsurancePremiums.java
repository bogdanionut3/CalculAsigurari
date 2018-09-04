package ModulAsigurariCuClase;

public class InsurancePremiums {
    private Risks risks;
    private int remainingNumberOfMounths;

    public InsurancePremiums(Risks risks, int remainingNumberOfMounths) {
        this.risks = risks;
        this.remainingNumberOfMounths =remainingNumberOfMounths;
    }

    public double calculateMounthlyPersonPrime(){
        double mounthlyPersonPrime = risks.calculatesSumOfNewRisks()
                /remainingNumberOfMounths;
        return mounthlyPersonPrime;
    }
    public double calculateMounthlyTotaPrime(int nrOfNewPersons){
       double mounthlyTotalPrime = calculateMounthlyPersonPrime()*nrOfNewPersons;
       return mounthlyTotalPrime;
    }

}


