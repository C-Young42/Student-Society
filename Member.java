import java.util.ArrayList;

public class Member
{
    // name of the member
    private String name;
    // month the member joined
    private int month;
    // year the member joined
    private int year;
    // the society the member is apart of
    private Society society;
    // shows if the member has paid the fees or not
    private boolean feesPaid;
    // stores the societys the member is apart of 
    private ArrayList<Society> societyCollection;

    /**
     * Constructor for objects of class Member
     */
    public Member(String newName, int newMonth, int newYear)
    {
        name = newName;
        month = newMonth;
        year = newYear;
        feesPaid = false;
        societyCollection = new ArrayList<Society>();
    }
    // this method gets the name of the member
    public String getName()
    {
        return name;
    }
    // this method gets the month the member joined
    public int getMonth()
    {
        return month;
    }
    // this method gets the year the member joined
    public int getYear()
    {
        return year;
    }
    // this method sets the name of the member
    public void setName(String newName)
    {
    name = newName;
    }
    // this method sets the month the member joins
    public void setMonth(int newMonth)
    {
    month = newMonth;
    }
    // this method sets the month the member joins
    public void setYear(int newYear)
    {
    year = newYear;
    }
    // sets the society of the member
    //public void setSociety(Society society)
    //{
    //   this.society = society;
    //}
    // prints all the details of the member
    public String toString()
    {
        return " this members name is " + name + " they joined " + month + " " +  year;
    }
    // this method "pays" the fees
    //public void payFees(Member member)
    //{
    //   society.payFees(member);
    //}
    // this method sets the value of feesPaid to true
    public void setFee()
    {
        feesPaid = true;
    }
    // adds a society to the collection. 
    public void joinSociety(Society society)
    {
        societyCollection.add(society);
    }
    // shows all the societys the member is apart of
    public void printDetails()
    {
        for(Society society : societyCollection)
        {
            System.out.println("this member is aprt of " + society);
        }
    }
}
