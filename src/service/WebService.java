package WebNavi.src.service;
import WebNavi.src.dao.Data;
import WebNavi.src.singleton.Singleton;

public class WebService {
  Data data = new Data();
  Singleton inst2 = Singleton.getInstance();
  public void visit() {
    String str2 = inst2.sc.next();
    data.back.push(data.status);
    data.status = str2;
    System.out.println(data.status);
    data.forward.clear();
  }

  public void back() {
    if (!data.back.empty()) {
      data.forward.push(data.status);
      data.status = data.back.pop();
      System.out.println(data.status);
    } else {
      System.out.println("Ignored");
    }
  }

  public void forward() {
    if (!data.forward.empty()) {
      data.back.push(data.status);
      data.status = data.forward.pop();
      System.out.println(data.status);
    } else {
      System.out.println("Ignored");
    }
  }
}
