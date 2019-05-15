package com.ssm.Entity;

public class WebLogs {


    private int id;
    private String WebUser;
    private String UserIP;
    private  String UsedController;
    private String UsedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWebUser() {
        return WebUser;
    }

    public void setWebUser(String webUser) {
        WebUser = webUser;
    }

    public String getUserIP() {
        return UserIP;
    }

    public void setUserIP(String userIP) {
        UserIP = userIP;
    }

    public String getUsedController() {
        return UsedController;
    }

    public void setUsedController(String usedController) {
        UsedController = usedController;
    }

    public String getUsedTime() {
        return UsedTime;
    }

    public void setUsedTime(String usedTime) {
        UsedTime = usedTime;
    }


    @Override
    public String toString() {
        return "WebLogs{" +
                "id=" + id +
                ", WebUser='" + WebUser + '\'' +
                ", UserIP='" + UserIP + '\'' +
                ", UsedController='" + UsedController + '\'' +
                ", UsedTime='" + UsedTime + '\'' +
                '}';
    }
}
