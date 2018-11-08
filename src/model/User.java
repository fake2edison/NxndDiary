package model;

/**
 * Created by fake2edison on 2018/11/1.
 */
public class User {

    int user_id;
    String name;
    String phone;
    String password;
    String user_img;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", user_img='" + user_img + '\'' +
                '}';
    }

    public User() {
    }

    public User(int user_id, String name, String phone, String password, String user_img) {
        this.user_id = user_id;
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.user_img = user_img;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }
}
