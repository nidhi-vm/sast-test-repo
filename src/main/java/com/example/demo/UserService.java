public class UserService {
    public String getUserData(String userId) {
        String query = "SELECT * FROM users WHERE id=" + userId;  // SQL Injection risk
        return query;
    }
}
