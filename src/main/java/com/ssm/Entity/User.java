package com.ssm.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class User implements Serializable {
    public static long getSerialversionuid() {

        return serialVersionUID;
    }
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;  
    private String username;
    private String password;
    private Date birthday;
    private String sex;  
    private String address;


    public Morder getMorder() {
		return morder;
	}
	public void setMorder(Morder morder) {
		this.morder = morder;
	}
	public List<Home> getHomeList() {
		return homeList;
	}
	public void setHomeList(List<Home> homeList) {
		this.homeList = homeList;
	}
	//一對一 放入對象
    private Morder morder;
    //一對多 放入對象集合
    private List<Home> homeList;



  

	public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    public String getUsername() {  
        return username;  
    }  
    public void setUsername(String username) {  
        this.username = username;  
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getBirthday() {
        return birthday;  
    }  
    public void setBirthday(Date birthday) {  
        this.birthday = birthday;  
    }  
    public String getSex() {  
        return sex;  
    }  
    public void setSex(String sex) {  
        this.sex = sex;  
    }  
    public String getAddress() {  
        return address;  
    }  
    public void setAddress(String address) {  
        this.address = address;  
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", morder=" + morder +
                ", homeList=" + homeList +
                '}';
    }
}