class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] c1 = s.toLowerCase().toCharArray();
        char[] c2 = t.toLowerCase().toCharArray();

        bubbleSort(c1);
        bubbleSort(c2);

        return Arrays.equals(c1, c2);
    }

    private void bubbleSort(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
}
}
