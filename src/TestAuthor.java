public class TestAuthor {
    public static void main(String[] argv){
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor);
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
    }
}