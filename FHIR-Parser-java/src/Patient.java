public class Patient {


    public Patient(String givenName, String familyName, String prefix, String id, String phone, String resourceType, String gender, String birthdate, String maritialStatus, String house, String city, String state, String postalCode, String country) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.prefix = prefix;
        this.id = id;
        this.phone = phone;
        this.resourceType = resourceType;
        this.gender = gender;
        this.birthdate = birthdate;
        this.maritialStatus = maritialStatus;
        this.house = house;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    String givenName;
    String familyName;
    String prefix;
    String id;
    String phone;
    String resourceType;
    String gender;
    String birthdate;
    String maritialStatus;
    String house;
    String city;
    String state;
    String postalCode;
    String country;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getMaritialStatus() {
        return maritialStatus;
    }

    public void setMaritialStatus(String maritialStatus) {
        this.maritialStatus = maritialStatus;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

