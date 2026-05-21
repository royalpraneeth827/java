package Day8;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "Vineeth Royal";
        
        // Length of the string
        System.out.println("Length: " + str.length());
        
        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());
        
        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Check if it contains a substring
        System.out.println("Contains 'World': " + str.contains("World"));
        
        // Replace a substring
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        
        // Get a substring
        System.out.println("Substring (0-5): " + str.substring(0, 5));
    }
}
