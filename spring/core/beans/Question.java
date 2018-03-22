package spring.core.beans;

import java.util.Iterator;
import java.util.List;

/*
* Injection with collection
* */
public class Question {
    private int id;
    private String question;
    private List<String> answers;

    public Question(int id, String question, List answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setAnswers(List answers) {
        this.answers = answers;
    }

    public void showDetails() {
        System.out.println(id+" "+question);
        Iterator<String> iterator=answers.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
