public class IceCreamOrder {
    private int numberScoops;
    private Flavor flavor;
    private static final int DEFAULT_NUMBER_SCOOPS = 1;

    // I want to keep track of how many scoops are served across ALL FLAVORS
    // static variables are  normally initialized to some value.
    // To access a static variable, I'll need a getter
    private static int totalNumberScoops = 0;

    public IceCreamOrder(int numberScoops, Flavor flavor) {
        this.numberScoops = numberScoops;
        this.flavor = flavor;

        IceCreamOrder.totalNumberScoops += numberScoops;
    }

    public IceCreamOrder(Flavor flavor) {
        this(DEFAULT_NUMBER_SCOOPS, flavor);
    }

    public int getNumberScoops() {
        return this.numberScoops;
    }

    public Flavor getFlavor() {
        return this.flavor;
    }

    public static int getTotalNumberScoops() {
        return IceCreamOrder.totalNumberScoops;
    }

    @Override
    public String toString(){
        String scoopString = (numberScoops == 1) ? "scoop" : "scoops";
        return numberScoops + " " + scoopString + " of " + flavor;
    }

    public boolean equals(Object obj) {
        // first make sure the obj is an instance of IceCreamOrder
          // if so, then cast it as IceCreamOrder
        if ( obj instanceof IceCreamOrder) {
            IceCreamOrder other = (IceCreamOrder) obj;
            // ****for an ENUM, you can compare values with an ==  OR equals method
            return this.numberScoops == other.numberScoops && this.flavor == (other.flavor);
        } else {
            return false;
        }
    }





}
