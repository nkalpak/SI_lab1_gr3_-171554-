using Item;

class Receipt {
  private List<Item> items;

  public void addItem(Item item) { items.add(item); }

  public double receiptTotal() {
    double total = 0;

    for (Item item : items) total += item.price;

    return total;
  }
}