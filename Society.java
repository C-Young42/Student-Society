import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Society
{
    // the name of the society
    private String societyName;
    // a member
    private Member member;
    // stores the members in the society
    private ArrayList<Member> memberCollection;
    

    /**
     * Constructor for objects of class Society
     */
    public Society()
    {
        societyName = "club penguin";
        memberCollection = new ArrayList<Member>();
    }
    // gets the name of the society
    public String getName()
    {
        return societyName;
    }
    // allows a member to join the society
    public void join(Member member)
    {
        memberCollection.add(member);
        //member.setSociety(this);
    }  
    // prints the details of the members in the society
    public void printDetails()
    {
        for(Member member : memberCollection)
        {
            System.out.println("this society is called " + societyName + member);
        }
    }
    // this returns the members who joined in a certain month
    public int joinedInMonth(int joinedMonth) {
        int x = 0;
        if (joinedMonth > 12 || joinedMonth < 1)
        {
            System.out.println("Invalid number");       
        }
        else
        {
        for(Member member2 : memberCollection)
        {
            if(member2.getMonth() == joinedMonth )
            {
                x += 1;
            }
        }
    }   
        return x;
    }
    // this method pays the fees
    public void payFees(Member member)
    {
        System.out.println("the fees have been paid");
        member.setFee();
    }
    // this method takes a month and a year and removes all the membrs from thath month 
    public List<Member> remove(int month, int year)
    {
        List<Member> removedMembers = new ArrayList<Member>();
        
        Iterator<Member> it = memberCollection.iterator();
        
        while(it.hasNext())
        {
            Member memberx = it.next();
            if(memberx.getYear() == year && memberx.getMonth() == month)
            {
                removedMembers.add(memberx);
                it.remove();
            }
        }
        return removedMembers;
    }
    // prints details about the society
    public String toString()
    {
        return societyName;
    }
}
