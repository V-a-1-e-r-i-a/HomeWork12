public class Book {
    private String name;
    private Author authorName;
    int publicationYear;
    public Book (String name, Author authorName, int publicationYear){
        this.name = name;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthorName(){
        return this.authorName;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
}
