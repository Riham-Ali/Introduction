package sortproject;

public class SortClass {

    final int SIZE = 10;
    Element Data[] = new Element[10];

    public void initialize() {
        String names[] = {"Arwa", "Afnan", "Jamilah", "Hend", "Heba", "Sali", "Yara", "Alia", "Alaa", "Kayan"};
        int IDs[] = {1234, 5436, 7653, 8789, 4134, 8975, 4535, 4525, 9670, 7032};
        for (int i = 0; i < Data.length; i++) {
            Data[i] = new Element(names[i], IDs[i]);
        }
    }

    public void displayElements() {
        for (int i = 0; i < Data.length; i++) {
            Data[i].display();
        }
    }

    public void sort1() {
 // bubble sort
 
        int n = Data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Data[j].getID() > Data[j + 1].getID()) {
                 
                    int idtemp = Data[j].getID();
                    String namtemp = Data[j].getName();
                    
                    Data[j].setID(Data[j + 1].getID());
                    Data[j].setName(Data[j + 1].getName());
                    
                    Data[j + 1].setID(idtemp);
                    Data[j + 1].setName(namtemp);
                    
                }
            }
        }

    }

    public void sort2() {
        //selection sort
        
        int n = Data.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_id = i;
            for (int j = i+1; j < n; j++)
                if (Data[j].getID() < Data[min_id].getID())
                    min_id = j;
 
            // Swap the found minimum element with the firs element
            int idtemp = Data[min_id].getID();
            String namtemp = Data[min_id].getName(); 
            
            Data[min_id].setID(Data[i].getID());
            Data[min_id].setName(Data[i].getName());
            
            
            Data[i].setID(idtemp);
            Data[i].setName(namtemp);
            
            
        }

        
    }

}
