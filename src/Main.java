public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Михаил", "Булгаков");
        Book book1 = new Book("Война и мир", author1, 1867);
        Book book2 = new Book("Мастер и Маргарита", author2, 1967);
        book2.setPublicationYear(2019);
        System.out.println("Автор: " + author1.getAuthorName() + " " + author1.getAuthorSurname() + "; Произведение: " + book1.getName() + " " + book1.getPublicationYear() + " год.");
        System.out.println("Автор: " + author2.getAuthorName() + " " + author2.getAuthorSurname() + "; Произведение: " + book2.getName() + " " + book2.getPublicationYear() + " год.");
    }
}