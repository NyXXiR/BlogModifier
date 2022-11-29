package chap06;

public class Car2 {

  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

  Car2() {}

  public Car2(String model) {
    this.model = model;
  }

  public Car2(String model, String color) {
    // 이런 식으로도 작성가능
    this(model, color, 250);
  }

  public Car2(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;

  }


}
