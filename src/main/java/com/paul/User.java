package com.paul;

public class User {

    private String userId;
    private int UserNo;
    private boolean disabled;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserNo() {
        return UserNo;
    }

    public void setUserNo(int userNo) {
        UserNo = userNo;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
}
