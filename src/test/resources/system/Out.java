package system;

import io.vertx.codetrans.annotations.CodeTranslate;
import io.vertx.codetrans.ControlTest;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class Out {

  @CodeTranslate
  public void println() throws Exception {
    System.out.println("hello");
  }
}
