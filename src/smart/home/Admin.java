/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.home;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author suryasdwivedi
 */
public class Admin implements Serializable {
    private String first_name;
    private String last_name;
    private String birthday;
    private String address;
    private String contact_no;
    private String email_id;
    private int login_nos;
    private int Uid; 
    private String password;
    private ArrayList<String> complaint_list=new ArrayList<String>();
    
    
    public Admin(String first_name,String last_name,String birthday,String address,String contact_no,String email_id,int login_nos,int Uid){
        this.first_name=first_name;
        this.last_name=last_name;
        this.birthday=birthday;
        this.contact_no=contact_no;
        this.address=address;
        this.email_id=email_id;
        this.login_nos=login_nos;
        this.Uid=Uid;
        this.password=contact_no;
        
    }
    
      
     public String get_name(){
        return first_name+" "+last_name;
        //a.add_request(s,this);
    }
    
      public int get_login_nos(){
        return login_nos;
        //a.add_request(s,this);
    }
    
    public void set_login_nos(int i){
        this.login_nos=i;
        //a.add_request(s,this);
    }
     
     
    public int get_Uid(){
        return Uid;
        //a.add_request(s,this);
    }
    
    public String get_password(){
        return password;
        //a.add_request(s,this);
    }
    
      public void set_password(String s){
        this.password=s;
        //a.add_request(s,this);
    }
    
    public ArrayList<String> get_complaint_list(){
        return complaint_list;
    }
    
   
    
}
