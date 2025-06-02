public class Person {
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    public void addSibling(Person sibling) {
        Person[] newSibling = new Person[this.numberOfSiblings + 1]; 
        for (int i = 0; i < this.numberOfSiblings; i++) {
            newSibling[i] = this.siblings[i];
        }
        newSibling[this.numberOfSiblings] = sibling;
        this.siblings = newSibling;
        this.numberOfSiblings++;
    }

    public Person[] getSiblings() {
        return this.siblings;
    }
}
