package vn.edu.ueh.speedyeats.my_interface;

public interface IUser {

    void OnSucess();

    void OnFail();

    void getDataUser(String id, String email,String name, String address, String phone, String date, String gender, String avatar);
}