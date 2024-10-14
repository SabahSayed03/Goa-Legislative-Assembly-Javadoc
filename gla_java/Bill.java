package gla_java;
// This Member class creates variable: title and introducedby.
// Bill class

/**
* Bill class-
* This Member class creates variable: title and introducedby.
*/

public class Bill {
    
    private String title;
    private String introducedBy;

    /**
     * Constructor to initialize Bill object 
     * @param title -  the title of the bill
     * @param introducedBy -  who introduced the bill
     */
    
    public Bill(String title, String introducedBy) {
        this.title = title;
        this.introducedBy = introducedBy;
    }
    
    /**
     * Returns string representation of member
     * @return string containing bill and who intoduced bill of the bill
     */
    @Override
    public String toString() {
        return "Bill Title: " + title + ", Introduced By: " + introducedBy;
    }
}
