// Superclass
class HillStations {
    void location() {
        System.out.println("Location of Hill Station");
    }

    void famousFor() {
        System.out.println("Famous for natural beauty");
    }
}

// Subclass 1: Manali
class Manali extends HillStations {
    @Override
    void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }

    @Override
    void famousFor() {
        System.out.println("Manali is famous for adventure sports and scenic beauty.");
    }
}

// Subclass 2: Mussoorie
class Mussoorie extends HillStations {
    @Override
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }

    @Override
    void famousFor() {
        System.out.println("Mussoorie is famous for its waterfalls and colonial heritage.");
    }
}

// Subclass 3: Gulmarg
class Gulmarg extends HillStations {
    @Override
    void location() {
        System.out.println("Gulmarg is located in Jammu & Kashmir");
    }

    @Override
    void famousFor() {
        System.out.println("Gulmarg is famous for skiing and its breathtaking views.");
    }
}

// Main class
public class HillStationDemo {
    public static void main(String[] args) {
        // Calling using superclass reference
        HillStations hill; 
        
        hill = new Manali();
        hill.location();
        hill.famousFor();
        
        System.out.println();
        
        hill = new Mussoorie();
        hill.location();
        hill.famousFor();
        
        System.out.println();
        
        hill = new Gulmarg();
        hill.location();
        hill.famousFor();
        
        System.out.println("\nCalling methods using direct subclass objects:");
        
        // Calling using subclass objects
        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();

        manali.location();
        manali.famousFor();
        
        System.out.println();
        
        mussoorie.location();
        mussoorie.famousFor();
        
        System.out.println();
        
        gulmarg.location();
        gulmarg.famousFor();
    }
}
