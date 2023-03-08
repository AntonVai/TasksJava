package org.example.decorator.devDecorator;

public class TeamLeadJavaDeveloper extends DeveloperDecorator{
    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }



    public String makeTeamTask(){
        return "new tasks. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeTeamTask();
    }
}
