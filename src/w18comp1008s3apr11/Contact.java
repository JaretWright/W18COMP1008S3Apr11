package w18comp1008s3apr11;

/**
 *
 * @author JWright
 */
public class Contact
{
    private String firstName, lastName, phone;

    public Contact(String firstName, String lastName, String phone)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        if (!firstName.isEmpty())
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("first name cannot be empty");
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        if (!lastName.isEmpty())
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("last name cannot be empty");
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        if (!phone.isEmpty())
            this.phone = phone;
        else
            throw new IllegalArgumentException("phone cannot be empty");
    }
    
    
    
    
}
