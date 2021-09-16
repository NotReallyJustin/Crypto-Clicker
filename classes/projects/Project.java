package classes.projects;

/**
 * The base template for all projects that could be constructed or initiated.
 * @author Justin
 * @since 9/16/21
 * @category classes.projects
 */
public class Project 
{
    /**
     * Le name of le project
     */
    protected String name;

    /**
     * Kinda self explanatory tbh, but it's a description. Also will be displayed.
     */
    protected String description;

    /**
     * Le cost to unlock/execute the project. It might scale as coins increase. 
     * Fore more accurate cost calculations, you should use calculateCost() method. 
     * But this is just the base cost.
     */
    protected double cost;

    /**
     * The maximum number of times this project could be executed without a single click. 
     * This is to stop autoclickers from exploiting anything.
     */
    protected int maxExec;

    /**
     * Now that we're kinda not doing an APCSA project anymore, we could probably stop doing braindead setter and getter methods
     * But ye, path to image.
     */
    private String image;

    /**
     * Number of times this initiative has been used without resetting
     */
    protected int numClicked;

    /**
     * Constructs the base project.
     * @param name Le name of le project
     * @param desc Le description
     * @param cost Le base cost
     * @param maxExec Le max exec time
     * @param image Le path to le image
     */
    public Project(String name, String desc, double cost, int maxExec, String image)
    {
        this.name = name;
        this.description = desc;
        this.cost = cost;
        this.maxExec = maxExec;
        this.image = image;
        this.numClicked = 0;
    }    

    /**
     * Calculates the cost of the project. 
     * @return The base project cost
     */
    public double calculateCost()
    {
        return this.cost;
    }

    /**
     * @return Whether or not this project initiative will be available.
     */
    public boolean determineDisplay()
    {
        return true;
    }

    /**
     * Accessor method for name
     * @return this.name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Accessor method for desc
     * @return this.description
     */
    public String getDesc()
    {
        return this.description;
    }

    /**
     * Accessor for image
     * @return this.image
     */
    public String getImage()
    {
        return this.image;
    }

    /**
     * Accessor method for cost
     * @return this.cost
     */
    public double getCost()
    {
        return this.cost;
    }

    /**
     * Returns whether or not the user could still click this method
     * @return this.numClicked < this.maxExec
     */
    public boolean canClick()
    {
        return this.numClicked < this.maxExec;
    }

    /**
     * Initiates a project. 
     * This function is meant to be overridden.
     */
    public void initiate() {}
}