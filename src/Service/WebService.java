package WebNavi.src.Service;
import WebNavi.src.Model.Data;
import java.util.Scanner;
public class WebService {
  Data data = new Data();
  Scanner sc = new Scanner(System.in);
  public void visit() {
    String str2 = sc.next();
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
