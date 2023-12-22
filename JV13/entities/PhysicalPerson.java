package entities;

public class PhysicalPerson extends Person
{
    private Double healthcareExpenses;

    public PhysicalPerson()
    {
        super();
    }

    public PhysicalPerson(String name, Double annualIncome, Double healthcareExpenses)
    {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses()
    {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses)
    {
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double taxCalculation()
    {
        Double tax;

        if (getAnnualIncome() < 20000)
            tax = (getAnnualIncome() * 0.15);
        else
            tax = (getAnnualIncome() * 0.25);
        if (healthcareExpenses > 0)
            tax -= (healthcareExpenses * 0.5);
        return (tax);
    }
}
