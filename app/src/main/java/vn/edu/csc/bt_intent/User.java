package vn.edu.csc.bt_intent;

import org.parceler.Parcel;

@Parcel
public class User {
    String name;
    String email;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
