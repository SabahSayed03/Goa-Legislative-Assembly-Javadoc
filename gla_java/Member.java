package gla_java;
// This Member class creates variables: name and constituency.
// Member class

 /**
* Member class-
* This Member class creates variables: name and constituency.
*/

public class Member {
   
    private String name;
    private String constituency;

    /**
     * Constructor to initialize Member object
     * @param name - the name of member
     * @param constituency - constituency the member belongs  
     */
    
    public Member(String name, String constituency) {
        this.name = name;
        this.constituency = constituency;
    }
    
    /**
     * Returns string representation of member
     * @return string containing name and constituency of member
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Constituency: " + constituency;
    }
}
