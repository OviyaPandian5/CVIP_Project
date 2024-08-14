package Package;

class Portfolio 
{
    private String name;
    private String about;
    private String[] skills;
    private String[] projects;

    public Portfolio(String name, String about, String[] skills, String[] projects) {
        this.name = name;
        this.about = about;
        this.skills = skills;
        this.projects = projects;
    }

    public void display()
    {
        System.out.println("Name: " + name);
        
        System.out.println("About: " + about);
        
        System.out.println("\nSkills:");
        for (String skill : skills)
        {
            System.out.println("--> " + skill);
        }

        System.out.println("\nProjects:");
        for (String project : projects) {
            System.out.println("--> " + project);
        }
    }
}

public class PortfolioGenerator
{
    public static void main(String[] args)
    {
        String name = "George";
        String about = "A Passionate Developer";
        String[] skills = {"Java", "HTML", "CSS", "JavaScript","Python"};
        String[] projects = {"PortFolioCraft","LearnLink","Forecastify"};
        
        Portfolio portfolio = new Portfolio(name, about, skills, projects);
        portfolio.display();
	}
}
