class Address {
    int houseNo;
    String street;
    String locality;
    String city;
    String state;
    String country;
    
    public Address(){}

    public Address(int houseNo, String street, String locality, String city, String state, String country) {
        this.houseNo = houseNo;
        this.street = street;
        this.locality = locality;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    @Override
    public String toString(){
        return houseNo + ", " + street + ", " + locality + ", " + city + ", " + state + ", " + country;
    }
}