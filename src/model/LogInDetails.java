
package model;


public class LogInDetails {
    public static boolean isLogin = false;
    public static String UserType = "";
    public static String UserId = "";

    public static boolean getisIsLogin() {
        return isLogin;
    }

    public static String getUserType() {
        return UserType;
    }

    public static String getUserId() {
        return UserId;
    }

    public static void setIsLogin(boolean isLogin) {
        LogInDetails.isLogin = isLogin;
    }

    public static void setUserType(String UserType) {
        LogInDetails.UserType = UserType;
    }

    public static void setUserId(String UserId) {
        LogInDetails.UserId = UserId;
    }
    
    
}
