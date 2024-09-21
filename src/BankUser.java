public class BankUser extends BankAccount implements Bank{
    private String name;
    private int age;
    private String gender;

    public BankUser(String nameIn, int ageIN, Boolean genderIn, int accountNumberIn, int balanceIn){
        super(accountNumberIn, balanceIn);
        this.name = nameIn;
        this.age = ageIN;
        if(genderIn) {
            this.gender = "Male";
        }else{
            this.gender = "Female";
        }
    }

    public void getInfo(){
        System.out.println("Name:\t"+this.name+
                "\nAge:\t"+this.age+
                "\nGender:\t"+gender);
        super.getInfo();
    }
}
