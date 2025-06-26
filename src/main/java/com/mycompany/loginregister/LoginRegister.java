/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginregister;

/**
 *
 * @author danie
 */
public class LoginRegister {

    private final String fname;
    private final String lname;
    private final String mname;
    private final String uname;
    private final String password;
    private final String bday;
    private final String age;
   
    
    public LoginRegister(String fname, String lname, String mname, String uname, String password, 
            String bday, String age){
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.uname = uname;
        this.password = password;
        this.bday = bday;
        this.age = age;
      
    }    
    public String getfname() {
        return fname;
    }
    
    public String getlname() {
        return lname;
    }
    
    public String getmname() {
        return mname;
    }
    
    public String getuname() {
        return uname;
    }
    
    public String getpass() {
        return password;
    }
    
    public String getbday() {
        return bday;
    }
    
    public String getage() {
        return age;
    }

}
