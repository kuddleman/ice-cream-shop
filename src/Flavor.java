public enum Flavor {
    VANILLA(false, "Vanilla"),
    CHOCOLATE(false, "Chocolate"),
    STRAWBERRY(true, "Strawberry"),
    LEMON(true, "Lemon"),
    PISTACHIO(false, "Pistachio"),
    PEANUT_BUTTER(false, "Peanut Butter");

    // an additional piece of information that I want to associate
      // with each of my category values(above)
    private boolean nutFree;

    // variable for the display version of the enum:
    private String displayFlavor;

    //enum constructors are PRIVATE
    private Flavor(boolean nutFree, String displayFlavor) {
        this.nutFree = nutFree;
        this.displayFlavor = displayFlavor;
    }

    // to access isNutFree, we'll need a getter
    public boolean isNutFree(){
        return this.nutFree;
    }

    // to display the display string, we'll just overrride the toString method:
    @Override
    public String toString(){
       String nutString = nutFree ? "" : " (may contain nuts)";
       return displayFlavor + nutString;
    }




}
