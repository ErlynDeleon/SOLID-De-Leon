public class InternetAccess implements Resource{
  private String name;

  public String getName (){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InternetAccess(String name) {
    this.name = name;
}

  @Override
  public void borrow() {
    System.out.println("The student accessed the internet named " + name + ".");
  }
}
