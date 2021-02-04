package entity;

//public class User {
//    private String nickname;
//    private String email;
//    private String password;
//
//    public User(String nickname, String email, String password) {
//        this.nickname = nickname;
//        this.email = email;
//        this.password = password;
//    }
//
//    public String getNickname() {
//        return nickname;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//}
  public class Users {
    private int id;
    private String name;
    private String password;
    private String nik;

    public Users(int id, String name, String password, String nik) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.nik = nik;
    }

//    public void setNik(String nik) {
//        this.nik = nik;
//    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getNik() {
        return nik;
    }

}
