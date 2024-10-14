package gla_java;
// This Committe class creates variables: name and chairman.
// Committee class

/**
* Committe class-
* This Committe class creates variables: name and chairman.
*/

public class Committee {
    
    private String name;
    private String chairman;

    /**
     * Constructor to initialize Committee object 
     * @param name - name of committee
     * @param chairman - name of chairman
     */
    
    public Committee(String name, String chairman) {
        this.name=name; 
        this.chairman = chairman;
    }
    
    /**
     * Returns string representation of member
     * @return string containing name and chairman of committee
     */
    @Override
    public String toString() {
        return "Committee: " + name + ", Chairman: " + chairman;
    }
}