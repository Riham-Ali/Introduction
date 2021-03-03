package sortproject;

public class Sort {

    public static void main(String[] args) {
        SortClass s = new SortClass();
        s.initialize();
        System.out.println("Elements Before Sorting");
        s.displayElements();
        
        
        s.sort1();
        System.out.println("Elements After Sorting by sort1 function:");
        s.displayElements();
        System.out.println("---------------------------------");
        System.out.print("github");
        
        s.sort3();
        System.out.println("Elements After Sorting by sort2 function:");
        s.displayElements();
        System.out.println("---------------------------------");
    }
    
}
