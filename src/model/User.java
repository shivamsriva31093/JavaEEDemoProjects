package model;

/**
 * Created by sHIVAM on 9/10/2017.
 */
public class User {
    private String username;
    private String fname;
    private String mname;
    private String lname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getName(){
        return getFname()+" "+getMname()+" "+getLname();
    }
}
