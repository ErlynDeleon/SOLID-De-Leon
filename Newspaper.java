public class Newspaper implements Resource{
  private String title;

  public String getTitle (){
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Newspaper(String title) {
    this.title = title;
}

  @Override
  public void borrow() {
    System.out.println("The student borrowed this newspaper titled " + title + ".");
  }
}
