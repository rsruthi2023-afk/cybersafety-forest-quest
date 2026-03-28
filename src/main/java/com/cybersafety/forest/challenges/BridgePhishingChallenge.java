import java.util.regex.*;  

public class BridgePhishingChallenge {  
    public static void main(String[] args) {  
        String testEmail = "test@example.com";  
        System.out.println(isPhishingEmail(testEmail) ? "Phishing Email Detected" : "Safe Email");  
    }  

    public static boolean isPhishingEmail(String email) {  
        // Simple regex to identify potential phishing emails  
        String regex = "^[A-Za-z0-9._%+-]+@(example|fake|scam)\.[A-Za-z]{2,}$";  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(email);  
        return matcher.matches();  
    }  
}  
