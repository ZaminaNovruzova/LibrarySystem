public class Main {
    public static void main(String[] args) throws BookNotFound {
        Book book = new Book("sherlock holmes", "artur konan", "124", 40, 10);
        Book book1=new Book("Martin eden","cek london","120",7.9,6);
        BookCenter list = new BookCenter();
        list.add(book);
        list.add(book1);
        System.out.println(book);
        System.out.println(list);
        book1.setQuantity(30);
        System.out.println(list);
        System.out.println(list.searchByAuthor("artur konan"));
        System.out.println(list.searchByAuthor("cek london"));
        System.out.println(list.searchByTitle("Martin eden"));
    }
}
