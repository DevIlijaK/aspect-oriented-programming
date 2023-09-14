package com.practice.aop.beforeAdviceSecurity;

public class SecurityManager {
    private static ThreadLocal<UserInfo>
            threadLocal = new ThreadLocal<>();

    /**
     * This method creates a new user and stores it on the current thread
     * @param userName
     * @param password
     */
    public void login(String userName, String password) {
        threadLocal.set(new UserInfo(userName, password));
    }
    public void logout() {
        threadLocal.set(null);
    }
    public UserInfo getLoggedOnUser() {
        return threadLocal.get();
    }
}
