//RunQuad that has Parallelogram,Rhombus and Trapezoid.
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
        System.out.println("has equal sides");
    }
}


class Parallelogram extends Quadrilateral {
    @Override
    public void showDescription() {
        
        super.showDescription();
        System.out.println("has 2 pairs of parallel sides");
    }
}


class Rhombus extends Parallelogram {
    @Override
    public void showDescription() {
        
        super.showDescription();
        System.out.println("has 4 congruent sides");
    }
}


class Trapezoid extends Quadrilateral {
    @Override
    public void showDescription() {
        
        super.showDescription();
        System.out.println("has 1 pair of parallel sides");
    }
}


public class RunQuad {
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        
       System.out.println("Select from the following:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");
        System.out.print(": ");
        
        String choice = scanner.next().toUpperCase();

        if (choice.equals("R")) {
           
            Rectangle rect = new Rectangle();
            rect.showDescription();
        } else if (choice.equals("S")) {
            
            Square sq = new Square();
            sq.showDescription();
        } else if (choice.equals("P")) {
            
            Parallelogram para = new Parallelogram();
            para.showDescription();
        } else if (choice.equals("H")) {
            
            Rhombus rhomb = new Rhombus();
            rhomb.showDescription();
        } else if (choice.equals("T")) {
            
            Trapezoid trap = new Trapezoid();
            trap.showDescription();
        } else {
            System.out.println("Invalid choice. Please choose 'R', 'S', 'P', 'H', or 'T'.");
        }
        
        scanner.close();
    }
}
