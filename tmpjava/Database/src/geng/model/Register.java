package geng.model;
public class Register {
    String admin_id;
    String admin_login_name;
    String admin_login_pwd;
    public void setAdmin_id(String admin_id){
        this.admin_id = admin_id;
    }
    public void setAdmin_login_name(String admin_login_name){
        this.admin_login_name=admin_login_name;
    }
    public void setAdmin_login_pwd(String admin_login_pwd){
        this.admin_login_pwd = admin_login_pwd;
    }
    public String getAdmin_id(){
        return admin_id;
    }
    public String getAdmin_login_name(){
        return admin_login_name;
    }
    public String getAdmin_login_pwd(){
        return admin_login_pwd;
    }   
}
