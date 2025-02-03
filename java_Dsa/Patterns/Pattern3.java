class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 0; // Points to the last unique element in the array
        for (int j = 1; j < arr.length; j++) { // Iterate through the array starting from the second element
            if (arr[i] != arr[j]) { // Check if the current element is different from the last unique element
                i++; // Move the unique pointer forward
                arr[i] = arr[j]; // Place the unique element in its correct position
            }
        }
        return i + 1; // The number of unique elements is i+1
    }
}
