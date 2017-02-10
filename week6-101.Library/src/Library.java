/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Library {
    private ArrayList<Book> library;
    
    public Library(){
     this.library = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        this.library.add(newBook);
    }
    
    public void printBooks(){
        for(Book books:library){
            System.out.println(books);
        }
        
    }
    
    public ArrayList<Book> searchByTitle(String title){
       return searchBook(title,null,-1);
    }
    
    public ArrayList<Book> searchByYear(int year){
       
        return searchBook(null,null,year);
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        
        return searchBook(null,publisher,-1);
    }
    
    //Helper Method
    
    public ArrayList<Book> searchBook(String title,String publisher,int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book books:this.library){
            if (StringUtils.included(books.title(),title)
                    || StringUtils.included(books.publisher(), publisher)
                    || books.year()== year){
                found.add(books);
            }
                
       
        }
         return found;
    }
    
   
}
