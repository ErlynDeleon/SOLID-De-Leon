public class TestProgram {
  public static void main(String[] args) {
    Student student = new Student();
    Resource book = new Book("Dependency Inversion Book");
    Resource journal = new Journal("Object Oriented Programming");

    student.borrowResource(book);
    student.borrowResource(journal);
  }
}
