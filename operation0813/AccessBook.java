package operation;

import book.BookLists;

public class AccessBook implements IOperation {

    @Override
    public void work(BookLists books) {

    }
}
//public void access(String name){
//        for (int i = 0; i <3 ; i++) {
//        if(books.getBook(i).getName().equals(name)){
//        System.out.println(books.getBook(i));
//        return;
//        }
//        }
//        System.out.println("未找到您要查找的图书");