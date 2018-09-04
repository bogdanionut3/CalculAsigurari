package ModulAsigurariCuClase;

public class Risks {
    private double[] risks;
    private int numberOfMounths;
    private int remainingNumberOfMounths;

    public Risks(double risks[], int numberOfMounths, int remainingNumberOfMounths) {
        this.risks = risks;
        this.numberOfMounths = numberOfMounths;
        this.remainingNumberOfMounths = remainingNumberOfMounths;
    }

    public double calculatesSumOfNewRisks(/*double[] risks, int numberOfMounths, int remainingNumberOfMounths*/) {
        double sumOfNewRisks = 0;
        double risksByPerson;
        for (int i = 0; i < risks.length; i++) {
            risksByPerson = risks[i] / numberOfMounths;
            risks[i] = risksByPerson * remainingNumberOfMounths;
            sumOfNewRisks = sumOfNewRisks + risks[i];
        }
        return sumOfNewRisks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<risks.length; i++){
            sb.append(risks[i]+"\n");
        }
        return sb.toString();
    }

}

