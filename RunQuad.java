class Quadrilateral {
    public void showDescription() {
        System.out.println("is Quadrilateral");
    }
}


class Rectangle extends Quadrilateral {
    @Override
    public void showDescription() {
       
        super.showDescription();
        System.out.println("has 4 right angles");
    }
}


class Square extends Rectangle {
    @Override
    public void showDescription() {
        
        super.showDescription();
        System.out.println("has 4 equal sides");
    }
}


public class RunQuad {
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        
        System.out.print("Choose 'R' for Rectangle or 'S' for Square: ");
        String choice = scanner.next().toUpperCase();

        if (choice.equals("R")) {
            
            Rectangle rect = new Rectangle();
            rect.showDescription();
        } else if (choice.equals("S")) {
            
            Square sq = new Square();
            sq.showDescription();
        } else {
            System.out.println("Invalid choice. Please choose 'R' or 'S'.");
        }
        
        scanner.close();
    }
}
