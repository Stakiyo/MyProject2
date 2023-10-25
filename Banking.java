package com.javaprograms;

import java.util.Scanner;
class Banking
{
String bankName,ifscCode,name;
String mobileNo,email;
int amount,balance;
void menu()
{
while(true)
{
System.out.println("1.Login..");
System.out.println("2.Create Account..");
}
}
void login()
{


}

void createAccount()
{
Scanner s=new Scanner(System.in);
System.out.println("--------Fill detail to continue-------");
System.out.println("###### || Enter your Bankname || ####");
bankName=s.nextLine();
bankNameValidation();
System.out.println("###### || Enter your Fullname || ####");
name=s.nextLine();
System.out.println("###### || Enter your Email|| ####");
email=s.nextLine();
emailValidation();
System.out.println("###### || Enter your mobile number|| ####");
mobileNo=s.nextLine(); 
mobileNumberValidation();
System.out.println("###### || Create your ifsc code|| ####");
ifscCode=s.nextLine();
ifscCodeValidation();
System.out.println("###### ||Select account type|| ####");
System.out.println("1.Saving");
System.out.println("2.Current");

}

void bankNameValidation()
{
if(bankName.length()==0 ) 
{
if(bankName!="^[a-zA-Z]"
)
{
System.out.println("Please enter valid bankname.......");

}
}
}

void emailValidation()
{
if(email.indexOf('@')<=0 || email.indexOf('.')<=0)
{
System.out.println("Invalid e-mail id...");

}
}

void mobileNumberValidation()
{
 if(mobileNo.length()!=10)
{
System.out.println("Invalid mobile number....");
}
}

void ifscCodeValidation()
{
if(ifscCode!="[A-Z0-9]")
{
System.out.println("Invalid ifsc code...");
}
}
public static void main(String args[])
{
Banking b1=new Banking();
b1.menu();
b1.createAccount();
}
}