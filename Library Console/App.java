import java.util.*;
import java.io.IOException;
import java.lang.*;

// Student  class id, name, no. of books, funct- borrow new book,function return book
//library class total number of book Function +ret - decr return total number of books

class App

{
    public static void main (String args[]) throws IOException
    {        
        int choice=0;
        int counter=0;
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
        Library lib = new Library();
        while (choice != 3)
        {
            
            
            System.out.println("\n1.Student\n2.Library\n3.Exit");
        choice = s.nextInt();

        switch(choice)
        {
            
            case 1:
            
            while (counter==0)
            {
            System.out.println("Please Enter your details");
            System.out.println("Enter your SAP");
            (s1.id) = (s.nextInt());
            System.out.println("Enter your name");
            String string = s.next();
            (s1.name)= string;
            System.out.println("You're response is recorded");
            counter++;
            }
            
            
            int choicein =0; 
           while (choicein !=4)
            { 
                
            System.out.println("##########################");
            System.out.println("\n1.Borrow a Book");
            System.out.println("\n2.Return a Book");
            System.out.println("\n3.Your current details");
            System.out.println("\n4.Go back\n");
            System.out.println("##########################");
            choicein = s.nextInt();
                switch(choicein)
            {
            case 1:
                if ((lib.booksLib)!=0)
                {
                    s1.borrow(s1);
                    lib.borrowed(lib);
                    System.out.println("\nNo.of books with you "+s1.booksStd);
                }
                else 
                {
                    System.out.println("\nNo more books left to borrow");
                }
            break;
            case 2:
                if((s1.booksStd)!=1)
                {
                s1.returnb(s1);
               lib.returned(lib);
               System.out.println("\nNo.of books with you "+ s1.booksStd);
                }
                else{
                    System.out.println("\nYou have returned all your books");
                }
            break;
            case 3:
                System.out.println("Welcome "+s1.name+"!");
                System.out.println("Name: "+s1.name);
                System.out.println("SAP id: "+s1.id);
                System.out.println("\nNo.of books with you "+ s1.booksStd);
            break;    
                
            }
            }
            break;
            case 2:
           
            System.out.println("\nTotal number of books present in the library "+lib.booksLib);

            break;
        }

        }

    }
}