package WebNavi.src.controller;

import WebNavi.src.service.WebService;
import WebNavi.src.singleton.Singleton;

public class WebController {
  WebService service = new WebService();
  Singleton inst1 = Singleton.getInstance();
  boolean result = true;
  public void act() {

    while (result) {
      String str = inst1.sc.next();
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
