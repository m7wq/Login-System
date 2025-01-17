package Account;

public class Account implements Registrable{

    private String gmail;
    private String user;
    private String password;

    public Account(String gmail, String user, String password) {
        setGmail(gmail);
        setPassword(password);
        setUser(user);
    }

    @Override
    public String getGmail() {
        return gmail;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public void setUser(String user) {
        this.user=user;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

}
