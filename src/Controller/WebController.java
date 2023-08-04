package WebNavi.src.Controller;

import WebNavi.src.Service.WebService;

import java.util.Scanner;

public class WebController {
  WebService service = new WebService();
  Scanner sc = new Scanner(System.in);
  boolean result = true;
  public void act() {

    while (true) {
      String str = sc.next();
      switch(str) {
        case "VISIT":
          service.visit();
          break;
        case "BACK":
          service.back();
          break;
        case "FORWARD":
          service.forward();
          break;
        case "QUIT":
          result = false;
        default:
          break;
      }
    }
  }

}
