class Student
{
    String name = new String();
    int id,booksStd;
    static void borrow(Student x)
    {
        int y;
        y = x.booksStd;
        y++;
        x.booksStd=y++;  
    }

    static void returnb(Student x)
    {
        int y;
        y = x.booksStd;
        
        x.booksStd=--y;  
    }

}