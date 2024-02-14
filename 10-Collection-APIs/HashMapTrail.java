import java.util.HashMap;

public class HashMapTrail {
    public static void main(String[] args){
        System.out.println("\nOutput:\n");
        
        HashMap<String, String> stateCapitals = new HashMap<String, String>();


        /* Lets create a 2D array of state and capitals  */
        String[][] capitals = {{"Karnataka", "Bengaluru"}, {"Maharashtra", "Mumbai"}, 
                                {"Gujarat", "Gandhinagar"}, {"Delhi", "New Delhi"}};

        int numRows = capitals.length; 
        // int numCols = capitals[0].length;

        for(int i = 0; i<numRows;i++){
            
            stateCapitals.put(capitals[i][0], capitals[i][1]);
        }

        // stateCapitals.put("Karnataka", "Bengaluru");
        // stateCapitals.put("Maharashtra", "Mumbai");
        // stateCapitals.put("Gujrat", "Gandhinagar");

        /* Printing the whole Hash Map */ 
        System.out.println("\nState Capital Hash Map:\n " + stateCapitals);

        /* Acessing an item  */
        System.out.println("\nCapital of Gujarat is " + stateCapitals.get("Gujarat"));

        /* Removing a key, value pair using the key  */
        stateCapitals.remove("Delhi");
        System.out.println("\nAfter removing Delhi this is the HashMap:\n " + stateCapitals);

        /* Length of the HasMap */
        System.out.println("\nThe no of unique key-value pairs:\n " + stateCapitals.size());

        /* Modifying a value associated with a key */
        stateCapitals.put("Karnataka", "Mangaluru");
        System.out.println("\nAfter modification of a value:\n " + stateCapitals);
        System.out.println(" Modified capital city for Karnataka is now " + stateCapitals.get("Karnataka"));

        System.out.println("\nKeys in the HashMap are:\n  " + stateCapitals.keySet());
        System.out.println("\nValues corresponding to the keys are:\n " + stateCapitals.values());

        /* Printing key:values using for each loop */
        System.out.println("\nStates and their capitals are as follows:");
        for(String key : stateCapitals.keySet()){
            System.out.println(key + " : " + stateCapitals.get(key));
        }


    }
}
