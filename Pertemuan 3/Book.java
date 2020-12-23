
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages, String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 0;
        refNumber = ("");
    }

    public String getAuthor()
    {
        return this.author;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public int getPages()
    {
        return this.pages;
    }
    
    public void printDetails()
    {
        System.out.println(author);
        System.out.println(title);
        System.out.println(pages);
        if(refNumber == ("")) {
            System.out.println("zzz");
        }
        else {
            System.out.println(refNumber);
        }
    }
    
    public void setRefNumber(String ref)
    {
        this.refNumber = ref;
    }
}
