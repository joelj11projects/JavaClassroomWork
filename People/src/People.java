/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class People {
    
    private final String JobTitle;
    private final int Age;
    private final String Name;
    
    public People(String Name, int Age, String JobTitle){
        this.Name = Name;
        this.Age = Age;
        this.JobTitle = JobTitle;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }
    
    public String toString(){
        
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ");;
        builder.append(Name);
        builder.append(", ");
        builder.append("Age: ");
        builder.append(Age);
        builder.append(", ");
        builder.append("Job Title: ");
        builder.append(JobTitle);
        
        return builder.toString();
    }
    
    
}
