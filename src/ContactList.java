import java.util.ArrayList;

public class ContactList
{
    private ArrayList<Person> contacts;

    public ContactList()
    {
        contacts = new ArrayList<Person>();
    }

    //check back because you need to return it as the correct thing i.e Student vs athelete
    public String getContacts(Person s)
    {
//        if (s instanceof Student)
//        {
//            String gradeAsString = Integer.toString(((Student) s).getGrade());
//            return gradeAsString;
//        }
//        if (s instanceof Athlete)
//        {
//            return ((Athlete) s).getSport();
//        }
        //ask about what it's supposed to return if not one of your things
        return contacts;
    }

    //might be wiggity, check back
    public void addContacts(Person newContact)
    {
        contacts.add(newContact);
    }

    public void printContacts()
    {
        for (Person s : contacts)
        {
            s.toString();
        }
    }

    public void sort()
    {

    }
}
