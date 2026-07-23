public class Month
{
    private String monthName;
    private int amount;

    public Month(String monthName, int amount)
    {
        this.monthName = monthName;
        this.amount = amount;
    }

    public String getMonthName()
    {
        return monthName;
    }

    public int getAmount()
    {
        return amount;
    }
}
