package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("Scrum");
        s.add("Java");
        s.add("Jira");
        s.add("selenium");
        s.add("cucumber");
        s.add("postman");
        s.add("Rest Assured");
        for(String list : s){
            System.out.println(list);
        }
    }
}
