//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String MyHouse = "Purple House";
    String[] Houses = new String[]{"Yellow House", "Green House", "Purple House", "Beige House"};
    for (String house : Houses) {
        if (house.equals(MyHouse)) {
            System.out.println("This is my purple house!");
        } else {
            System.out.println("This is not my house!");
        }
    }
}
