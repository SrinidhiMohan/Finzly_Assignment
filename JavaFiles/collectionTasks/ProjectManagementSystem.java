package collectionTasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Project {
    private String projectName;
    private String projectDescription;
    private Set<String> teamMembers;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.teamMembers = new HashSet<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public Set<String> getTeamMembers() {
        return teamMembers;
    }

    public void addTeamMember(String teamMember) {
        teamMembers.add(teamMember);
    }
}

public class ProjectManagementSystem {
    private Map<String, Project> projects;

    public ProjectManagementSystem() {
        projects = new HashMap<>();
    }

    public void addProject(String projectName, String projectDescription) {
        Project project = new Project(projectName, projectDescription);
        projects.put(projectName, project);
        System.out.println("Project added successfully.");
    }

    public void assignTeamMember(String projectName, String teamMember) {
        Project project = projects.get(projectName);
        if (project != null) {
            project.addTeamMember(teamMember);
            System.out.println("Team member assigned successfully.");
        } else {
            System.out.println("Project not found.");
        }
    }

    public void viewProjectDetails(String projectName) {
        Project project = projects.get(projectName);
        if (project != null) {
            System.out.println("Project Name: " + project.getProjectName());
            System.out.println("Project Description: " + project.getProjectDescription());
            System.out.println("Team Members: " + project.getTeamMembers());
        } else {
            System.out.println("Project not found.");
        }
    }

    public void listAllProjects() {
        System.out.println("List of Projects:");
        for (Project project : projects.values()) {
            System.out.println("Project Name: " + project.getProjectName());
            System.out.println("Project Description: " + project.getProjectDescription());
            System.out.println("Team Members: " + project.getTeamMembers());
            System.out.println("--------------");
        }
    }

    public static void main(String[] args) {
        ProjectManagementSystem projectSystem = new ProjectManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nProject Management System Menu:");
            System.out.println("1. Add Project");
            System.out.println("2. Assign Team Member");
            System.out.println("3. View Project Details");
            System.out.println("4. List All Projects");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter project name: ");
                    String projectName = scanner.nextLine();
                    System.out.print("Enter project description: ");
                    String projectDescription = scanner.nextLine();
                    projectSystem.addProject(projectName, projectDescription);
                    break;
                case 2:
                    System.out.print("Enter project name: ");
                    String assignProjectName = scanner.nextLine();
                    System.out.print("Enter team member name: ");
                    String teamMember = scanner.nextLine();
                    projectSystem.assignTeamMember(assignProjectName, teamMember);
                    break;
                case 3:
                    System.out.print("Enter project name: ");
                    String viewProjectName = scanner.nextLine();
                    projectSystem.viewProjectDetails(viewProjectName);
                    break;
                case 4:
                    projectSystem.listAllProjects();
                    break;
                case 5:
                	System.out.println("Do you really want to exit ? (y/n)");
    				char ch = scanner.next().charAt(0);
    				
    				if(ch == 'y') {
    					System.out.println("Bye have a good day!");
    					System.exit(0);
    				}else {
    					break;
    				}
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

