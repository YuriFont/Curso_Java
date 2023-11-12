public class Student
{
    public String Name;
    public double N1;
    public double N2;
    public double N3;

    public double FinalGrade()
    {
        return (this.N1 + this.N2 + this.N3);
    }

    public String Result()
    {
        if (FinalGrade() >= 60.0)
            return ("PASS");
        return ("FAILED");
    }

    public double Missed()
    {
        if (Result() == "PASS")
            return (0);
        return (60 - FinalGrade());
    }
}