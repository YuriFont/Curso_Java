package JV06.entities;

public class Room
{
    private int roomNumber;
    private String name;
    private String email;

    public Room(int roomNumber, String name, String email)
    {
        this.roomNumber = roomNumber;
        this.name = name;
        this.email = email;
    }

    public int getRoomNumber()
    {
        return (roomNumber);
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public String getName()
    {
        return (name);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return (email);
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String toString()
    {
        return (roomNumber + ": " + name + ", " + email);
    }
}
