public class User {

    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String eMail;


    public User(){

    };

    public User(int id, String userName, String firstName, String lastName, String eMail){
        this.id=id;
        this.userName=userName;
        this.firstName=firstName;
        this.lastName=lastName;
        this.eMail=eMail;
    };



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName(){
        return  userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}

