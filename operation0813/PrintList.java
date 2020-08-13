package operation;

import book.BookLists;

public class PrintList extends BookLists implements IOperation {
    public void show(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(super.getBook(i));
        }
    }

    @Override
    public void work(BookLists books) {

    }
}
