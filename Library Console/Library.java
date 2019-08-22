class Library
{
    int booksLib=1000;
    static void borrowed(Library x)
    {
        int y;
        y=x.booksLib;
        y--;
        x.booksLib=y;  
    }
    static void returned(Library x)
    {
        int y;
        y=x.booksLib;
        y++;
        x.booksLib=y;  
    }

}