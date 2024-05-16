package zakerby.pitchgithubactions.model;

public class ProjectManager extends Person {
    private String projectManagerRole;

    public ProjectManager() {
    }

    public ProjectManager(String givenName, String surname, String projectManagerRole) {
        super(givenName, surname);
        this.projectManagerRole = projectManagerRole;
    }

    public String getProjectManagerRole() {
        return projectManagerRole;
    }

    public void setProjectManagerRole(String projectManagerRole) {
        this.projectManagerRole = projectManagerRole;
    }

    @Override
    public String toString() {
        return super.toString() + " is a project manager with the role " + projectManagerRole;
    }
}