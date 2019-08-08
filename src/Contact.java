class Contact {

     private String phoneNum;
     private String name;

     public Contact(String first, String phone) {
         this.name = first;
         this.phoneNum = phone;

     }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getName() {
        return name;
    }
}
