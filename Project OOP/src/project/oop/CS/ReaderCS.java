package project.oop.CS;
public class ReaderCS extends Person {
    public ReaderCS(String userName, String EMail, String Password) {
        super(userName, EMail, Password);
    }
    void Insert(String userName, String EMail, String Password){
        super.setUserName(userName);
        super.setEMail(EMail);
        super.setPassword(Password);
    }
}
