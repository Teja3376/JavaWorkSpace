
public interface Books {
  public void bookTitle();
  public default void AllMyBooks() {
	  System.out.println("My Java Books :RAM ");
  }
}
