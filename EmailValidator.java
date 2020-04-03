/*
Write a program to validate email addresses. Use a loop to go over each character,
 and find an @ sign, followed by two or more words separated by dots. Examples of
 valid emails are araujot@vanier.college and araujot@vaniercollege.qc.ca, and invalid
 ones would be araujot&vanier.college or araujot@vanier.

(i got help from youtube)

Written By MOHAMMAD EL KASWANI
*/
public class EmailValidator {
  
public static void main(String[] args)
{
String email1 = "moe@vanier.college";
String email2 = "moe@vaniercollege.qc.ca";
String email3 = "moe&vanier.college";
String email4 = "moe@vanier.";
  
System.out.println("\nRESULT 1:\n-------");
checkValid(email1);
  
System.out.println("\nRESULT 2:\n-------");
checkValid(email2);
  
System.out.println("\nRESULT 3:\n-------");
checkValid(email3);
  
System.out.println("\nRESULT 4:\n-------");
checkValid(email4);
}
  
private static void checkValid(String email)
{
boolean containsAtTheRate = false;
for(int i = 0; i < email.length(); i++)
{
if(email.charAt(i) == '@')
{
containsAtTheRate = true;
break;
}
}
  
boolean containsDot = false;
if(containsAtTheRate)
{
for(int i = 0; i < email.length(); i++)
{
if(email.charAt(i) == '.')
{
containsDot = true;
break;
}
}
  
// contains dot
if(containsDot)
{

String remPart = email.substring(email.indexOf("@") + 1);
String[] data = remPart.split("\\.");
if(data.length >= 2)
System.out.println(email + " is a valid email address.");
else
System.out.println(email + " is not a valid email address: does not contain at least 2 words after @ sign!");
}
else
System.out.println(email + " is not a valid email address: does not contain . symbol!");
}
else
System.out.println(email + " is not a valid email address: does not contain @ symbol!");
}
}