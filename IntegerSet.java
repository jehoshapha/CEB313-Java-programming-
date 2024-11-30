public class IntegerSet {
    // An array of booleans to represent the set of integers from 0 to 100
    private boolean[] set;

    // No-argument constructor initializes the array to the "empty set"
    public IntegerSet() {
        set = new boolean[101]; // Array elements are initialized to false by default
    }

    // Method to insert an element into the set
    public void insertElement(int element) {
        if (element >= 0 && element <= 100) {
            set[element] = true; // Set the corresponding array element to true
        }
    }

    // Method to delete an element from the set
    public void deleteElement(int element) {
        if (element >= 0 && element <= 100) {
            set[element] = false; // Set the corresponding array element to false
        }
    }

    // Method to return the union of two sets
    public IntegerSet union(IntegerSet otherSet) {
        IntegerSet unionSet = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            unionSet.set[i] = this.set[i] || otherSet.set[i];
        }
        return unionSet;
    }

    // Method to return the intersection of two sets
    public IntegerSet intersection(IntegerSet otherSet) {
        IntegerSet intersectionSet = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            intersectionSet.set[i] = this.set[i] && otherSet.set[i];
        }
        return intersectionSet;
    }

    // Method to return a string representation of the set
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{ ");
        for (int i = 0; i <= 100; i++) {
            if (set[i]) {
                result.append(i).append(" ");
            }
        }
        result.append("}");
        return result.toString();
    }

    // Method to determine if two sets are equal
    public boolean isEqualTo(IntegerSet otherSet) {
        for (int i = 0; i <= 100; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method to test the IntegerSet class
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Insert elements into set1 and set2
        set1.insertElement(10);
        set1.insertElement(20);
        set1.insertElement(30);
        set2.insertElement(20);
        set2.insertElement(40);
        set2.insertElement(60);

        // Print the sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union of set1 and set2
        IntegerSet unionSet = set1.union(set2);
        System.out.println("Union of Set 1 and Set 2: " + unionSet);

        // Intersection of set1 and set2
        IntegerSet intersectionSet = set1.intersection(set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectionSet);

        // Check if set1 is equal to set2
        System.out.println("Set 1 is equal to Set 2: " + set1.isEqualTo(set2));
    }
}
