public class Contact{
    String name, relation, bday, phone, email;
    
    public Contact(String name, String relation, String bday, String phone, String email){
        this.name=name;
        this.relation=relation;
        this.bday=bday;
        this.phone=phone;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getRelation(){
        return relation;
    }
    public String getBday(){
        return bday;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        return String.format("%-20s %-8s %-6s %-18s %-30s",name,relation,bday,phone,email);
    }
}