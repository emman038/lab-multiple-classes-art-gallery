import java.util.ArrayList;

public class Gallery {
  private String name;
  private int till;
  private ArrayList<Artwork> stock;

  public Gallery(String name, int till, ArrayList<Artwork> stock){
   this.name = name;
   this.till = till;
   this.stock = stock;
  }

  public String getName() {
   return this.name;
  }

  public void setName(String name) {
   this.name = name;
  }

  public int getTill() {
   return this.till;
  }

  public void setTill(int till) {
   this.till = till;
  }

  public ArrayList<Artwork> getStock() {
   return this.stock;
  }

  public void setStock(ArrayList<Artwork> stock) {
   this.stock = stock;
  }

}
