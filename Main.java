class Main {
  public static void main(String[] args) {
  int width = Keyboard.getInt("what is the width of the area in slabs?");
  int length = Keyboard.getInt("what is the length of the area in slabs?");
  int area = width * length;
  double cost = Keyboard.getReal("how much does a slab cost?");
  double totalCost = cost * area;
  String output = "the total cost is £" + totalCost;
  Screen.display(output, "overall cost");
  }
}