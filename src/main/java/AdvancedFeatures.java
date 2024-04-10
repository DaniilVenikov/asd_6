public class AdvancedFeatures {
    public static boolean isPalyndrome(String string) {
        if (string == null || string.isEmpty()) {
            return true;
        }

        String processedString = string.toLowerCase().replaceAll( " ", "");
        Deque<Character> deque = new Deque<>();

        for (int i = 0; i < processedString.length(); i++) {
            deque.addFront(processedString.charAt(i));
        }

        for (int i = 0; 1 < deque.size(); i++) {
            if(!deque.removeFront().equals(deque.removeTail())) {
                return false;
            };
        }

        return true;
    }
}
