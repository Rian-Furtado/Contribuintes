

public class TaxPayer {

    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;


    public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public TaxPayer() {

    }

    public double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public double getServicesIncome() {
        return servicesIncome;
    }

    public void setServicesIncome(double servicesIncome) {
        this.servicesIncome = servicesIncome;
    }

    public double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public double salaryTax() {
        double aux = salaryIncome / 12;
        double realSalary = salaryIncome;

        if (aux < 3000) {
            return 0;
        } else if (aux >= 3000 && aux <= 5000) {
            return (realSalary * 0.1);
        } else {
            return (realSalary * 0.2);
        }
    }

    public double servicesTax() {

        double aux = servicesIncome;
        return (aux * 0.15);
    }

    public double capitalTax() {

        double aux = capitalIncome;
        return (aux * 0.2);
    }

    public double grossTax() {

        return salaryTax() + servicesTax() + capitalTax();
    }


    public double taxRebate() {

        double aux = grossTax() * 0.3;
        double totalEducationalExpenditureDoctors = healthSpending + educationSpending;

        if (totalEducationalExpenditureDoctors < aux) {
            return totalEducationalExpenditureDoctors;
        } else {
            return aux;
        }

    }

    public double netTax() {

        return grossTax() - taxRebate();

    }
}
