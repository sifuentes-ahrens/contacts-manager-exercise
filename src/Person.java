class Contact {

     private long phoneNum;
     private String fullName;

     public Contact(String first, String last, long phone) {
         this.fullName = first + " " + last;
         this.phoneNum = phone;

     }

    public long getPhoneNum() {
        return phoneNum;
    }

    public String getFullName() {
        return fullName;
    }
}
