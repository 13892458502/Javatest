package user;

import book.BookLists;
import operation.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] iOperations;

    abstract int menu();
    public void doOperation(int choice, BookLists books){
        iOperations[choice].work(books);
    }
}
