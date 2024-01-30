package gmaildetails;

public class GmailProcessing {
    public void Login(){
        ToAccount tc=new ToAccount();
        GmailLogin gmailLogin=new GmailLogin();
        String userName="vinnynaidu";
        String password="Daddy01";
        if (userName.equals(gmailLogin.userName)&&password.equals(gmailLogin.password)){
            tc.inbox=gmailLogin.message;
            System.out.println(tc.inbox);
        }
        else {
            System.out.println("Invalid");
        }

    }
}
