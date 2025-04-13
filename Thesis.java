public class Thesis implements Resource{
  private String title;

  public String getTitle (){
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Thesis(String title) {
    this.title = title;
}

  @Override
  public void borrow() {
    System.out.println("The student borrowed this theses book titled " + title + ".");
  }
}
