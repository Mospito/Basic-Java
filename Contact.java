

public class Contact {
    private int Age;
    private String Fname;
    private String Lname;
    private String Tel;
    //private String name, num;

    public Contact( String Firstname, String Lastname,int age, String Telephone){
        
        setFName(Firstname);
        setLName(Lastname);
        setAge(age);
        setTel(Telephone);

    }
    public int getAge(){
        return this.Age;
    }
    public void setAge(int age){
        if(age > 0 && age < 60){
            this.Age = age;
        }else if (age >= 60){
            this.Age = age;
            System.out.println("You are Older");
            
        }else {
            this.Age = age;
            System.out.println("Error!! You Age can't Negative");
            
        }
    }
    public String getFName(){
        return this.Fname;
    }
    public void setFName(String Firstname){
      
        this.Fname = Firstname;
    }
    public String getLName(){
        return this.Lname;
    }
    public void setLName(String Lastname){
        this.Lname = Lastname;
    }
    public String getTel(){
        String Phone = this.Tel;
 
        String number = Phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
        return number;
    }
    public void setTel(String Telephone){
        this.Tel = Telephone;
    }

    public String toString ()
    {
        return getFName()+" " + getLName()+" " + getAge()+" " + getTel();
    }

}